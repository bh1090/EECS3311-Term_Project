package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.ServiceRequest.SensorEssentialServiceRequest;
import Model.ServiceRequest.ServiceRequest;

public class SensorEssentialServiceRequestTest {

    @Test
    void testConstructorSetsIDCorrectly() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(1, "Leak", "OPEN", 101, 999);
        assertEquals(1, req.getServiceRequestID());
    }

    @Test
    void testConstructorSetsDescriptionCorrectly() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(2, "Heater broken", "PENDING", 102, 123);
        assertEquals("Heater broken", req.getDescription());
    }

    @Test
    void testConstructorSetsStatusCorrectly() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(3, "Window cracked", "IN_PROGRESS", 103, 456);
        assertEquals("IN_PROGRESS", req.getStatus());
    }

    @Test
    void testConstructorSetsRoomIDCorrectly() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(4, "Door stuck", "OPEN", 104, 321);
        assertEquals(104, req.getRoomID());
    }

    @Test
    void testConstructorSetsSensorIDCorrectly() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(5, "Smoke detected", "ALERT", 105, 777);
        assertEquals(777, req.getSensorID());
    }

    @Test
    void testIsEssentialAlwaysReturnsTrue() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(6, "Gas leak", "CRITICAL", 106, 888);
        assertTrue(req.isEssential());
    }

    @Test
    void testIsEssentialIsNotFalse() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(7, "Water leak", "OPEN", 107, 999);
        assertNotEquals(false, req.isEssential());
    }

    @Test
    void testAssignRoomIDUpdatesRoomID() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(8, "AC issue", "PENDING", 108, 222);
        req.assignRoomID(200);
        assertEquals(200, req.getRoomID());
    }

    @Test
    void testGetServiceRequestIDDoesNotReturnWrongID() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(9, "TV issue", "OPEN", 109, 333);
        assertNotEquals(999, req.getServiceRequestID());
    }

    @Test
    void testObjectIsInstanceOfServiceRequest() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(10, "Light flickering", "OPEN", 110, 444);
        assertTrue(req instanceof ServiceRequest);
    }
}
