package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.ServiceRequest.NonEssentialServiceRequest;
import Model.ServiceRequest.ServiceRequest;

public class NonEssentialServiceRequestTest {

    // test0: constructor sets ID correctly
    @Test
    void test0() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(1, "Leak", "OPEN", 101);
        assertEquals(1, req.getServiceRequestID());
    }

    // test1: constructor sets description correctly
    @Test
    void test1() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(2, "Heater broken", "PENDING", 102);
        assertEquals("Heater broken", req.getDescription());
    }

    // test2: constructor sets status correctly
    @Test
    void test2() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(3, "Window cracked", "IN_PROGRESS", 103);
        assertEquals("IN_PROGRESS", req.getStatus());
    }

    // test3: constructor sets roomID correctly
    @Test
    void test3() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(4, "Door stuck", "OPEN", 104);
        assertEquals(104, req.getRoomID());
    }

    // test4: isEssential() always returns false
    @Test
    void test4() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(5, "TV issue", "OPEN", 105);
        assertFalse(req.isEssential());
    }

    // test5: isEssential() is not true
    @Test
    void test5() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(6, "Lamp issue", "PENDING", 106);
        assertNotEquals(true, req.isEssential());
    }

    // test6: getServiceRequestID does not return wrong ID
    @Test
    void test6() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(7, "Chair broken", "OPEN", 107);
        assertNotEquals(999, req.getServiceRequestID());
    }

    // test7: description is not some other string
    @Test
    void test7() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(8, "AC issue", "PENDING", 108);
        assertNotEquals("Heater broken", req.getDescription());
    }

    // test8: status is not some other status
    @Test
    void test8() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(9, "Table broken", "RESOLVED", 109);
        assertNotEquals("OPEN", req.getStatus());
    }

    // test9: object is an instance of ServiceRequest (superclass)
    @Test
    void test9() {
        NonEssentialServiceRequest req =
                new NonEssentialServiceRequest(10, "Light flickering", "OPEN", 110);
        assertTrue(req instanceof ServiceRequest);
    }
}


