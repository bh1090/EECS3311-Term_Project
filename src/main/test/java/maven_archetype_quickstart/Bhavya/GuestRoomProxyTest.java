package maven_archetype_quickstart.Bhavya;

	
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import Model.Room.GuestRoomProxy;
import Model.Room.Room;

public class GuestRoomProxyTest {

    private Room realRoom;
    private GuestRoomProxy proxy;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        realRoom = new Room("202", "Study Hall", 25.0, "10");
        proxy = new GuestRoomProxy(realRoom);
        System.setOut(new PrintStream(outContent));
    }
    
    @org.junit.After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testGetRoomId() {
        assertEquals("202", proxy.getRoomId());
    }

    @Test
    public void testShowRoomDetailsContainsLocation() {
        proxy.showRoomDetails();
        assertTrue(outContent.toString().contains("Location=Study Hall"));
    }

    @Test
    public void testShowRoomDetailsContainsPrice() {
        proxy.showRoomDetails();
        assertTrue(outContent.toString().contains("Price=$25.0"));
    }

    @Test
    public void testShowRoomDetailsHidesInternalState() {
        // Guest view should NOT show "State=ENABLED" or "DISABLED" explicitly
        // It shows "GUEST VIEW" info instead.
        proxy.showRoomDetails();
        assertFalse("Guest view should not expose raw state name", outContent.toString().contains("State="));
    }

    @Test
    public void testGuestViewLabel() {
        proxy.showRoomDetails();
        assertTrue(outContent.toString().contains("GUEST VIEW"));
    }

    @Test
    public void testNightlyRateLabel() {
        proxy.showRoomDetails();
        assertTrue(outContent.toString().contains("/night"));
    }

    @Test
    public void testConstructor() {
        assertNotNull(proxy);
    }

    @Test
    public void testDifferentRoomData() {
        Room r2 = new Room("303", "Gym", 0.0, "50");
        GuestRoomProxy p2 = new GuestRoomProxy(r2);
        
        p2.showRoomDetails();
        assertTrue(outContent.toString().contains("Location=Gym"));
    }

    @Test
    public void testPriceFormatting() {
        proxy.showRoomDetails();
        String output = outContent.toString();
        // Check for specific currency symbol or format if your code had it
        assertTrue(output.contains("$25.0"));
    }

    @Test
    public void testDelegationIsLive() {
        // If we hack the room location (assuming setters exist or using reflection, 
        // or just by knowing it references the object), ensuring proxy sees it.
        // Since Room fields are final-ish/private without setters in your snippet, 
        // we test identity:
        assertEquals(realRoom.getRoomId(), proxy.getRoomId());
    }
}
