package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Repository.ServiceRequestRepository;
import Service.EditMaintenanceRequestService;

public class EditMaintenanceRequestServiceTest {

    @BeforeEach
    void resetSingleton() throws Exception {
        // Reset the static instance so we hit the "instance == null" branch at least once
        Field instanceField = EditMaintenanceRequestService.class.getDeclaredField("instance");
        instanceField.setAccessible(true);
        instanceField.set(null, null);
    }

    // test0: getInstance returns non-null
    @Test
    void test0() {
        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();
        assertNotNull(service);
    }

    // test1: getInstance returns the same singleton instance
    @Test
    void test1() {
        EditMaintenanceRequestService s1 = EditMaintenanceRequestService.getInstance();
        EditMaintenanceRequestService s2 = EditMaintenanceRequestService.getInstance();
        assertSame(s1, s2);
    }

    // test2: update(...) with isEssential = true (EssentialServiceRequest branch) does not throw
    @Test
    void test2() {
        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            service.update(1, "Essential desc", "To-do", true, 101);
        });
    }

    // test3: update(...) with isEssential = false (NonEssentialServiceRequest branch) does not throw
    @Test
    void test3() {
        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            service.update(2, "Nonessential desc", "In Progress", false, 102);
        });
    }

    // test4: promoteServiceRequest(...) with sensorId != "-1" (SensorEssentialServiceRequest branch) does not throw
    @Test
    void test4() {
        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            service.promoteServiceRequest(3, "Promote with sensor", "To-do", 103, "5");
        });
    }

    // test5: promoteServiceRequest(...) with sensorId = "-1" (EssentialServiceRequest branch) does not throw
    @Test
    void test5() {
        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            service.promoteServiceRequest(4, "Promote no sensor", "To-do", 104, "-1");
        });
    }

    // test6: multiple updates for same room / different flags still do not throw
    @Test
    void test6() {
        EditMaintenanceRequestService service = EditMaintenanceRequestService.getInstance();

        assertDoesNotThrow(() -> {
            service.update(5, "A", "To-do", true, 200);
            service.update(6, "B", "In Progress", false, 200);
            service.promoteServiceRequest(5, "A promoted", "To-do", 200, "7");
        });
    }

    // test7: constructing with explicit ServiceRequestRepository instance works and update() does not throw
    @Test
    void test7() {
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        EditMaintenanceRequestService service = new EditMaintenanceRequestService(repo);

        assertDoesNotThrow(() -> {
            service.update(7, "Explicit repo essential", "To-do", true, 300);
        });
    }

    // test8: constructing with explicit ServiceRequestRepository instance works and promoteServiceRequest() does not throw
    @Test
    void test8() {
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        EditMaintenanceRequestService service = new EditMaintenanceRequestService(repo);

        assertDoesNotThrow(() -> {
            service.promoteServiceRequest(8, "Explicit repo promote", "To-do", 301, "-1");
        });
    }

    // test9: singleton and manually constructed instance can both be used without errors
    @Test
    void test9() {
        EditMaintenanceRequestService singleton = EditMaintenanceRequestService.getInstance();
        ServiceRequestRepository repo = ServiceRequestRepository.getInstance();
        EditMaintenanceRequestService manual = new EditMaintenanceRequestService(repo);

        assertNotNull(singleton);
        assertNotNull(manual);

        assertDoesNotThrow(() -> {
            singleton.update(9, "Singleton update", "To-do", true, 400);
            manual.update(10, "Manual update", "To-do", false, 401);
            singleton.promoteServiceRequest(9, "Singleton promote", "To-do", 400, "3");
            manual.promoteServiceRequest(10, "Manual promote", "To-do", 401, "-1");
        });
    }
}
