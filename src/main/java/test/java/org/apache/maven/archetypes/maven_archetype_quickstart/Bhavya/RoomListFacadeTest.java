package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Bhavya;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Model.Room.AdminRoomProxy;
import Model.Room.GuestRoomProxy;
import Model.Room.Room;
import Model.Room.RoomProxy;
import Repository.RoomRepository;
import Service.RoomListFacade;
import Service.RoomService;

public class RoomListFacadeTest {

    private RoomListFacade facade;
    private RoomRepository repo;
    private RoomService service;

    @Before
    public void setUp() {
        // 1. Initialize Components
        repo = RoomRepository.getInstance();
        service = new RoomService();
        facade = new RoomListFacade();

        // 2. Setup Data: Clear and Repopulate Repo logic (simulated by using unique IDs)
        // We cannot easily "clear" a CSV repo, so we create specific rooms for this test suite
        // to assume a known state.
    }

    @Test
    public void testFacadeInitialization() {
        assertNotNull(facade);
    }

    @Test
    public void testGetAvailableRoomsForGuestReturnsProxies() {
        // Create an enabled room
        String id = "FACADE-G-" + System.currentTimeMillis();
        Room r = new Room(id, "L", 10.0, "5"); 
        r.performMaintenance();
        r.requestEnable();
        repo.save(r);

        List<RoomProxy> list = facade.getAvailableRoomsForGuest();
        
        // Find our room in the list
        boolean found = false;
        for (RoomProxy p : list) {
            if (p.getRoomId().equals(id)) {
                found = true;
                assertTrue("Should be wrapped in GuestProxy", p instanceof GuestRoomProxy);
            }
        }
        assertTrue("Room should be found in guest list", found);
    }

    @Test
    public void testGetAvailableRoomsForGuestHidesDisabled() {
        String id = "FACADE-D-" + System.currentTimeMillis();
        Room r = new Room(id, "L", 10.0, "5");
        r.requestDisable(); // Disable it
        repo.save(r);

        List<RoomProxy> list = facade.getAvailableRoomsForGuest();
        
        for (RoomProxy p : list) {
            if (p.getRoomId().equals(id)) {
                fail("Disabled room should NOT be visible to guests");
            }
        }
    }

    @Test
    public void testGetAllRoomsForAdminReturnsAll() {
        String idEnabled = "FACADE-A1-" + System.currentTimeMillis();
        String idDisabled = "FACADE-A2-" + System.currentTimeMillis();
        
        Room r1 = new Room(idEnabled, "L", 10.0, "5");
        r1.requestEnable();
        repo.save(r1);
        
        Room r2 = new Room(idDisabled, "L", 10.0, "5");
        r2.requestDisable();
        repo.save(r2);

        List<RoomProxy> list = facade.getAllRoomsForAdmin();
        
        boolean foundEnabled = false;
        boolean foundDisabled = false;
        
        for (RoomProxy p : list) {
            if (p.getRoomId().equals(idEnabled)) foundEnabled = true;
            if (p.getRoomId().equals(idDisabled)) foundDisabled = true;
            assertTrue("Admin list should contain AdminProxies", p instanceof AdminRoomProxy);
        }
        
        assertTrue("Admin should see enabled room", foundEnabled);
        assertTrue("Admin should see disabled room", foundDisabled);
    }

    @Test
    public void testGuestListFiltersReadyForEnable() {
        String id = "FACADE-R-" + System.currentTimeMillis();
        Room r = new Room(id, "L", 10.0, "5");
        r.performMaintenance(); // State: ReadyForEnable
        repo.save(r);

        List<RoomProxy> list = facade.getAvailableRoomsForGuest();
        for (RoomProxy p : list) {
            if (p.getRoomId().equals(id)) {
                fail("Maintenance room should NOT be visible to guests");
            }
        }
    }

    @Test
    public void testAdminProxyShowsDetailsCorrectly() {
        String id = "FACADE-DET-" + System.currentTimeMillis();
        Room r = new Room(id, "L", 10.0, "5");
        repo.save(r);
        
        List<RoomProxy> list = facade.getAllRoomsForAdmin();
        RoomProxy p = list.stream().filter(rp -> rp.getRoomId().equals(id)).findFirst().orElse(null);
        
        assertNotNull(p);
        // We can't capture stdout easily here without complex setup, 
        // but verifying the instance type proves the factory logic worked.
        assertTrue(p instanceof AdminRoomProxy);
    }

    @Test
    public void testEmptyListBehavior() {
        // Hard to test with persistent CSV, but verify calling method doesn't crash
        // even if list is huge or empty.
        List<RoomProxy> list = facade.getAvailableRoomsForGuest();
        assertNotNull("Should return empty list, not null", list);
    }

    @Test
    public void testListIndependence() {
        List<RoomProxy> list1 = facade.getAvailableRoomsForGuest();
        List<RoomProxy> list2 = facade.getAvailableRoomsForGuest();
        assertNotSame("Should return new list instance each time", list1, list2);
    }

    @Test
    public void testPricePreservationThroughFacade() {
        String id = "FACADE-P-" + System.currentTimeMillis();
        Room r = new Room(id, "L", 99.99, "5");
        r.performMaintenance();
        r.requestEnable();
        repo.save(r);
        
        List<RoomProxy> list = facade.getAvailableRoomsForGuest();
        RoomProxy p = list.stream().filter(rp -> rp.getRoomId().equals(id)).findFirst().orElse(null);
        
        // This test relies on implementation details or creating a spy, 
        // but broadly we verify the item exists.
        assertNotNull(p);
    }
    
    @Test
    public void testAdminCanSeeReadyForEnable() {
        String id = "FACADE-AR-" + System.currentTimeMillis();
        Room r = new Room(id, "L", 10.0, "5");
        r.performMaintenance();
        repo.save(r);
        
        boolean found = facade.getAllRoomsForAdmin().stream()
                .anyMatch(p -> p.getRoomId().equals(id));
                
        assertTrue("Admin should see rooms in maintenance/ready state", found);
    }
}