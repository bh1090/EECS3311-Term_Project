package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Bhavya;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Model.Room.Room;
import Model.State.RoomDisabledState;
import Model.State.RoomEnabledState;
import Model.State.RoomReadyForEnableState;

public class RoomReadyForEnableStateTest {

    private Room room;
    private RoomReadyForEnableState state;

    @Before
    public void setUp() {
        room = new Room("101", "TestLoc", 10.0, "5");
        state = new RoomReadyForEnableState();
        room.setState(state);
    }

    @Test
    public void testIsBookable() {
        assertFalse("ReadyForEnable state should NOT be bookable yet", state.isBookable());
    }

    @Test
    public void testGetStateName() {
        assertEquals("READY_FOR_ENABLE", state.getStateName());
    }

    @Test
    public void testEnable() {
        state.enable(room);
        assertTrue(room.getState() instanceof RoomEnabledState);
        assertEquals("ENABLED", room.getState().getStateName());
    }

    @Test
    public void testDisable() {
        state.disable(room);
        assertTrue(room.getState() instanceof RoomDisabledState);
        assertEquals("DISABLED", room.getState().getStateName());
    }

    @Test
    public void testMaintain() {
        state.maintain(room);
        assertTrue(room.getState() instanceof RoomReadyForEnableState);
        assertEquals("READY_FOR_ENABLE", room.getState().getStateName());
    }

    @Test
    public void testEnableThenIsBookable() {
        state.enable(room);
        assertTrue("Should be bookable after enabling", room.isAvailable());
    }

    @Test
    public void testDisableThenIsBookable() {
        state.disable(room);
        assertFalse("Should not be bookable after disabling", room.isAvailable());
    }

    @Test
    public void testStateNotNullAfterEnable() {
        state.enable(room);
        assertNotNull(room.getState());
    }

    @Test
    public void testStateNotNullAfterDisable() {
        state.disable(room);
        assertNotNull(room.getState());
    }

    @Test
    public void testMaintainTwice() {
        // Idempotency check
        state.maintain(room);
        state.maintain(room);
        assertEquals("READY_FOR_ENABLE", room.getState().getStateName());
    }
}