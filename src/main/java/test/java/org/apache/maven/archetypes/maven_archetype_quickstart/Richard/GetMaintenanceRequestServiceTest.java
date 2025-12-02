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
        Field svcInstance = GetMaintenanceRequestService.class.getDeclaredField("instance");
        svcInstance.setAccessible(true);
        svcInstance.set(null, null);

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

    @Test
    void testGetInstanceReturnsNonNull() {
        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();
        assertNotNull(service);
    }

    @Test
    void testGetInstanceReturnsSameSingleton() {
        GetMaintenanceRequestService s1 = GetMaintenanceRequestService.getInstance();
        GetMaintenanceRequestService s2 = GetMaintenanceRequestService.getInstance();
        assertSame(s1, s2);
    }

    @Test
    void testGetServiceRequestsReturnsEmptyForEssentialTrueWhenRepositoryEmpty() {
        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> result = service.getServiceRequests(1, true);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetServiceRequestsReturnsEmptyForEssentialFalseWhenRepositoryEmpty() {
        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> result = service.getServiceRequests(1, false);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetServiceRequestsReturnsOneEssentialWhenFilteredForEssential() throws Exception {
        ArrayList<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(1, "Leak", "OPEN", 10, true));
        putRoomRequests(10, list);

        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> result = service.getServiceRequests(10, true);

        assertEquals(1, result.size());
        assertTrue(result.get(0).isEssential());
    }

    @Test
    void testGetServiceRequestsReturnsEmptyForEssentialFalseWhenOneEssentialExists() throws Exception {
        ArrayList<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(2, "Broken window", "PENDING", 11, true));
        putRoomRequests(11, list);

        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> result = service.getServiceRequests(11, false);

        assertTrue(result.isEmpty());
    }

    @Test
    void testGetServiceRequestsReturnsOnlyEssentialWhenFilteredForEssential() throws Exception {
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

    @Test
    void testGetServiceRequestsReturnsOnlyNonEssentialWhenFilteredForNonEssential() throws Exception {
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

    @Test
    void testGetServiceRequestsReturnsEmptyForDifferentRoomID() throws Exception {
        ArrayList<ServiceRequest> list = new ArrayList<>();
        list.add(new FakeServiceRequest(7, "Heater issue", "OPEN", 20, true));
        putRoomRequests(20, list);

        GetMaintenanceRequestService service = GetMaintenanceRequestService.getInstance();

        ArrayList<ServiceRequest> result = service.getServiceRequests(21, true);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGetServiceRequestsIsDeterministicForSameRoomID() throws Exception {
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
