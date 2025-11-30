package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Bhavya;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

import Model.Room.Booking;
import Service.RoomService;

public class RoomServiceTest {

    private RoomService service;

    @Before
    public void setUp() {
        service = new RoomService();
        // Note: Ideally we would clear the repository here, but since it's CSV based, 
        // we will create unique data for every test to avoid conflicts.
    }

    @Test
    public void testCreateRoom() {
        // Create a unique room for this test
        String capacity = "10";
        service.createRoom("Test Location", 100.0, capacity);
        // We can't easily assert return value since it's void, 
        // but no exception means success.
    }
    @Test
    public void testCreateBookingSuccess() {
        // 1. Setup dates
        LocalDate date = LocalDate.now().plusYears(1);
        LocalTime start = LocalTime.of(14, 0);
        LocalTime end = LocalTime.of(15, 0);
        
        // 2. CREATE THE ROOM & CAPTURE THE ID
        // Since createRoom now returns the ID, we save it immediately.
        String roomId = service.createRoom("TestLoc", 50.0, "5");
        // Safety check (good for debugging if test fails later)
        assertNotNull("Room ID should not be null", roomId);
        
        // 3. Try to book that specific Room ID
        // We use the 'roomId' variable we just captured.
        String bookingId = service.createBooking(
            "userTest", roomId, date, date, start, end, "PAY-TEST"
        );
        
        // 4. Assert Success
        assertNotNull("Booking ID should not be null on success", bookingId);    
    }
    
    @Test
    public void testBookingConflict() {
        // I put overlapping times here 
        LocalDate date = LocalDate.now().plusYears(2);
        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(12, 0);
        
        String roomId = service.createRoom("ConflictRoom", 100.0, "5");

        // 1. Make first booking
        String b1 = service.createBooking("u1", roomId, date, date, start, end, "PAY-1");
        assertNotNull("First booking should succeed", b1);
        System.out.println("Booking 1 created: " + b1);

        
        // 2. Make conflicting booking
        String b2 = service.createBooking("u2", roomId, date, date, start, end, "PAY-2");
        
        // If this fails, it means b2 is NOT null (it was created)
        assertNull("Should return null because room is occupied", b2);
    }

    @Test
    public void testCancelBooking() {
        // 1. Setup Data
        LocalDate date = LocalDate.now().plusYears(3);
        LocalTime now = LocalTime.now();
        
        // 2. Create a fresh room to guarantee availability
        String roomId = service.createRoom("CancelTestRoom", 100.0, "5");
        assertNotNull("Room should be created", roomId);

        // 3. Create the booking
        String bId = service.createBooking(
            "u1", 
            roomId, // dynamic Room ID
            date, date, 
            now, now.plusHours(1), 
            "PAY-C"
        );
        
        // Ensure the booking actually exists before we try to cancel it
        assertNotNull("Booking creation failed, cannot test cancellation", bId);
        
        // 4. Perform Cancellation
        boolean result = service.cancelBooking(bId);
        assertTrue("Cancellation should return true", result);
        
        // 5. Verify the Status Change
        Booking b = service.getBookingDetails(bId);
        assertNotNull("Booking should still exist in repo", b);
        assertEquals("CANCELLED", b.getStatus());
    }

    @Test
    public void testPerformCheckIn() {
        LocalDate date = LocalDate.now().plusYears(4);
        
        // 1. Create a fresh room explicitly to ensure it exists
        String roomId = service.createRoom("CheckInTestRoom", 100.0, "5");
        assertNotNull("Room should be created", roomId);

        // 2. Create the booking for THAT specific room
        String bId = service.createBooking(
            "u1", 
            roomId, // Using dynamic Room ID
            date, date, 
            LocalTime.now(), LocalTime.now().plusHours(1), 
            "PAY-CI"
        );
        
        // 3. Verify booking exists before attempting check-in
        assertNotNull("Booking creation failed", bId);
        
        // 4. Perform Check-in
        boolean result = service.performCheckIn(bId);
        System.out.println("checkin result: " + result);
        assertTrue("Check-in should succeed", result);
        
        // 5. Verify Status Update
        Booking b = service.getBookingDetails(bId);
        assertEquals("CHECKED_IN", b.getStatus());
    }

    @Test
    public void testDisableRoom() {
        // Create dummy room to disable
        service.createRoom("DisableTest", 10.0, "2");
        // We assume the ID is generated sequentially. 
        // For unit testing void methods without return, verification is harder without Mocking.
        // We verify no exception is thrown.
        service.disableRoom("1"); 
    }

    @Test
    public void testEnableRoomLogic() {
        // This exercises the enable logic
        service.enableRoom("1");
    }

    @Test
    public void testMaintenanceCompleted() {
        service.maintenanceCompleted("1");
    }

    @Test
    public void testGetBookingDetails() {
        // 1. Setup Dates
        LocalDate date = LocalDate.now().plusYears(5);
        
        // 2. Create the Room explicitly
        // We capture the generated ID so we know exactly what to book.
        String roomId = service.createRoom("DetailTestRoom", 100.0, "5");
        assertNotNull("Room ID should generated", roomId);

        // 3. Create the Booking using that specific Room ID
        String bId = service.createBooking(
            "u1", 
            roomId, // using dynamic ID here
            date, date, 
            LocalTime.now(), LocalTime.now().plusHours(1), 
            "PAY-D"
        );
        
        // 4. Test the GetDetails method
        Booking b = service.getBookingDetails(bId);
        
        // 5. Assertions
        assertNotNull("Booking should be found in repository", b);
        assertEquals("Booking ID should match", bId, b.getBookingId());
        assertEquals("Room ID should match", roomId, b.getRoomId());
    }
    
    @Test
    public void testPerformCheckOut() {
        LocalDate date = LocalDate.now().plusYears(6);
        
        // 1. Create a fresh room to guarantee existence
        String roomId = service.createRoom("CheckoutTestRoom", 100.0, "5");
        assertNotNull("Room should be created", roomId);

        // 2. Create the booking for THAT room
        String bId = service.createBooking(
            "u1", 
            roomId, // <--- Use the dynamic ID
            date, date, 
            LocalTime.now(), LocalTime.now().plusHours(1), 
            "PAY-CO"
        );
        
        assertNotNull("Booking should be created", bId);
        
        // 3. testing 
        boolean checkInResult = service.performCheckIn(bId);
        assertTrue("Check-in should succeed", checkInResult);
        
        boolean checkOutResult = service.performCheckOut(bId);
        assertTrue("Check-out should succeed", checkOutResult);
        
        // 4. Verify Final State
        assertEquals("COMPLETED", service.getBookingDetails(bId).getStatus());
    }
}