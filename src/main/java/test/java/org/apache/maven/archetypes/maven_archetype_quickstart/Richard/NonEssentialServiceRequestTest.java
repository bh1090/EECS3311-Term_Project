package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.ServiceRequest.NonEssentialServiceRequest;
import Model.ServiceRequest.ServiceRequest;

public class NonEssentialServiceRequestTest {

    @Test
    void testConstructorSetsIDCorrectly() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(1, "Leak", "OPEN", 101);
        assertEquals(1, req.getServiceRequestID());
    }

    @Test
    void testConstructorSetsDescriptionCorrectly() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(2, "Heater broken", "PENDING", 102);
        assertEquals("Heater broken", req.getDescription());
    }

    @Test
    void testConstructorSetsStatusCorrectly() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(3, "Window cracked", "IN_PROGRESS", 103);
        assertEquals("IN_PROGRESS", req.getStatus());
    }

    @Test
    void testConstructorSetsRoomIDCorrectly() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(4, "Door stuck", "OPEN", 104);
        assertEquals(104, req.getRoomID());
    }

    @Test
    void testIsEssentialAlwaysReturnsFalse() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(5, "TV issue", "OPEN", 105);
        assertFalse(req.isEssential());
    }

    @Test
    void testIsEssentialIsNotTrue() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(6, "Lamp issue", "PENDING", 106);
        assertNotEquals(true, req.isEssential());
    }

    @Test
    void testGetServiceRequestIDDoesNotReturnWrongID() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(7, "Chair broken", "OPEN", 107);
        assertNotEquals(999, req.getServiceRequestID());
    }

    @Test
    void testDescriptionIsNotSomeOtherString() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(8, "AC issue", "PENDING", 108);
        assertNotEquals("Heater broken", req.getDescription());
    }

    @Test
    void testStatusIsNotSomeOtherStatus() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(9, "Table broken", "RESOLVED", 109);
        assertNotEquals("OPEN", req.getStatus());
    }

    @Test
    void testObjectIsInstanceOfServiceRequest() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(10, "Light flickering", "OPEN", 110);
        assertTrue(req instanceof ServiceRequest);
    }
}


