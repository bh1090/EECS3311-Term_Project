package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.ServiceRequest.EssentialServiceRequest;
import Model.ServiceRequest.ServiceRequest;

public class EssentialServiceRequestTest {

    @Test
    void testIsIDSetCorrectly() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(1, "Leak", "OPEN", 101);
        assertEquals(1, req.getServiceRequestID());
    }

    @Test
    void testIsDescriptionSetCorrectly() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(2, "Heater broken", "PENDING", 102);
        assertEquals("Heater broken", req.getDescription());
    }

    @Test
    void testIsStatusSetCorrectly() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(3, "Window cracked", "IN_PROGRESS", 103);
        assertEquals("IN_PROGRESS", req.getStatus());
    }

    @Test
    void testIsRoomIDSetCorrectly() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(4, "Door stuck", "OPEN", 104);
        assertEquals(104, req.getRoomID());
    }

    @Test
    void test4() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(5, "Smoke detected", "ALERT", 105);
        assertTrue(req.isEssential());
    }

    @Test
    void test5() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(6, "Gas leak", "CRITICAL", 106);
        assertNotEquals(false, req.isEssential());
    }

    @Test
    void test6() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(7, "Water leak", "OPEN", 107);
        assertNotEquals(999, req.getServiceRequestID());
    }

    @Test
    void test7() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(8, "AC issue", "PENDING", 108);
        assertNotEquals("Heater broken", req.getDescription());
    }

    @Test
    void test8() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(9, "Broken table", "RESOLVED", 109);
        assertNotEquals("OPEN", req.getStatus());
    }

    @Test
    void test9() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(10, "Light flickering", "OPEN", 110);
        assertTrue(req instanceof ServiceRequest);
    }
}
