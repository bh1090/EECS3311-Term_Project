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
import Service.EditMaintenanceRequestService;
import Service.EvaluateRoomMaintenanceRelationshipService;

public class EditMaintenanceRequestServiceTest {

    @BeforeEach
    void resetSingletonsAndRepo() throws Exception {
        // Reset EditMaintenanceRequestService singleton
        Field instanceField = EditMaintenanceRequestService.class.getDeclaredField("instance");
        instanceField.setAccessible(true);
        instanceField.set(null, null);

        // Reset EvaluateRoomMaintenanceRelationshipService singleton (optional, for clean state)
        try {
            Field evalField = EvaluateRoomMaintenanceRelationshipService.class.getDeclaredField("instance");
            evalField.setAccessible(true);
            evalField.set(null, null);
        } catch (NoSuchFieldException ignored) {
        }

        // Ensure ServiceRequestRepository has a fresh, empty map
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        mapField.set(repo, new HashMap<Integer, List<ServiceRequest>>());
    }

    /** Helper to get the internal map from the repository. */
    @SuppressWarnings("unchecked")
    private Map<Integer, List<ServiceRequest>> getInternalMap() throws Exception {
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        Field mapField = ServiceRequestRepository.class.getDeclaredField("serviceRequestMap");
        mapField.setAccessible(true);
        return (Map<Integer, List<ServiceRequest>>) mapField.get(repo);
    }

    // test0: getInstance returns non-null
    @Test
    void test0() {
        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();
        assertNotNull(service);
    }

    // test1: getInstance returns the same singleton instance
    @Test
    void test1() {
        EditMaintenanceRequestService s1 = EditMaintenanceRequestService.getInstance();
        EditMaintenanceRequestService s2 = EditMaintenanceRequestService.getInstance();
        assertSame(s1, s2);
    }

    // test2: update(...) with isEssential = true replaces existing request with EssentialServiceRequest
    @Test
    void test2() throws Exception {
        int roomID = 1;
        int requestID = 10;

        // Preload repo with a non-essential request we will replace
        Map<Integer, List<ServiceRequest>> map = getInternalMap();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new NonEssentialServiceRequest(requestID, "Old desc", "OLD", roomID));
        map.put(roomID, list);

        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();
        service.update(requestID, "New essential desc", "To-do", true, roomID);

        List<ServiceRequest> updatedList = getInternalMap().get(roomID);
        assertEquals(1, updatedList.size());
        ServiceRequest req = updatedList.get(0);

        assertTrue(req instanceof EssentialServiceRequest);
        assertEquals("New essential desc", req.getDescription());
        assertEquals("To-do", req.getStatus());
        assertEquals(roomID, req.getRoomID());
    }

    // test3: update(...) with isEssential = false replaces existing request with NonEssentialServiceRequest
    @Test
    void test3() throws Exception {
        int roomID = 2;
        int requestID = 20;

        Map<Integer, List<ServiceRequest>> map = getInternalMap();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new EssentialServiceRequest(requestID, "Old essential", "OLD", roomID));
        map.put(roomID, list);

        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();
        service.update(requestID, "New nonessential desc", "In Progress", false, roomID);

        List<ServiceRequest> updatedList = getInternalMap().get(roomID);
        assertEquals(1, updatedList.size());
        ServiceRequest req = updatedList.get(0);

        assertTrue(req instanceof NonEssentialServiceRequest);
        assertEquals("New nonessential desc", req.getDescription());
        assertEquals("In Progress", req.getStatus());
    }

    // test4: promoteServiceRequest(...) with sensorId != "-1" -> SensorEssentialServiceRequest
    @Test
    void test4() throws Exception {
        int roomID = 3;
        int requestID = 30;

        Map<Integer, List<ServiceRequest>> map = getInternalMap();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new NonEssentialServiceRequest(requestID, "Old nonessential", "OLD", roomID));
        map.put(roomID, list);

        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();
        service.promoteServiceRequest(requestID, "Promoted with sensor", "To-do", roomID, "5");

        List<ServiceRequest> updatedList = getInternalMap().get(roomID);
        assertEquals(1, updatedList.size());
        ServiceRequest req = updatedList.get(0);

        assertTrue(req instanceof SensorEssentialServiceRequest);
        SensorEssentialServiceRequest sensorReq = (SensorEssentialServiceRequest) req;
        assertEquals(5, sensorReq.getSensorID());
        assertEquals("Promoted with sensor", sensorReq.getDescription());
    }

    // test5: promoteServiceRequest(...) with sensorId = "-1" -> EssentialServiceRequest
    @Test
    void test5() throws Exception {
        int roomID = 4;
        int requestID = 40;

        Map<Integer, List<ServiceRequest>> map = getInternalMap();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new NonEssentialServiceRequest(requestID, "Old nonessential", "OLD", roomID));
        map.put(roomID, list);

        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();
        service.promoteServiceRequest(requestID, "Promoted no sensor", "To-do", roomID, "-1");

        List<ServiceRequest> updatedList = getInternalMap().get(roomID);
        assertEquals(1, updatedList.size());
        ServiceRequest req = updatedList.get(0);

        assertTrue(req instanceof EssentialServiceRequest);
        assertEquals("Promoted no sensor", req.getDescription());
        assertEquals("To-do", req.getStatus());
    }

    // test6: update(...) with non-existing ID should not change existing list
    @Test
    void test6() throws Exception {
        int roomID = 5;

        Map<Integer, List<ServiceRequest>> map = getInternalMap();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new NonEssentialServiceRequest(50, "Only one", "OPEN", roomID));
        map.put(roomID, list);

        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();
        // ID 999 does not exist
        service.update(999, "Should not apply", "To-do", true, roomID);

        List<ServiceRequest> updatedList = getInternalMap().get(roomID);
        assertEquals(1, updatedList.size());
        assertEquals("Only one", updatedList.get(0).getDescription());
        assertEquals("OPEN", updatedList.get(0).getStatus());
        assertTrue(updatedList.get(0) instanceof NonEssentialServiceRequest);
    }

    // test7: construct with explicit repository instance & update essential branch
    @Test
    void test7() throws Exception {
        int roomID = 6;
        int requestID = 60;

        Map<Integer, List<ServiceRequest>> map = getInternalMap();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new NonEssentialServiceRequest(requestID, "Old", "OLD", roomID));
        map.put(roomID, list);

        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        EditMaintenanceRequestService service = new EditMaintenanceRequestService(repo);

        service.update(requestID, "Manual repo essential", "To-do", true, roomID);

        List<ServiceRequest> updatedList = getInternalMap().get(roomID);
        assertEquals(1, updatedList.size());
        assertTrue(updatedList.get(0) instanceof EssentialServiceRequest);
        assertEquals("Manual repo essential", updatedList.get(0).getDescription());
    }

    // test8: construct with explicit repository instance & promote with sensorId != "-1"
    @Test
    void test8() throws Exception {
        int roomID = 7;
        int requestID = 70;

        Map<Integer, List<ServiceRequest>> map = getInternalMap();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new NonEssentialServiceRequest(requestID, "Old", "OLD", roomID));
        map.put(roomID, list);

        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        EditMaintenanceRequestService service = new EditMaintenanceRequestService(repo);

        service.promoteServiceRequest(requestID, "Manual repo promote", "To-do", roomID, "9");

        List<ServiceRequest> updatedList = getInternalMap().get(roomID);
        assertEquals(1, updatedList.size());
        assertTrue(updatedList.get(0) instanceof SensorEssentialServiceRequest);
        assertEquals("Manual repo promote", updatedList.get(0).getDescription());
    }

    // test9: multiple updates and promotions for same room & different IDs do not throw
    @Test
    void test9() throws Exception {
        int roomID = 8;

        Map<Integer, List<ServiceRequest>> map = getInternalMap();
        List<ServiceRequest> list = new ArrayList<>();
        list.add(new NonEssentialServiceRequest(80, "R1", "OPEN", roomID));
        list.add(new EssentialServiceRequest(81, "R2", "OPEN", roomID));
        map.put(roomID, list);

        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            service.update(80, "R1 updated", "In Progress", false, roomID);
            service.update(81, "R2 updated", "To-do", true, roomID);
            service.promoteServiceRequest(80, "R1 promoted", "To-do", roomID, "3");
            service.promoteServiceRequest(81, "R2 promoted", "To-do", roomID, "-1");
        });

        List<ServiceRequest> updatedList = getInternalMap().get(roomID);
        assertEquals(2, updatedList.size());
    }
}
