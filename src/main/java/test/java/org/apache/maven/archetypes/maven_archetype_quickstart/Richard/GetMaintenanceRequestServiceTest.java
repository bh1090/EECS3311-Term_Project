package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.ServiceRequest.ServiceRequest;
import Repository.ServiceRequestRepository;
import Service.GetMaintenanceRequestService;

public class GetMaintenanceRequestServiceTest {

    // Fake ServiceRequest with configurable essential flag
    static class FakeServiceRequest extends ServiceRequest {
        private final boolean essential;

        public FakeServiceRequest(int id, String description, String status, int roomID, boolean essential) {
            super(id, description, status, roomID);
            this.essential = essential;
        }

        @Override
        public boolean isEssential() {
            return essential;
        }
    }

    @BeforeEach
    void setup() throws Exception {
        // Reset GetMaintenanceRequestService singleton
        Field svcInstance = GetMaintenanceRequestService.class.getDeclaredField("instance");
        svcInstance.setAccessible(true);
        svcInstance.set(null, null);

        // Overwrite the internal map of ServiceRequestRepository so tests don't depend on CSV/DB
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        mapField.set(repo, new HashMap<Integer, List<ServiceRequest>>());
    }

    private void putRoomRequests(int roomID, List<ServiceRequest> requests) throws Exception {
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        @SuppressWarnings("unchecked")
        Map<Integer, List<ServiceRequest>> map =
                (Map<Integer, List<ServiceRequest>>) mapField.get(repo);
        map.put(roomID, requests);
    }

    // test0: getInstance returns non-null
    @Test
    void test0() {
        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();
        assertNotNull(service);
    }

    // test1: getInstance returns same singleton instance
    @Test
    void test1() {
        GetMaintenanceRequestService s1 = GetMaintenanceRequestService.getInstance();
        GetMaintenanceRequestService s2 = GetMaintenanceRequestService.getInstance();
        assertSame(s1, s2);
    }

    // test2: empty repository -> empty result for essential = true
    @Test
    void test2() {
        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> result = service.getServiceRequests(1, true);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    // test3: empty repository -> empty result for essential = false
    @Test
    void test3() {
        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> result = service.getServiceRequests(1, false);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    // test4: one essential request, filter with isEssential = true
    @Test
    void test4() throws Exception {
        ArrayList<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(1, "Leak", "OPEN", 10, true));
        putRoomRequests(10, list);

        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> result = service.getServiceRequests(10, true);

        assertEquals(1, result.size());
        assertTrue(result.get(0).isEssential());
    }

    // test5: one essential request, filter with isEssential = false -> empty
    @Test
    void test5() throws Exception {
        ArrayList<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(2, "Broken window", "PENDING", 11, true));
        putRoomRequests(11, list);

        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> result = service.getServiceRequests(11, false);

        assertTrue(result.isEmpty());
    }

    // test6: mix of essential and non-essential, filter essential
    @Test
    void test6() throws Exception {
        ArrayList<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(3, "AC issue", "OPEN", 12, true));
        list.add(new FakeServiceRequest(4, "TV issue", "OPEN", 12, false));
        putRoomRequests(12, list);

        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> essentials = service.getServiceRequests(12, true);

        assertEquals(1, essentials.size());
        assertTrue(essentials.get(0).isEssential());
        assertEquals(3, essentials.get(0).getServiceRequestID());
    }

    // test7: mix of essential and non-essential, filter non-essential
    @Test
    void test7() throws Exception {
        ArrayList<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(5, "Door stuck", "OPEN", 13, true));
        list.add(new FakeServiceRequest(6, "Lamp broken", "OPEN", 13, false));
        putRoomRequests(13, list);

        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> nonEssentials = service.getServiceRequests(13, false);

        assertEquals(1, nonEssentials.size());
        assertFalse(nonEssentials.get(0).isEssential());
        assertEquals(6, nonEssentials.get(0).getServiceRequestID());
    }

    // test8: different roomID should not see requests from another room
    @Test
    void test8() throws Exception {
        ArrayList<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(7, "Heater issue", "OPEN", 20, true));
        putRoomRequests(20, list);

        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> result = service.getServiceRequests(21, true);
        assertTrue(result.isEmpty());
    }

    // test9: calling getServiceRequests multiple times for same roomID works and is deterministic
    @Test
    void test9() throws Exception {
        ArrayList<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(8, "Fan issue", "OPEN", 30, true));
        list.add(new FakeServiceRequest(9, "Light issue", "OPEN", 30, false));
        putRoomRequests(30, list);

        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> first = service.getServiceRequests(30, true);
        ArrayList<ServiceRequest> second = service.getServiceRequests(30, true);

        assertEquals(1, first.size());
        assertEquals(1, second.size());
        assertEquals(first.get(0).getServiceRequestID(), second.get(0).getServiceRequestID());
    }
}
