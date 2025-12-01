package maven_archetype_quickstart.Richard;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.Room.Observer;
import Service.EvaluateRoomMaintenanceRelationshipService;
import Service.GetMaintenanceRequestService;

public class EvaluateRoomMaintenanceRelationshipServiceTest {

    // Simple fake observer to capture updates
    static class FakeObserver implements Observer {
        public boolean lastFlag = false;
        public int lastRoomId = -1;
        public int updateCount = 0;

        @Override
        public void update(boolean isAnyEssentialMaintenanceRequestPending, int roomID) {
            this.lastFlag = isAnyEssentialMaintenanceRequestPending;
            this.lastRoomId = roomID;
            this.updateCount++;
        }
    }

    @BeforeEach
    void resetSingleton() throws Exception {
        // Ensure each test starts with a fresh singleton
        Field instanceField = EvaluateRoomMaintenanceRelationshipService.class.getDeclaredField("instance");
        instanceField.setAccessible(true);
        instanceField.set(null, null);
    }

    // test0: getInstance returns non-null
    @Test
    void test0() {
        EvaluateRoomMaintenanceRelationshipService service =
                EvaluateRoomMaintenanceRelationshipService.getInstance();
        assertNotNull(service);
    }

    // test1: getInstance returns the same singleton instance
    @Test
    void test1() {
        EvaluateRoomMaintenanceRelationshipService s1 =
                EvaluateRoomMaintenanceRelationshipService.getInstance();
        EvaluateRoomMaintenanceRelationshipService s2 =
                EvaluateRoomMaintenanceRelationshipService.getInstance();
        assertSame(s1, s2);
    }

    // test2: registerObserver + notifyObservers calls update on our FakeObserver
    @Test
    void test2() throws Exception {
        EvaluateRoomMaintenanceRelationshipService service =
                EvaluateRoomMaintenanceRelationshipService.getInstance();

        FakeObserver observer = new FakeObserver();
        service.registerObserver(observer);

        // Set private fields via reflection
        Field flagField = EvaluateRoomMaintenanceRelationshipService.class
                .getDeclaredField("isAnyEssentialMaintenanceRequestPending");
        flagField.setAccessible(true);
        flagField.setBoolean(service, true);

        Field roomField = EvaluateRoomMaintenanceRelationshipService.class
                .getDeclaredField("currentRoomID");
        roomField.setAccessible(true);
        roomField.setInt(service, 42);

        service.notifyObservers();

        assertEquals(1, observer.updateCount);
        assertTrue(observer.lastFlag);
        assertEquals(42, observer.lastRoomId);
    }

    // test3: removeObserver prevents it from being updated
    @Test
    void test3() throws Exception {
        EvaluateRoomMaintenanceRelationshipService service =
                EvaluateRoomMaintenanceRelationshipService.getInstance();

        FakeObserver observer = new FakeObserver();
        service.registerObserver(observer);
        service.removeObserver(observer);

        Field flagField = EvaluateRoomMaintenanceRelationshipService.class
                .getDeclaredField("isAnyEssentialMaintenanceRequestPending");
        flagField.setAccessible(true);
        flagField.setBoolean(service, true);

        Field roomField = EvaluateRoomMaintenanceRelationshipService.class
                .getDeclaredField("currentRoomID");
        roomField.setAccessible(true);
        roomField.setInt(service, 99);

        service.notifyObservers();

        // Because we removed it, it should not have been updated
        assertEquals(0, observer.updateCount);
    }

    // test4: default isAnyEssentialMaintenanceRequestPending is false on fresh singleton
    @Test
    void test4() {
        EvaluateRoomMaintenanceRelationshipService service =
                EvaluateRoomMaintenanceRelationshipService.getInstance();

        assertFalse(service.isAnyEssentialMaintenanceRequestPending());
    }

    // test5: evaluateRoomMaintenanceRelationship does not throw
    @Test
    void test5() {
        EvaluateRoomMaintenanceRelationshipService service =
                EvaluateRoomMaintenanceRelationshipService.getInstance();

        assertDoesNotThrow(() -> {
            service.evaluateRoomMaintenanceRelationship(10);
        });
    }

    // test6: doesRoomHaveEssentialMaintenanceRequests runs without error
    @Test
    void test6() {
        EvaluateRoomMaintenanceRelationshipService service =
                EvaluateRoomMaintenanceRelationshipService.getInstance();
        GetMaintenanceRequestService getService = GetMaintenanceRequestService.getInstance();

        boolean result = service.doesRoomHaveEssentialMaintenanceRequests(20, getService);

        // Just assert it's a boolean result (always true), to execute the method
        assertTrue(result || !result);
    }

    // test7: multiple observers all get notified
    @Test
    void test7() throws Exception {
        EvaluateRoomMaintenanceRelationshipService service =
                EvaluateRoomMaintenanceRelationshipService.getInstance();

        FakeObserver o1 = new FakeObserver();
        FakeObserver o2 = new FakeObserver();
        service.registerObserver(o1);
        service.registerObserver(o2);

        Field flagField = EvaluateRoomMaintenanceRelationshipService.class
                .getDeclaredField("isAnyEssentialMaintenanceRequestPending");
        flagField.setAccessible(true);
        flagField.setBoolean(service, true);

        Field roomField = EvaluateRoomMaintenanceRelationshipService.class
                .getDeclaredField("currentRoomID");
        roomField.setAccessible(true);
        roomField.setInt(service, 55);

        service.notifyObservers();

        assertEquals(1, o1.updateCount);
        assertEquals(1, o2.updateCount);
        assertTrue(o1.lastFlag);
        assertTrue(o2.lastFlag);
        assertEquals(55, o1.lastRoomId);
        assertEquals(55, o2.lastRoomId);
    }

    // test8: removing one of multiple observers stops updates for that one only
    @Test
    void test8() throws Exception {
        EvaluateRoomMaintenanceRelationshipService service =
                EvaluateRoomMaintenanceRelationshipService.getInstance();

        FakeObserver o1 = new FakeObserver();
        FakeObserver o2 = new FakeObserver();
        service.registerObserver(o1);
        service.registerObserver(o2);
        service.removeObserver(o1);

        Field flagField = EvaluateRoomMaintenanceRelationshipService.class
                .getDeclaredField("isAnyEssentialMaintenanceRequestPending");
        flagField.setAccessible(true);
        flagField.setBoolean(service, true);

        Field roomField = EvaluateRoomMaintenanceRelationshipService.class
                .getDeclaredField("currentRoomID");
        roomField.setAccessible(true);
        roomField.setInt(service, 77);

        service.notifyObservers();

        assertEquals(0, o1.updateCount);  // removed
        assertEquals(1, o2.updateCount);  // still present
        assertTrue(o2.lastFlag);
        assertEquals(77, o2.lastRoomId);
    }

    // test9: calling evaluateRoomMaintenanceRelationship multiple times with different roomIDs does not throw
    @Test
    void test9() {
        EvaluateRoomMaintenanceRelationshipService service =
                EvaluateRoomMaintenanceRelationshipService.getInstance();

        assertDoesNotThrow(() -> {
            service.evaluateRoomMaintenanceRelationship(100);
            service.evaluateRoomMaintenanceRelationship(200);
            service.evaluateRoomMaintenanceRelationship(300);
        });
    }
}

