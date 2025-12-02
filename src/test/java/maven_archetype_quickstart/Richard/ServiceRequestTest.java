package maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.ServiceRequest.ServiceRequest;

public class ServiceRequestTest {

    // Simple concrete subclass so we can instantiate ServiceRequest
    static class TestServiceRequest extends ServiceRequest {
        private final boolean essential;

        public TestServiceRequest(int id, String description, String status, int roomID, boolean essential) {
            super(id, description, status, roomID);
            this.essential = essential;
        }

        @Override
        public boolean isEssential() {
            return essential;
        }
    }

    // test0: constructor sets ID correctly
    @Test
    void test0() {
        ServiceRequest req = new TestServiceRequest(1, "Leak", "OPEN", 101, true);
        assertEquals(1, req.getServiceRequestID());
    }

    // test1: constructor sets description correctly
    @Test
    void test1() {
        ServiceRequest req = new TestServiceRequest(2, "Heater broken", "PENDING", 102, false);
        assertEquals("Heater broken", req.getDescription());
    }

    // test2: constructor sets status correctly
    @Test
    void test2() {
        ServiceRequest req = new TestServiceRequest(3, "Window cracked", "IN_PROGRESS", 103, true);
        assertEquals("IN_PROGRESS", req.getStatus());
    }

    // test3: constructor sets roomID correctly
    @Test
    void test3() {
        ServiceRequest req = new TestServiceRequest(4, "Door stuck", "OPEN", 104, false);
        assertEquals(104, req.getRoomID());
    }

    // test4: setDescription updates the description
    @Test
    void test4() {
        ServiceRequest req = new TestServiceRequest(5, "Old desc", "OPEN", 105, true);
        req.setDescription("New desc");
        assertEquals("New desc", req.getDescription());
    }

    // test5: setStatus updates the status
    @Test
    void test5() {
        ServiceRequest req = new TestServiceRequest(6, "Anything", "OPEN", 106, false);
        req.setStatus("PENDING");
        assertEquals("PENDING", req.getStatus());
    }

    // test6: setRoomID updates the roomID
    @Test
    void test6() {
        ServiceRequest req = new TestServiceRequest(7, "Something", "OPEN", 107, true);
        req.setRoomID(200);
        assertEquals(200, req.getRoomID());
    }

    // test7: isEssential returns true when constructed as essential = true
    @Test
    void test7() {
        ServiceRequest req = new TestServiceRequest(8, "Test", "OPEN", 108, true);
        assertTrue(req.isEssential());
    }

    // test8: isEssential returns false when constructed as essential = false
    @Test
    void test8() {
        ServiceRequest req = new TestServiceRequest(9, "Test", "OPEN", 109, false);
        assertFalse(req.isEssential());
    }

    // test9: serviceRequestID is final and doesn't change after construction
    @Test
    void test9() {
        ServiceRequest req = new TestServiceRequest(10, "Test", "OPEN", 110, true);
        int idBefore = req.getServiceRequestID();
        req.setRoomID(999);
        req.setStatus("CHANGED");
        req.setDescription("Changed desc");
        int idAfter = req.getServiceRequestID();
        assertEquals(idBefore, idAfter);
        assertEquals(10, idAfter);
    }
}

