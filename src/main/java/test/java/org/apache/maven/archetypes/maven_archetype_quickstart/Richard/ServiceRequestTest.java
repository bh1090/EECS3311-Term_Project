package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.ServiceRequest.ServiceRequest;

public class ServiceRequestTest {

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

    @Test
    void testConstructorSetsIDCorrectly() {
        ServiceRequest req = new TestServiceRequest(1, "Leak", "OPEN", 101, true);
        assertEquals(1, req.getServiceRequestID());
    }

    @Test
    void testConstructorSetsDescriptionCorrectly() {
        ServiceRequest req = new TestServiceRequest(2, "Heater broken", "PENDING", 102, false);
        assertEquals("Heater broken", req.getDescription());
    }

    @Test
    void testConstructorSetsStatusCorrectly() {
        ServiceRequest req = new TestServiceRequest(3, "Window cracked", "IN_PROGRESS", 103, true);
        assertEquals("IN_PROGRESS", req.getStatus());
    }

    @Test
    void testConstructorSetsRoomIDCorrectly() {
        ServiceRequest req = new TestServiceRequest(4, "Door stuck", "OPEN", 104, false);
        assertEquals(104, req.getRoomID());
    }

    @Test
    void testSetDescriptionUpdatesTheDescription() {
        ServiceRequest req = new TestServiceRequest(5, "Old desc", "OPEN", 105, true);
        req.setDescription("New desc");
        assertEquals("New desc", req.getDescription());
    }

    @Test
    void testSetStatusUpdatesTheStatus() {
        ServiceRequest req = new TestServiceRequest(6, "Anything", "OPEN", 106, false);
        req.setStatus("PENDING");
        assertEquals("PENDING", req.getStatus());
    }

    @Test
    void testSetRoomIDUpdatesTheRoomID() {
        ServiceRequest req = new TestServiceRequest(7, "Something", "OPEN", 107, true);
        req.setRoomID(200);
        assertEquals(200, req.getRoomID());
    }

    @Test
    void testIsEssentialReturnsTrueWhenConstructedAsEssentialTrue() {
        ServiceRequest req = new TestServiceRequest(8, "Test", "OPEN", 108, true);
        assertTrue(req.isEssential());
    }

    @Test
    void testIsEssentialReturnsFalseWhenConstructedAsEssentialFalse() {
        ServiceRequest req = new TestServiceRequest(9, "Test", "OPEN", 109, false);
        assertFalse(req.isEssential());
    }

    @Test
    void testServiceRequestIDIsFinalAndDoesNotChangeAfterConstruction() {
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

