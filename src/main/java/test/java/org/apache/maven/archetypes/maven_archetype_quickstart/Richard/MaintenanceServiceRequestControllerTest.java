package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Controller.MaintenanceServiceRequestController;

public class MaintenanceServiceRequestControllerTest {

    @BeforeEach
    void resetSingleton() throws Exception {
        Field instanceField = MaintenanceServiceRequestController.class.getDeclaredField("instance");
        instanceField.setAccessible(true);
        instanceField.set(null, null);
    }

    @Test
    void testGetInstanceReturnsNonNull() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        assertNotNull(controller);
    }

    @Test
    void testGetInstanceReturnsSameSingleton() {
        MaintenanceServiceRequestController c1 =
                MaintenanceServiceRequestController.getInstance();
        MaintenanceServiceRequestController c2 =
                MaintenanceServiceRequestController.getInstance();
        assertSame(c1, c2);
    }

    @Test
    void testSetRoomIDAndHandleServiceRequestListCompilationDoNotThrow() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        controller.setRoomID(1);

        assertDoesNotThrow(() -> {
            controller.handleServiceRequestListCompilation();
        });
    }

    @Test
    void testHandleServiceRequestListCompilationWorksWithAnotherRoomID() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        controller.setRoomID(2);

        assertDoesNotThrow(() -> {
            controller.handleServiceRequestListCompilation();
        });
    }

    @Test
    void testUpdateMaintenanceRequestStatusDoesNotThrow() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        controller.setRoomID(10);

        assertDoesNotThrow(() -> {
            controller.updateMaintenanceRequestStatus(100, "To-Do", "Fix AC");
        });
    }

    @Test
    void testUpdateMaintenanceRequestStatusWithDifferentStatusDescriptionDoesNotThrow() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        controller.setRoomID(20);

        assertDoesNotThrow(() -> {
            controller.updateMaintenanceRequestStatus(200, "In Progress", "Fix heater");
        });
    }

    @Test
    void testHandleServiceRequestListCompilationWithoutSettingRoomID() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();

        assertDoesNotThrow(() -> {
            controller.handleServiceRequestListCompilation();
        });
    }

    @Test
    void testMultipleCallsStillUseSameSingleton() {
        MaintenanceServiceRequestController c1 =
                MaintenanceServiceRequestController.getInstance();
        c1.setRoomID(5);

        assertDoesNotThrow(() -> {
            c1.handleServiceRequestListCompilation();
            c1.updateMaintenanceRequestStatus(300, "Completed", "Close ticket");
        });

        MaintenanceServiceRequestController c2 =
                MaintenanceServiceRequestController.getInstance();
        assertSame(c1, c2);
    }

    @Test
    void testMainMethodRunsWithoutThrowing() {
        assertDoesNotThrow(() -> {
            MaintenanceServiceRequestController.main(new String[]{});
        });
    }

    @Test
    void testGetInstanceStillWorksAfterMainHasBeenCalled() {
        MaintenanceServiceRequestController.main(new String[]{});

        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        assertNotNull(controller);
    }
}
