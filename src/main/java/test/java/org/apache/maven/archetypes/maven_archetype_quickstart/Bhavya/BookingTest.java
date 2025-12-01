package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Bhavya;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

import Model.Room.Booking;

public class BookingTest {

    private Booking booking;

    @Before
    public void setUp() {
        booking = new Booking(
            "B-100", 
            "101", 
            "user123", 
            LocalDate.now(), 
            LocalDate.now().plusDays(1), 
            LocalTime.of(9, 0), 
            LocalTime.of(10, 0),
            "PAY-999"
        );
    }

    @Test
    public void testBookingCreation() {
        assertEquals("B-100", booking.getBookingId());
        assertEquals("101", booking.getRoomId());
    }

    @Test
    public void testInitialStateIsConfirmed() {
        assertEquals("CONFIRMED", booking.getStatus());
    }

    @Test
    public void testCheckInFlow() {
        booking.performCheckIn();
        assertEquals("CHECKED_IN", booking.getStatus());
    }

    @Test
    public void testCheckOutFlow() {
        booking.performCheckIn();
        booking.performCheckOut();
        assertEquals("COMPLETED", booking.getStatus());
    }

    @Test
    public void testCancelFlow() {
        booking.performCancel();
        assertEquals("CANCELLED", booking.getStatus());
    }

    @Test
    public void testCannotCheckInIfCancelled() {
        booking.performCancel();
        booking.performCheckIn();
        // Should remain CANCELLED
        assertEquals("CANCELLED", booking.getStatus());
    }

    @Test
    public void testCannotCheckOutIfNotCheckedIn() {
        booking.performCheckOut();
        // Should remain CONFIRMED (logic prevents skipping steps)
        assertEquals("CONFIRMED", booking.getStatus());
    }

    @Test
    public void testGetPaymentId() {
        assertEquals("PAY-999", booking.getPaymentId());
    }

    @Test
    public void testSetPaymentId() {
        booking.setPaymentId("PAY-NEW");
        assertEquals("PAY-NEW", booking.getPaymentId());
    }

    @Test
    public void testTimeGetters() {
        assertEquals(LocalTime.of(9, 0), booking.getStartTime());
        assertEquals(LocalTime.of(10, 0), booking.getEndTime());
    }
}