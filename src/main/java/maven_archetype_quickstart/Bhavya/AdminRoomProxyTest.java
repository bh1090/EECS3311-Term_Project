package maven_archetype_quickstart.Bhavya;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import Model.Room.Room;
import Model.State.RoomEnabledState;
import Model.Room.*;

public class AdminRoomProxyTest {

    private Room realRoom;
    private AdminRoomProxy proxy;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        realRoom = new Room("101", "Library", 50.0, "20");
        realRoom.setState(new RoomEnabledState());
        proxy = new AdminRoomProxy(realRoom);
        
        // Capture console output for testing print statements
        System.setOut(new PrintStream(outContent));
    }
    
    @org.junit.After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testGetRoomId() {
        assertEquals("101", proxy.getRoomId());
    }

    @Test
    public void testShowRoomDetailsContainsID() {
        proxy.showRoomDetails();
        assertTrue(outContent.toString().contains("ID=101"));
    }

    @Test
    public void testShowRoomDetailsContainsState() {
        proxy.showRoomDetails();
        assertTrue(outContent.toString().contains("State=ENABLED"));
    }

    @Test
    public void testShowRoomDetailsContainsPrice() {
        proxy.showRoomDetails();
        assertTrue(outContent.toString().contains("Price=50.0"));
    }

    @Test
    public void testAdminViewLabel() {
        proxy.showRoomDetails();
        assertTrue(outContent.toString().contains("ADMIN VIEW"));
    }

    @Test
    public void testRoomIdDelegation() {
        // Ensure proxy doesn't store a separate ID but asks the real room
        assertEquals(realRoom.getRoomId(), proxy.getRoomId());
    }

    @Test
    public void testConstructorNotNull() {
        assertNotNull(proxy);
    }

    @Test
    public void testWithDifferentRoom() {
        Room r2 = new Room("999", "Lab", 100.0, "5");
        AdminRoomProxy p2 = new AdminRoomProxy(r2);
        assertEquals("999", p2.getRoomId());
    }

    @Test
    public void testDetailsFormat() {
        proxy.showRoomDetails();
        String output = outContent.toString().trim();
        // Verify exact format structure matches requirements
        // Expected: ADMIN VIEW: ID=101, State=ENABLED, Price=50.0
        assertTrue(output.startsWith("ADMIN VIEW:"));
        assertTrue(output.contains(", State="));
        assertTrue(output.contains(", Price="));
    }

    @Test
    public void testUpdatesReflectRealRoom() {
        // Change the real room (e.g. disable it)
        realRoom.requestDisable();
        // Proxy should show updated state immediately
        outContent.reset();
        proxy.showRoomDetails();
        assertTrue(outContent.toString().contains("State=DISABLED"));
    }
}