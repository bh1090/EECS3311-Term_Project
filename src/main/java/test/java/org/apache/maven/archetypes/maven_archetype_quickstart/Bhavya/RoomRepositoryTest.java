package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Bhavya;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Model.Room.Room;
import Repository.RoomRepository;

public class RoomRepositoryTest {

    private RoomRepository repo;

    @Before
    public void setUp() {
        repo = RoomRepository.getInstance();
    }

    @Test
    public void testSingletonInstance() {
        RoomRepository r1 = RoomRepository.getInstance();
        RoomRepository r2 = RoomRepository.getInstance();
        assertSame("Should return same instance", r1, r2);
    }

    @Test
    public void testSaveAndFindRoom() {
        String id = "ROOM-" + System.currentTimeMillis();
        Room room = new Room(id, "Test Lab", 100.0, "30");
        
        repo.save(room);

        Room retrieved = repo.findById(id);
        assertNotNull("Should find saved room", retrieved);
        assertEquals("Test Lab", retrieved.getLocation());
        assertEquals("30", retrieved.getRoomCapacity());
        assertEquals(100.0, retrieved.getPrice(), 0.01);
    }

    @Test
    public void testGenerateNextId() {
        // This test assumes IDs are numeric. If repo has mixed IDs, it finds max int.
        String id1 = repo.generateNextId();
        // Create a room with that ID to reserve it
        repo.save(new Room(id1, "Loc1", 10.0, "5"));
        
        String id2 = repo.generateNextId();
        
        assertNotEquals("IDs should be unique", id1, id2);
        
        try {
            int num1 = Integer.parseInt(id1);
            int num2 = Integer.parseInt(id2);
            assertTrue("New ID should be greater than old ID", num2 > num1);
        } catch (NumberFormatException e) {
            // If IDs are not numeric, we can't compare magnitude, but uniqueness is checked above
        }
    }

    @Test
    public void testStatePersistenceEnabled() {
        String id = "STATE-E-" + System.currentTimeMillis();
        Room room = new Room(id, "State Lab", 100.0, "30");
        room.requestEnable(); // Ensure enabled
        room.performMaintenance();
        room.requestEnable();
        repo.save(room);
        
        Room retrieved = repo.findById(id);
        assertEquals("ENABLED", retrieved.getState().getStateName());
    }

    @Test
    public void testStatePersistenceDisabled() {
        String id = "STATE-D-" + System.currentTimeMillis();
        Room room = new Room(id, "State Lab", 100.0, "30");
        room.requestDisable();
        
        repo.save(room);
        
        Room retrieved = repo.findById(id);
        assertEquals("DISABLED", retrieved.getState().getStateName());
    }

    @Test
    public void testStatePersistenceReadyForEnable() {
        String id = "STATE-R-" + System.currentTimeMillis();
        Room room = new Room(id, "State Lab", 100.0, "30");
        room.requestDisable();
        room.performMaintenance(); // Moves to Ready
        
        repo.save(room);
        
        Room retrieved = repo.findById(id);
        assertEquals("READY_FOR_ENABLE", retrieved.getState().getStateName());
    }

    @Test
    public void testUpdateRoomDetails() {
        String id = "UPDATE-" + System.currentTimeMillis();
        Room room = new Room(id, "Old Loc", 50.0, "10");
        repo.save(room);

        // Update
        Room modified = new Room(id, "New Loc", 99.0, "50");
        repo.save(modified);

        Room retrieved = repo.findById(id);
        assertEquals("New Loc", retrieved.getLocation());
        assertEquals(99.0, retrieved.getPrice(), 0.01);
        assertEquals("50", retrieved.getRoomCapacity());
    }

    @Test
    public void testFindAll() {
        int initialSize = repo.findAll().size();
        repo.save(new Room("ADD-1-" + System.currentTimeMillis(), "L", 1.0, "1"));
        repo.save(new Room("ADD-2-" + System.currentTimeMillis(), "L", 1.0, "1"));
        
        assertEquals("Size should increase by 2", initialSize + 2, repo.findAll().size());
    }

    @Test
    public void testFindByIdNotFound() {
        assertNull(repo.findById("NON-EXISTENT-ROOM-" + System.currentTimeMillis()));
    }

    @Test
    public void testFindAllReturnsCopy() {
        List<Room> list = repo.findAll();
        list.clear();
        assertFalse("Clearing returned list should not clear repo", repo.findAll().isEmpty());
    }
}
