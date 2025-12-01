package maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import Repository.ServiceRequestRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Controller.AdminServiceRequestController;

public class AdminServiceRequestControllerTest {
     @BeforeEach
     void initRepository() {
          ServiceRequestRepository.getInstance();
     }
    // test0: getInstance returns non-null
    @Test
    void test0() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        assertNotNull(controller);
    }

    // test1: getInstance returns same singleton instance
    @Test
    void test1() {
        AdminServiceRequestController c1 = AdminServiceRequestController.getInstance();
        AdminServiceRequestController c2 = AdminServiceRequestController.getInstance();
        assertSame(c1, c2);
    }

    // test2: convertSensorId("N/A") -> "-1"
    @Test
    void test2() throws Exception {
        Method m = AdminServiceRequestController.class
                .getDeclaredMethod("convertSensorId", String.class);
        m.setAccessible(true);
        String result = (String) m.invoke(null, "N/A");
        assertEquals("-1", result);
    }

    // test3: convertSensorId for normal ID returns same value
    @Test
    void test3() throws Exception {
        Method m = AdminServiceRequestController.class
                .getDeclaredMethod("convertSensorId", String.class);
        m.setAccessible(true);
        String result = (String) m.invoke(null, "SENSOR_123");
        assertEquals("SENSOR_123", result);
    }

    // test4: setRoomID + handleServiceRequestListCompilation do not throw
    @Test
    void test4() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        controller.setRoomID(1);

        assertDoesNotThrow(() -> {
            controller.handleServiceRequestListCompilation();
        });
    }

    // test5: handleAddServiceRequest with normal sensorId does not throw
    @Test
    void test5() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        controller.setRoomID(2);

        assertDoesNotThrow(() -> {
            controller.handleAddServiceRequest("Leaky faucet", true, "S123");
        });
    }

    // test6: handleAddServiceRequest with "N/A" sensorId does not throw
    @Test
    void test6() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        controller.setRoomID(3);

        assertDoesNotThrow(() -> {
            controller.handleAddServiceRequest("Broken window", false, "N/A");
        });
    }

    // test7: promoteServiceRequest with normal sensorId does not throw
    @Test
    void test7() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        controller.setRoomID(4);

        assertDoesNotThrow(() -> {
            controller.promoteServiceRequest(101, "Fix AC", "S999");
        });
    }

    // test8: promoteServiceRequest with "N/A" sensorId does not throw
    @Test
    void test8() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        controller.setRoomID(5);

        assertDoesNotThrow(() -> {
            controller.promoteServiceRequest(202, "Fix heater", "N/A");
        });
    }

    // test9: main method runs without throwing
    @Test
    void test9() {
        assertDoesNotThrow(() -> {
            AdminServiceRequestController.main(new String[]{});
        });
    }
}
