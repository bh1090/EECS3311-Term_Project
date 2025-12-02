package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import Controller.AdminServiceRequestController;

public class AdminServiceRequestControllerTest {

    @Test
    void testWhetherControllerIsNull() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        assertNotNull(controller);
    }

    @Test
    void testWhetherSingletonInstanceIsSame() {
        AdminServiceRequestController c1 = AdminServiceRequestController.getInstance();
        AdminServiceRequestController c2 = AdminServiceRequestController.getInstance();
        assertSame(c1, c2);
    }

    @Test
    void testConvertSensorIdWithNA() throws Exception {
        Method m = AdminServiceRequestController.class
                .getDeclaredMethod("convertSensorId", String.class);
        m.setAccessible(true);
        String result = (String) m.invoke(null, "N/A");
        assertEquals("-1", result);
    }

    @Test
    void testConvertSensorIdWithNormalId() throws Exception {
        Method m = AdminServiceRequestController.class
                .getDeclaredMethod("convertSensorId", String.class);
        m.setAccessible(true);
        String result = (String) m.invoke(null, "SENSOR_123");
        assertEquals("SENSOR_123", result);
    }

    @Test
    void testHandleServiceRequestListCompilationDoesNotThrow() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        controller.setRoomID(1);

        assertDoesNotThrow(() -> {
            controller.handleServiceRequestListCompilation();
        });
    }

    @Test
    void testHandleAddEssentialServiceRequestToRoomThatDoesNotExist() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        controller.setRoomID(2);

        assertThrows(Exception.class, () -> {
            controller.handleAddServiceRequest("Leaky faucet", true, "-1");
        });
    }

    @Test
    void testHandleAddNonEssentialServiceRequestToRoomThatDoesNotExist() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        controller.setRoomID(3);

        assertThrows(Exception.class, () -> {
            controller.handleAddServiceRequest("Broken window", false, "-1");
        });
    }

    @Test
    void testPromoteServiceRequestThatDoesNotExistAndHasSensor() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        controller.setRoomID(4);

        assertThrows(Exception.class, () -> {
            controller.promoteServiceRequest(101, "Fix AC", "100");
        });
    }

    @Test
    void testPromoteServiceRequestThatDoesNotExistAndHasNoSensor() {
        AdminServiceRequestController controller = AdminServiceRequestController.getInstance();
        controller.setRoomID(5);

        assertThrows(Exception.class, () -> {
            controller.promoteServiceRequest(202, "Fix heater", "-1");
        });
    }

    @Test
    void testMainMethodRunsWithoutThrowing() {
        assertDoesNotThrow(() -> {
            AdminServiceRequestController.main(new String[]{});
        });
    }
}
