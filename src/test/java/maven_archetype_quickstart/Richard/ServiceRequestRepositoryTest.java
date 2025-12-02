package maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.ServiceRequest.EssentialServiceRequest;
import Model.ServiceRequest.NonEssentialServiceRequest;
import Model.ServiceRequest.SensorEssentialServiceRequest;
import Model.ServiceRequest.ServiceRequest;
import Repository.ServiceRequestRepository;

public class ServiceRequestRepositoryTest {

    // Simple fake request we can fully control
    static class FakeServiceRequest extends ServiceRequest {
        private final boolean essential;

        public FakeServiceRequest(int id, String desc, String status, int roomId, boolean essential) {
            super(id, desc, status, roomId);
            this.essential = essential;
        }

        @Override
        public boolean isEssential() {
            return essential;
        }
    }

    @BeforeEach
    void resetSingleton() throws Exception {
        Field instanceField = ServiceRequestRepository.class.getDeclaredField("instance");
        instanceField.setAccessible(true);
        instanceField.set(null, null);
    }

    private ServiceRequestRepository getFreshRepoWithEmptyMap() throws Exception {
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        mapField.set(repo, new HashMap<Integer, List<ServiceRequest>>());
        return repo;
    }

    // test0: getInstance returns non-null
    @Test
    void test0() {
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        assertNotNull(repo);
    }

    // test1: getInstance returns the same singleton
    @Test
    void test1() {
        ServiceRequestRepository r1 = ServiceRequestRepository.getInstance();
        ServiceRequestRepository r2 = ServiceRequestRepository.getInstance();
        assertSame(r1, r2);
    }

    // test2: addServiceRequest adds into internal map and returns same object
    @Test
    void test2() throws Exception {
        ServiceRequestRepository repo = getFreshRepoWithEmptyMap();

        FakeServiceRequest req = new FakeServiceRequest(1, "Leak", "OPEN", 101, false);
        ServiceRequest returned = repo.addServiceRequest(req);

        assertSame(req, returned);

        ArrayList<ServiceRequest> loaded = repo.loadAllServiceRequestsForRoom(101);
        assertEquals(1, loaded.size());
        assertSame(req, loaded.get(0));
    }

    // test3: updateExistingServiceRequest replaces matching request
    @Test
    void test3() throws Exception {
        ServiceRequestRepository repo = getFreshRepoWithEmptyMap();

        // Manually populate map for room 200
        Map<Integer, List<ServiceRequest>> map = new HashMap<>();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(10, "Old desc", "OPEN", 200, true));
        map.put(200, list);

        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        mapField.set(repo, map);

        // New request with same ID but updated description
        FakeServiceRequest updated = new FakeServiceRequest(10, "New desc", "OPEN", 200, true);
        repo.updateExistingServiceRequest(updated);

        ArrayList<ServiceRequest> loaded = repo.loadAllServiceRequestsForRoom(200);
        assertEquals(1, loaded.size());
        assertEquals("New desc", loaded.get(0).getDescription());
    }

    // test4: updateExistingServiceRequest with no matching ID leaves list unchanged
    @Test
    void test4() throws Exception {
        ServiceRequestRepository repo = getFreshRepoWithEmptyMap();

        Map<Integer, List<ServiceRequest>> map = new HashMap<>();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(20, "Only one", "OPEN", 300, false));
        map.put(300, list);

        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        mapField.set(repo, map);

        FakeServiceRequest updated = new FakeServiceRequest(999, "Should not replace", "OPEN", 300, false);
        repo.updateExistingServiceRequest(updated);

        ArrayList<ServiceRequest> loaded = repo.loadAllServiceRequestsForRoom(300);
        assertEquals(1, loaded.size());
        assertEquals("Only one", loaded.get(0).getDescription());
    }

    // test5: loadAllServiceRequestsForRoom returns a copy, not the internal list
    @Test
    void test5() throws Exception {
        ServiceRequestRepository repo = getFreshRepoWithEmptyMap();

        Map<Integer, List<ServiceRequest>> map = new HashMap<>();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(30, "Req1", "OPEN", 400, true));
        list.add(new FakeServiceRequest(31, "Req2", "OPEN", 400, false));
        map.put(400, list);

        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        mapField.set(repo, map);

        ArrayList<ServiceRequest> loaded1 = repo.loadAllServiceRequestsForRoom(400);
        assertEquals(2, loaded1.size());

        // Modify returned list
        loaded1.clear();

        // Load again; should still have 2
        ArrayList<ServiceRequest> loaded2 = repo.loadAllServiceRequestsForRoom(400);
        assertEquals(2, loaded2.size());
    }

    // test6: generateNextId returns maxId + 1 for given room
    @Test
    void test6() throws Exception {
        ServiceRequestRepository repo = getFreshRepoWithEmptyMap();

        Map<Integer, List<ServiceRequest>> map = new HashMap<>();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(1, "A", "OPEN", 500, true));
        list.add(new FakeServiceRequest(3, "B", "OPEN", 500, true));
        list.add(new FakeServiceRequest(2, "C", "OPEN", 500, false));
        map.put(500, list);

        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        mapField.set(repo, map);

        Integer nextId = repo.generateNextId(500);
        assertEquals(4, nextId);
    }

    // test7: parseCsvFileToMap builds correct subclasses and map structure
    @Test
    void test7() throws Exception {
        // Create temp CSV file
        File temp = File.createTempFile("servicereq_parse", ".csv");
        temp.deleteOnExit();

        try (PrintWriter pw = new PrintWriter(temp)) {
            pw.println("requestId,roomId,isEssential,status,description,sensorID");
            // Non-essential
            pw.println("1,10,Nonessential,OPEN,Nonessential req,-1");
            // Essential with sensorID = -1 -> EssentialServiceRequest
            pw.println("2,20,Essential,PENDING,Essential no sensor,-1");
            // Essential with sensorID != -1 -> SensorEssentialServiceRequest
            pw.println("3,30,Essential,ALERT,Essential with sensor,5");
        }

        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        Map<Integer, List<ServiceRequest>> map = repo.parseCsvFileToMap(temp.getAbsolutePath(), false);

        assertNotNull(map);

        // Room 10 -> NonEssentialServiceRequest
        List<ServiceRequest> room10 = map.get(10);
        assertEquals(1, room10.size());
        assertTrue(room10.get(0) instanceof NonEssentialServiceRequest);

        // Room 20 -> EssentialServiceRequest
        List<ServiceRequest> room20 = map.get(20);
        assertEquals(1, room20.size());
        assertTrue(room20.get(0) instanceof EssentialServiceRequest);

        // Room 30 -> SensorEssentialServiceRequest, with roomID and sensorID set
        List<ServiceRequest> room30 = map.get(30);
        assertEquals(1, room30.size());
        assertTrue(room30.get(0) instanceof SensorEssentialServiceRequest);
        SensorEssentialServiceRequest ser = (SensorEssentialServiceRequest) room30.get(0);
        assertEquals(30, ser.getRoomID());
        assertEquals(5, ser.getSensorID());
    }

    // test8: saveMapToCsv writes a non-empty file with both essential and non-essential
    @Test
    void test8() throws Exception {
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();

        // Build a small map with both types
        Map<Integer, List<ServiceRequest>> map = new HashMap<>();

        List<ServiceRequest> list100 = new ArrayList<>();
        list100.add(new NonEssentialServiceRequest(1, "Nonessential desc", "OPEN", 100));
        map.put(100, list100);

        List<ServiceRequest> list200 = new ArrayList<>();
        list200.add(new EssentialServiceRequest(2, "Essential desc", "PENDING", 200));
        list200.add(new SensorEssentialServiceRequest(3, "Sensor essential", "ALERT", 200, 9));
        map.put(200, list200);

        File temp = File.createTempFile("servicereq_save", ".csv");
        temp.deleteOnExit();

        boolean saved = repo.saveMapToCsv(map, temp.getAbsolutePath());
        assertTrue(saved);
        assertTrue(temp.exists());
        assertTrue(temp.length() > 0);

        // Optional: check header present
        String content = String.join("\n", Files.readAllLines(Paths.get(temp.getAbsolutePath())));
        assertTrue(content.contains("requestId,roomId,isEssential,status,description,sensorID"));
    }

    // test9: loadAllServiceRequestsForRoom for room with no entries returns empty list, not null
    @Test
    void test9() throws Exception {
        ServiceRequestRepository repo = getFreshRepoWithEmptyMap();

        ArrayList<ServiceRequest> result = repo.loadAllServiceRequestsForRoom(9999);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}

