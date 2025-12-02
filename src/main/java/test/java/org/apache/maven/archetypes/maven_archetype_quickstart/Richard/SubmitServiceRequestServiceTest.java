package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;


import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.ServiceRequest.EssentialServiceRequest;
import Model.ServiceRequest.NonEssentialServiceRequest;
import Model.ServiceRequest.SensorEssentialServiceRequest;
import Model.ServiceRequest.ServiceRequest;
import Repository.ServiceRequestRepository;
import Service.SubmitServiceRequestService;


public class SubmitServiceRequestServiceTest {

    @BeforeEach
    void resetSingletonsAndRepo() throws Exception {
        Field instanceField = SubmitServiceRequestService.class.getDeclaredField("instance");
        instanceField.setAccessible(true);
        instanceField.set(null, null);

        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        mapField.set(repo, new HashMap<Integer, List<ServiceRequest>>());
    }

    private void ensureRoomListExists(int roomID) throws Exception {
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        @SuppressWarnings("unchecked")
        Map<Integer, List<ServiceRequest>> map =
                (Map<Integer, List<ServiceRequest>>) mapField.get(repo);
        map.computeIfAbsent(roomID, k -> new ArrayList<>());
    }

    // test0: getInstance returns non-null
    @Test
    void testGetInstanceIsNotNull() {
        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();
        assertNotNull(service);
    }

    // test1: getInstance returns same singleton
    @Test
    void testGetInstanceReturnsSameSingleton() {
        SubmitServiceRequestService s1 = SubmitServiceRequestService.getInstance();
        SubmitServiceRequestService s2 = SubmitServiceRequestService.getInstance();
        assertSame(s1, s2);
    }

    // test2: essential & sensorId = "-1" -> EssentialServiceRequest stored
    @Test
    void testEssentialNoSensor() throws Exception {
        int roomID = 101;
        ensureRoomListExists(roomID);

        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();
        var result = service.submitServiceRequest(roomID, "Essential no sensor", true, "-1");

        assertNotNull(result);
        assertTrue(result.isEmpty()); // method always returns empty list

        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        ArrayList<ServiceRequest> stored = repo.loadAllServiceRequestsForRoom(roomID);
        assertEquals(1, stored.size());
        assertTrue(stored.get(0) instanceof EssentialServiceRequest);
        assertEquals("Essential no sensor", stored.get(0).getDescription());
        assertEquals("To-do", stored.get(0).getStatus());
    }

    // test3: essential & sensorId != "-1" -> SensorEssentialServiceRequest stored
    @Test
    void testEssentialWithSensor() throws Exception {
        int roomID = 102;
        ensureRoomListExists(roomID);

        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();
        service.submitServiceRequest(roomID, "Essential with sensor", true, "5");

        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        ArrayList<ServiceRequest> stored = repo.loadAllServiceRequestsForRoom(roomID);
        assertEquals(1, stored.size());
        assertTrue(stored.get(0) instanceof SensorEssentialServiceRequest);

        SensorEssentialServiceRequest req = (SensorEssentialServiceRequest) stored.get(0);
        assertEquals(5, req.getSensorID());
        assertEquals("To-do", req.getStatus());
        assertEquals("Essential with sensor", req.getDescription());
    }

    // test4: non-essential -> NonEssentialServiceRequest stored
    @Test
    void testNonEssential() throws Exception {
        int roomID = 103;
        ensureRoomListExists(roomID);

        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();
        service.submitServiceRequest(roomID, "Nonessential request", false, "-1");

        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        ArrayList<ServiceRequest> stored = repo.loadAllServiceRequestsForRoom(roomID);
        assertEquals(1, stored.size());
        assertTrue(stored.get(0) instanceof NonEssentialServiceRequest);
        assertEquals("Nonessential request", stored.get(0).getDescription());
        assertEquals("To-do", stored.get(0).getStatus());
    }

    // test5: IDs generated increment for same roomID
    @Test
    void testIdsGeneratedIncrementForSameRoomID() throws Exception {
        int roomID = 200;
        ensureRoomListExists(roomID);

        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();
        service.submitServiceRequest(roomID, "First", true, "-1");
        service.submitServiceRequest(roomID, "Second", false, "-1");

        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        ArrayList<ServiceRequest> stored = repo.loadAllServiceRequestsForRoom(roomID);
        assertEquals(2, stored.size());

        int id1 = stored.get(0).getServiceRequestID();
        int id2 = stored.get(1).getServiceRequestID();

        assertEquals(1, id1);
        assertEquals(2, id2);
    }

    // test6: non-essential with non "-1" sensorId still goes through non-essential branch
    @Test
    void testNonEssentialWithSensorString() throws Exception {
        int roomID = 300;
        ensureRoomListExists(roomID);

        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();
        service.submitServiceRequest(roomID, "Nonessential with sensor string", false, "99");

        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        ArrayList<ServiceRequest> stored = repo.loadAllServiceRequestsForRoom(roomID);
        assertEquals(1, stored.size());
        assertTrue(stored.get(0) instanceof NonEssentialServiceRequest);
    }

    // test7: multiple mixed submissions for same room
    @Test
    void testMultipleMixedSubmissionsForSameRoom() throws Exception {
        int roomID = 400;
        ensureRoomListExists(roomID);

        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();
        service.submitServiceRequest(roomID, "E1", true, "-1");
        service.submitServiceRequest(roomID, "E2", true, "10");
        service.submitServiceRequest(roomID, "N1", false, "-1");

        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        ArrayList<ServiceRequest> stored = repo.loadAllServiceRequestsForRoom(roomID);
        assertEquals(3, stored.size());
        assertTrue(stored.stream().anyMatch(r -> r instanceof EssentialServiceRequest));
        assertTrue(stored.stream().anyMatch(r -> r instanceof SensorEssentialServiceRequest));
        assertTrue(stored.stream().anyMatch(r -> r instanceof NonEssentialServiceRequest));
    }

    // test8: return value is always a non-null, empty list
    @Test
    void testReturnValueIsAlwaysNonNullEmptyList() throws Exception {
        int roomID = 500;
        ensureRoomListExists(roomID);

        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();
        var result = service.submitServiceRequest(roomID, "Check return", true, "-1");

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    // test9: works when room already has existing requests with high IDs
    @Test
    void testWorksWhenRoomAlreadyHasExistingRequestsWithHighIDs() throws Exception {
        int roomID = 600;
        ensureRoomListExists(roomID);

        // Pre-populate map with an existing request ID 10
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        @SuppressWarnings("unchecked")
        Map<Integer, List<ServiceRequest>> map =
                (Map<Integer, List<ServiceRequest>>) mapField.get(repo);

        List<ServiceRequest> existingList = new ArrayList<>();
        existingList.add(new NonEssentialServiceRequest(10, "Existing", "OLD", roomID));
        map.put(roomID, existingList);

        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();
        service.submitServiceRequest(roomID, "After existing", true, "-1");

        ArrayList<ServiceRequest> stored = repo.loadAllServiceRequestsForRoom(roomID);
        assertEquals(2, stored.size());

        // New ID should be 11
        int newId = stored.stream()
                          .map(ServiceRequest::getServiceRequestID)
                          .max(Integer::compareTo)
                          .orElse(0);
        assertEquals(11, newId);
    }
}