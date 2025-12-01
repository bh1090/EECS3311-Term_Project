package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.cases;

import Model.Room.Booking;
import Model.State.BookingState;
import Model.State.CompletedState;
import Model.State.ConfirmedState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConfirmedStateTest {
     private static BookingState bookingState;
     private static Booking booking;
     @BeforeAll
     public static void setUp(){
          booking = new Booking("1", "1", "1",
                  LocalDate.of(2030, 12, 12),
                  LocalDate.of(2030, 12, 13),
                  LocalTime.of(12, 0),
                  LocalTime.of(13, 0),
                  "1");
          bookingState = new ConfirmedState();
          booking.setState(new ConfirmedState());
     }

     @Test
     public void objectConfirmedStateNotNullTest(){
          Assertions.assertNotNull(bookingState, "Object of CompletedState is null.  ");
     }
     @Test
     public void cancelHandlesNullBookingTest() {
          Assertions.assertDoesNotThrow(() -> bookingState.cancel(null), "Exception shouldn't be thrown for null booking");
     }
     @Test
     public void checkInHandlesNullBookingTest() {
          Assertions.assertDoesNotThrow(() -> bookingState.checkIn(null), "Exception shouldn't be thrown for null booking");
     }
     @Test
     public void checkOutHandlesNullBookingTest() {
          Assertions.assertDoesNotThrow(() -> bookingState.checkOut(null), "Exception shouldn't be thrown for null booking");
     }

     @Test
     public void confirmedStateNameTest(){
          String expectedStateName = bookingState.getStatus();
          String actualStateName = "CONFIRMED";

          Assertions.assertEquals(actualStateName, expectedStateName, "State's aren't the same.  ");
     }
     @Test
     public void confirmedStateCancelTest(){
          bookingState.cancel(booking);
          String expectedStateName = bookingState.getStatus();
          String actualStateName = "CONFIRMED";
          // Since checkOut only has a print statement,
          // we just check to see if calling it changed
          // the state from COMPLETED to anything.
          Assertions.assertEquals(actualStateName, expectedStateName, "State's aren't the same.  ");
     }
     @Test
     public void confirmedStateCheckInTest(){
          bookingState.checkIn(booking);
          String expectedStateName = bookingState.getStatus();
          String actualStateName = "CONFIRMED";
          // Since checkOut only has a print statement,
          // we just check to see if calling it changed
          // the state from COMPLETED to anything.
          Assertions.assertEquals(actualStateName, expectedStateName, "State's aren't the same.  ");
     }
     @Test
     public void confirmedStateCheckOutTest(){
          bookingState.checkOut(booking);
          String expectedStateName = bookingState.getStatus();
          String actualStateName = "CONFIRMED";
          // Since checkOut only has a print statement,
          // we just check to see if calling it changed
          // the state from COMPLETED to anything.
          Assertions.assertEquals(actualStateName, expectedStateName, "State's aren't the same.  ");
     }
     @Test
     public void instanceOfConfirmedStateTest() {
          Assertions.assertInstanceOf(ConfirmedState.class, bookingState, "BookingState object has wrong state.  ");
     }
     @Test
     public void bookingStateIsConfirmedStateTest() {
          Assertions.assertEquals("CONFIRMED", booking.getStatus(), "The booking's internal state should be COMPLETED.");
     }
}
