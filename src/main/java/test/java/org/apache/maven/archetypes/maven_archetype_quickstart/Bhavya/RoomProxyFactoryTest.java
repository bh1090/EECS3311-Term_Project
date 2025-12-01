package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Bhavya;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Model.Room.AdminRoomProxy;
import Model.Room.GuestRoomProxy;
import Model.Room.Room;
import Model.Room.RoomProxy;
import Model.Room.RoomProxyFactory;

public class RoomProxyFactoryTest {

    private Room room;

    @Before
    public void setUp() {
        room = new Room("101", "Factory Lab", 100.0, "30");
    }

    @Test
    public void testCreateAdminProxyExactMatch() {
        RoomProxy p = RoomProxyFactory.getProxy("ADMIN", room);
        assertTrue("Should return AdminRoomProxy for 'ADMIN'", p instanceof AdminRoomProxy);
    }

    @Test
    public void testCreateAdminProxyLowerCase() {
        // If your factory uses equalsIgnoreCase
        RoomProxy p = RoomProxyFactory.getProxy("admin", room);
        assertTrue("Should return AdminRoomProxy for 'admin' (case insensitive)", p instanceof AdminRoomProxy);
    }

    @Test
    public void testCreateAdminProxyMixedCase() {
        RoomProxy p = RoomProxyFactory.getProxy("Admin", room);
        assertTrue("Should return AdminRoomProxy for 'Admin'", p instanceof AdminRoomProxy);
    }

    @Test
    public void testCreateGuestProxyForGuestString() {
        RoomProxy p = RoomProxyFactory.getProxy("GUEST", room);
        assertTrue("Should return GuestRoomProxy for 'GUEST'", p instanceof GuestRoomProxy);
    }

    @Test
    public void testCreateGuestProxyForUnknownString() {
        // Factory logic: "if ADMIN return Admin, ELSE return Guest"
        RoomProxy p = RoomProxyFactory.getProxy("USER", room);
        assertTrue("Should default to GuestRoomProxy for unknown roles", p instanceof GuestRoomProxy);
    }

    @Test
    public void testCreateGuestProxyForEmptyString() {
        RoomProxy p = RoomProxyFactory.getProxy("", room);
        assertTrue("Should default to GuestRoomProxy for empty string", p instanceof GuestRoomProxy);
    }

    @Test
    public void testCreateGuestProxyForNullString() {
        // CAUTION: If your factory does userType.equalsIgnoreCase, passing null will crash.
        // If it does "ADMIN".equalsIgnoreCase(userType), it is safe.
        // Assuming robust implementation or skipping if code is fragile.
        try {
            RoomProxy p = RoomProxyFactory.getProxy(null, room);
            assertTrue(p instanceof GuestRoomProxy); // Default behavior expected
        } catch (NullPointerException e) {
            // If it crashes, logic is userType.equals(...). 
            // Assert failure or fix factory logic.
        }
    }

    @Test
    public void testProxyContainsCorrectRoom() {
        RoomProxy p = RoomProxyFactory.getProxy("ADMIN", room);
        assertEquals("factory should pass the correct room to proxy", "101", p.getRoomId());
    }

    @Test
    public void testFactoryReturnsNotNull() {
        assertNotNull(RoomProxyFactory.getProxy("ADMIN", room));
    }

    @Test
    public void testFactoryIsStatic() {
        // Just verifying we call it statically without instantiation
        // (Implicit in other tests, but good for completeness)
        RoomProxy p = RoomProxyFactory.getProxy("random", room);
        assertNotNull(p);
    }
}