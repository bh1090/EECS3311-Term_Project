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

public class RoomEnabledStateTest {

    private Room room;
    private RoomEnabledState state;

    @Before
    public void setUp() {
        room = new Room("101", "TestLoc", 10.0, "5");
        state = new RoomEnabledState();
        room.setState(state);
    }

    @Test
    public void testIsBookable() {
        assertTrue("Enabled state should be bookable", state.isBookable());
    }

    @Test
    public void testGetStateName() {
        assertEquals("ENABLED", state.getStateName());
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
    public void testStateTransitionIsNotNullAfterDisable() {
        state.disable(room);
        assertNotNull("State should not be null after transition", room.getState());
    }

    @Test
    public void testStateTransitionIsNotNullAfterMaintain() {
        state.maintain(room);
        assertNotNull("State should not be null after transition", room.getState());
    }

    @Test
    public void testEnableTwice() {
        //  Calling enable twice shouldn't change anything
        state.enable(room);
        state.enable(room);
        assertEquals("ENABLED", room.getState().getStateName());
    }

    @Test
    public void testDisableThenIsBookable() {
        state.disable(room);
        assertFalse("Should not be bookable after disabling", room.isAvailable());
    }

    @Test
    public void testMaintainThenIsBookable() {
        state.maintain(room);
        assertFalse("Should not be bookable during maintenance check", room.isAvailable());
    }
}