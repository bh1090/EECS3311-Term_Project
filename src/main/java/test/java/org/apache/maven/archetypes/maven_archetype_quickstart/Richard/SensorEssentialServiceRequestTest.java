package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.ServiceRequest.SensorEssentialServiceRequest;
import Model.ServiceRequest.ServiceRequest;

public class SensorEssentialServiceRequestTest {

    // test0: constructor sets ID correctly
    @Test
    void test0() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(1, "Leak", "OPEN", 101, 999);
        assertEquals(1, req.getServiceRequestID());
    }

    // test1: constructor sets description correctly
    @Test
    void test1() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(2, "Heater broken", "PENDING", 102, 123);
        assertEquals("Heater broken", req.getDescription());
    }

    // test2: constructor sets status correctly
    @Test
    void test2() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(3, "Window cracked", "IN_PROGRESS", 103, 456);
        assertEquals("IN_PROGRESS", req.getStatus());
    }

    // test3: constructor sets roomID correctly
    @Test
    void test3() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(4, "Door stuck", "OPEN", 104, 321);
        assertEquals(104, req.getRoomID());
    }

    // test4: constructor sets sensorID correctly
    @Test
    void test4() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(5, "Smoke detected", "ALERT", 105, 777);
        assertEquals(777, req.getSensorID());
    }

    // test5: isEssential() always returns true
    @Test
    void test5() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(6, "Gas leak", "CRITICAL", 106, 888);
        assertTrue(req.isEssential());
    }

    // test6: isEssential() is not false
    @Test
    void test6() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(7, "Water leak", "OPEN", 107, 999);
        assertNotEquals(false, req.isEssential());
    }

    // test7: assignRoomID updates the roomID
    @Test
    void test7() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(8, "AC issue", "PENDING", 108, 222);
        req.assignRoomID(200);
        assertEquals(200, req.getRoomID());
    }

    // test8: getServiceRequestID does not return a wrong ID
    @Test
    void test8() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(9, "TV issue", "OPEN", 109, 333);
        assertNotEquals(999, req.getServiceRequestID());
    }

    // test9: object is an instance of ServiceRequest 
    @Test
    void test9() {
        SensorEssentialServiceRequest req =
                new SensorEssentialServiceRequest(10, "Light flickering", "OPEN", 110, 444);
        assertTrue(req instanceof ServiceRequest);
    }
}
