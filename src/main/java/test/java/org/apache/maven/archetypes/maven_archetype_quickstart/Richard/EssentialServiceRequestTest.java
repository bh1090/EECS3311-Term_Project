package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.ServiceRequest.EssentialServiceRequest;
import Model.ServiceRequest.ServiceRequest;

public class EssentialServiceRequestTest {

    // test0: constructor sets ID correctly
    @Test
    void test0() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(1, "Leak", "OPEN", 101);
        assertEquals(1, req.getServiceRequestID());
    }

    // test1: constructor sets description correctly
    @Test
    void test1() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(2, "Heater broken", "PENDING", 102);
        assertEquals("Heater broken", req.getDescription());
    }

    // test2: constructor sets status correctly
    @Test
    void test2() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(3, "Window cracked", "IN_PROGRESS", 103);
        assertEquals("IN_PROGRESS", req.getStatus());
    }

    // test3: constructor sets roomID correctly
    @Test
    void test3() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(4, "Door stuck", "OPEN", 104);
        assertEquals(104, req.getRoomID());
    }

    // test4: isEssential() always returns true
    @Test
    void test4() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(5, "Smoke detected", "ALERT", 105);
        assertTrue(req.isEssential());
    }

    // test5: isEssential() is not false
    @Test
    void test5() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(6, "Gas leak", "CRITICAL", 106);
        assertNotEquals(false, req.isEssential());
    }

    // test6: getServiceRequestID does not return wrong ID
    @Test
    void test6() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(7, "Water leak", "OPEN", 107);
        assertNotEquals(999, req.getServiceRequestID());
    }

    // test7: description is not some other string
    @Test
    void test7() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(8, "AC issue", "PENDING", 108);
        assertNotEquals("Heater broken", req.getDescription());
    }

    // test8: status is not some other status
    @Test
    void test8() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(9, "Broken table", "RESOLVED", 109);
        assertNotEquals("OPEN", req.getStatus());
    }

    // test9: object is an instance of ServiceRequest (superclass)
    @Test
    void test9() {
        EssentialServiceRequest req =
                new EssentialServiceRequest(10, "Light flickering", "OPEN", 110);
        assertTrue(req instanceof ServiceRequest);
    }
}
