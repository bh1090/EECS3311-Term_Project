package maven_archetype_quickstart.Bhavya;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Model.Room.Room;

public class RoomTest {

    private Room room;

    @Before
    public void setUp() {
        // Initialize a clean room before every test
        room = new Room("101", "Library", 50.0, "20");
    }

    @Test
    public void testRoomCreation() {
        assertNotNull(room);
        assertEquals("101", room.getRoomId());
    }

    @Test
    public void testInitialStateIsDisabled() {
        // Default state should be Disabled
        assertTrue(!room.isAvailable());
        assertEquals("DISABLED", room.getState().getStateName());
    }

    @Test
    public void testDisableRoom() {
        room.requestDisable();
        assertFalse("Room should not be bookable after disabling", room.isAvailable());
        assertEquals("DISABLED", room.getState().getStateName());
    }

    @Test
    public void testEnableRoomAlreadyEnabled() {
        // Calling enable directly on an previously disabled room should do nothing/stay disabled
        room.requestEnable();
        assertTrue(!room.isAvailable());
        assertEquals("DISABLED", room.getState().getStateName());
    }

    @Test
    public void testMaintenanceFlowFullCycle() {
        // 1. Disable
        room.requestDisable();
        assertEquals("DISABLED", room.getState().getStateName());

        // 2. Perform Maintenance
        room.performMaintenance();
        assertEquals("READY_FOR_ENABLE", room.getState().getStateName());
        assertFalse("Room should not be bookable while ReadyForEnable", room.isAvailable());

        // 3. Enable
        room.requestEnable();
        assertEquals("ENABLED", room.getState().getStateName());
        assertTrue(room.isAvailable());
    }

    @Test
    public void testCannotEnableDirectlyFromDisabled() {
        room.requestDisable();
        // Try to enable without maintenance
        room.requestEnable();
        // Should still be DISABLED
        assertEquals("DISABLED", room.getState().getStateName());
    }

    @Test
    public void testMaintenanceOnEnabledRoom() {
        // Performing maintenance on an active room might act like disabling it or sending to check
        room.performMaintenance();
        // This sends it to ReadyForEnable
        assertEquals("READY_FOR_ENABLE", room.getState().getStateName());
    }

    @Test
    public void testGetLocation() {
        assertEquals("Library", room.getLocation());
    }

    @Test
    public void testGetPrice() {
        assertEquals(50.0, room.getPrice(), 0.01);
    }

    @Test
    public void testGetCapacity() {
        assertEquals("20", room.getRoomCapacity());
    }
}