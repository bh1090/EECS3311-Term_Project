package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Service.SubmitServiceRequestService;

public class SubmitServiceRequestServiceTest {

    @BeforeEach
    void resetSingleton() throws Exception {
        // Reset the static instance so first getInstance() call goes through the "instance == null" branch
        Field instanceField = SubmitServiceRequestService.class.getDeclaredField("instance");
        instanceField.setAccessible(true);
        instanceField.set(null, null);
    }

    // test0: getInstance returns non-null
    @Test
    void test0() {
        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();
        assertNotNull(service);
    }

    // test1: getInstance returns same singleton instance
    @Test
    void test1() {
        SubmitServiceRequestService s1 = SubmitServiceRequestService.getInstance();
        SubmitServiceRequestService s2 = SubmitServiceRequestService.getInstance();
        assertSame(s1, s2);
    }

    // test2: essential request with sensorId = "-1" (EssentialServiceRequest branch) does not throw
    @Test
    void test2() {
        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            var result = service.submitServiceRequest(101, "Essential no sensor", true, "-1");
            assertNotNull(result);
            assertTrue(result.isEmpty()); // method always returns empty list
        });
    }

    // test3: essential request with sensorId != "-1" (SensorEssentialServiceRequest branch) does not throw
    @Test
    void test3() {
        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            var result = service.submitServiceRequest(102, "Essential with sensor", true, "5");
            assertNotNull(result);
            assertEquals(0, result.size());
        });
    }

    // test4: non-essential request (NonEssentialServiceRequest branch) does not throw
    @Test
    void test4() {
        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            var result = service.submitServiceRequest(103, "Nonessential request", false, "-1");
            assertNotNull(result);
            assertTrue(result.isEmpty());
        });
    }

    // test5: multiple calls for same roomID and different flags still do not throw
    @Test
    void test5() {
        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            service.submitServiceRequest(200, "Req1", true, "-1");
            service.submitServiceRequest(200, "Req2", true, "10");
            service.submitServiceRequest(200, "Req3", false, "-1");
        });
    }

    // test6: submitting for different roomIDs works without errors
    @Test
    void test6() {
        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            service.submitServiceRequest(300, "Room 300 req", true, "-1");
            service.submitServiceRequest(301, "Room 301 req", false, "-1");
        });
    }

    // test7: calling submitServiceRequest via multiple getInstance() calls still uses same singleton
    @Test
    void test7() {
        SubmitServiceRequestService s1 = SubmitServiceRequestService.getInstance();
        SubmitServiceRequestService s2 = SubmitServiceRequestService.getInstance();

        assertSame(s1, s2);

        assertDoesNotThrow(() -> {
            s1.submitServiceRequest(400, "Test via s1", true, "-1");
            s2.submitServiceRequest(400, "Test via s2", false, "-1");
        });
    }

    // test8: weird but valid sensorId string (still essential branch, second if) does not throw
    @Test
    void test8() {
        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            // still parses as int, goes through SensorEssentialServiceRequest branch
            var result = service.submitServiceRequest(500, "Weird sensor string", true, "42");
            assertNotNull(result);
            assertEquals(0, result.size());
        });
    }

    // test9: non-essential with non "-1" sensorId still goes through non-essential branch and doesn't throw
    @Test
    void test9() {
        SubmitServiceRequestService service = SubmitServiceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            var result = service.submitServiceRequest(600, "Nonessential with sensor string", false, "99");
            assertNotNull(result);
            assertTrue(result.isEmpty());
        });
    }
}
