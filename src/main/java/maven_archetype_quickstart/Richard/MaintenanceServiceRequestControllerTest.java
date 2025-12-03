package maven_archetype_quickstart.Richard;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Controller.MaintenanceServiceRequestController;

public class MaintenanceServiceRequestControllerTest {

    @BeforeEach
    void resetSingleton() throws Exception {
        // Reset the static instance so each test starts from a clean state
        Field instanceField = MaintenanceServiceRequestController.class.getDeclaredField("instance");
        instanceField.setAccessible(true);
        instanceField.set(null, null);
    }

    // test0: getInstance returns non-null
    @Test
    void test0() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        assertNotNull(controller);
    }

    // test1: getInstance returns the same singleton instance
    @Test
    void test1() {
        MaintenanceServiceRequestController c1 =
                MaintenanceServiceRequestController.getInstance();
        MaintenanceServiceRequestController c2 =
                MaintenanceServiceRequestController.getInstance();
        assertSame(c1, c2);
    }

    // test2: setRoomID + handleServiceRequestListCompilation do not throw
    @Test
    void test2() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        controller.setRoomID(1);

        assertDoesNotThrow(() -> {
            controller.handleServiceRequestListCompilation();
        });
    }

    // test3: handleServiceRequestListCompilation works with another roomID
    @Test
    void test3() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        controller.setRoomID(2);

        assertDoesNotThrow(() -> {
            controller.handleServiceRequestListCompilation();
        });
    }

    // test4: updateMaintenanceRequestStatus does not throw
    @Test
    void test4() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        controller.setRoomID(10);

        assertDoesNotThrow(() -> {
            controller.updateMaintenanceRequestStatus(100, "To-Do", "Fix AC");
        });
    }

    // test5: updateMaintenanceRequestStatus with different status/description
    @Test
    void test5() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        controller.setRoomID(20);

        assertDoesNotThrow(() -> {
            controller.updateMaintenanceRequestStatus(200, "In Progress", "Fix heater");
        });
    }

    // test6: handleServiceRequestListCompilation without setting roomID explicitly (default 0)
    @Test
    void test6() {
        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();

        assertDoesNotThrow(() -> {
            controller.handleServiceRequestListCompilation();
        });
    }

    // test7: multiple calls still use same singleton
    @Test
    void test7() {
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

    // test8: main method runs without throwing
    // If this causes GUI issues in your environment, you can comment out this test.
    @Test
    void test8() {
        assertDoesNotThrow(() -> {
            MaintenanceServiceRequestController.main(new String[]{});
        });
    }

    // test9: getInstance still works after main has been called
    @Test
    void test9() {
        // simulate main having been run once
        MaintenanceServiceRequestController.main(new String[]{});

        MaintenanceServiceRequestController controller =
                MaintenanceServiceRequestController.getInstance();
        assertNotNull(controller);
    }
}
