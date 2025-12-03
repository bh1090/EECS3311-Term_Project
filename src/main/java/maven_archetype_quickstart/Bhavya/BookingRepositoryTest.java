package maven_archetype_quickstart.Bhavya;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Model.Room.Booking;
import Repository.BookingRepository;

public class BookingRepositoryTest {

    private BookingRepository repo;

    @Before
    public void setUp() {
        repo = BookingRepository.getInstance();
        // ideally, we would clear the repo here, but we can't easily do that with the current csv setup.
        // we will use unique IDs for each test to ensure isolation.
    }

    @Test
    public void testSingletonInstance() {
        BookingRepository repo1 = BookingRepository.getInstance();
        BookingRepository repo2 = BookingRepository.getInstance();
        assertSame("Repository should be a Singleton", repo1, repo2);
    }

    @Test
    public void testSaveAndFindBooking() {
        String bookingId = "TEST-B-" + System.currentTimeMillis();
        Booking booking = new Booking(
            bookingId, "101", "user1", 
            LocalDate.now(), LocalDate.now(), 
            LocalTime.of(10, 0), LocalTime.of(11, 0), 
            "PAY-1"
        );

        repo.save(booking);

        Booking retrieved = repo.findById(bookingId);
        assertNotNull("Should find saved booking", retrieved);
        assertEquals("Booking ID should match", bookingId, retrieved.getBookingId());
        assertEquals("Room ID should match", "101", retrieved.getRoomId());
    }

    @Test
    public void testUpdateBookingStatusToCheckedIn() {
        String bookingId = "TEST-UPDATE-CI-" + System.currentTimeMillis();
        Booking booking = new Booking(
            bookingId, "101", "user1", 
            LocalDate.now(), LocalDate.now(), 
            LocalTime.of(10, 0), LocalTime.of(11, 0), 
            "PAY-1"
        );
        repo.save(booking);

        // Perform Check-in
        booking.performCheckIn();
        repo.save(booking); // Update

        Booking updated = repo.findById(bookingId);
        assertEquals("Status should be updated to CHECKED_IN", "CHECKED_IN", updated.getStatus());
    }

    @Test
    public void testUpdateBookingStatusToCancelled() {
        String bookingId = "TEST-UPDATE-CA-" + System.currentTimeMillis();
        Booking booking = new Booking(
            bookingId, "101", "user1", 
            LocalDate.now(), LocalDate.now(), 
            LocalTime.of(10, 0), LocalTime.of(11, 0), 
            "PAY-1"
        );
        repo.save(booking);

        // Cancel
        booking.performCancel();
        repo.save(booking);

        Booking updated = repo.findById(bookingId);
        assertEquals("Status should be updated to CANCELLED", "CANCELLED", updated.getStatus());
    }

    @Test
    public void testUpdateBookingStatusToCompleted() {
        String bookingId = "TEST-UPDATE-CO-" + System.currentTimeMillis();
        Booking booking = new Booking(
            bookingId, "101", "user1", 
            LocalDate.now(), LocalDate.now(), 
            LocalTime.of(10, 0), LocalTime.of(11, 0), 
            "PAY-1"
        );
        // Move to Checked In first
        booking.performCheckIn();
        // Move to Completed
        booking.performCheckOut();
        
        repo.save(booking);

        Booking updated = repo.findById(bookingId);
        assertEquals("Status should be updated to COMPLETED", "COMPLETED", updated.getStatus());
    }

    @Test
    public void testFindAll() {
        int initialSize = repo.findAll().size();
        
        Booking b1 = new Booking("B-A-" + System.currentTimeMillis(), "101", "u1", LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), "P1");
        Booking b2 = new Booking("B-B-" + System.currentTimeMillis(), "102", "u2", LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), "P2");
        
        repo.save(b1);
        repo.save(b2);

        List<Booking> all = repo.findAll();
        // Size should have increased by at least 2 (if initial wasn't cleared)
        assertTrue("Should contain added bookings", all.size() >= initialSize + 2);
    }

    @Test
    public void testFindByIdNotFound() {
        Booking b = repo.findById("NON-EXISTENT-ID-" + System.currentTimeMillis());
        assertNull("Should return null for unknown ID", b);
    }

    @Test
    public void testDateAndPersistence() {
        String bookingId = "TEST-DATE-" + System.currentTimeMillis();
        LocalDate start = LocalDate.of(2025, 12, 25);
        LocalDate end = LocalDate.of(2025, 12, 26);
        
        Booking booking = new Booking(
            bookingId, "101", "user1", 
            start, end, 
            LocalTime.of(10, 0), LocalTime.of(11, 0), 
            "PAY-1"
        );
        repo.save(booking);

        Booking retrieved = repo.findById(bookingId);
        assertEquals("Start date should persist", start, retrieved.getStartDate());
        assertEquals("End date should persist", end, retrieved.getEndDate());
    }

    @Test
    public void testTimePersistence() {
        String bookingId = "TEST-TIME-" + System.currentTimeMillis();
        LocalTime start = LocalTime.of(14, 30);
        LocalTime end = LocalTime.of(16, 45);
        
        Booking booking = new Booking(
            bookingId, "101", "user1", 
            LocalDate.now(), LocalDate.now(), 
            start, end, 
            "PAY-1"
        );
        repo.save(booking);

        Booking retrieved = repo.findById(bookingId);
        assertEquals("Start time should persist", start, retrieved.getStartTime());
        assertEquals("End time should persist", end, retrieved.getEndTime());
    }

    @Test
    public void testOverwritingBookingUpdatesExisting() {
        String bookingId = "TEST-OVERWRITE-" + System.currentTimeMillis();
        Booking b1 = new Booking(bookingId, "Room1", "User1", LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), "Pay1");
        repo.save(b1);
        
        int sizeAfterFirstSave = repo.findAll().size();

        // Create new object with SAME ID but different details
        Booking b2 = new Booking(bookingId, "Room2", "User2", LocalDate.now(), LocalDate.now(), LocalTime.now(), LocalTime.now(), "Pay2");
        repo.save(b2);

        int sizeAfterSecondSave = repo.findAll().size();
        
        assertEquals("List size should not increase when updating existing ID", sizeAfterFirstSave, sizeAfterSecondSave);
        
        Booking retrieved = repo.findById(bookingId);
        assertEquals("Room ID should be updated", "Room2", retrieved.getRoomId());
        assertEquals("User ID should be updated", "User2", retrieved.getUserId());
    }
    
    @Test
    public void testUserIdPersistence() {
        String bookingId = "TEST-USER-" + System.currentTimeMillis();
        String userId = "user_555";
        Booking booking = new Booking(
            bookingId, "101", userId, 
            LocalDate.now(), LocalDate.now(), 
            LocalTime.of(10, 0), LocalTime.of(11, 0), 
            "PAY-1"
        );
        repo.save(booking);
        
        Booking retrieved = repo.findById(bookingId);
        assertEquals(userId, retrieved.getUserId());
    }
}