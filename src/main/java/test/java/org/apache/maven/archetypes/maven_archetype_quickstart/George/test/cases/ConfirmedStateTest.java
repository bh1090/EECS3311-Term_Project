package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.cases;

import Model.Room.Booking;
import Model.State.BookingState;
import Model.State.ConfirmedState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConfirmedStateTest {
     private BookingState bookingState;
     private Booking booking;

     @BeforeEach
     public void setUp(){
          booking = new Booking("1", "1", "1",
                  LocalDate.of(2030, 12, 12),
                  LocalDate.of(2030, 12, 12),
                  LocalTime.of(12, 0),
                  LocalTime.of(13, 0),
                  "1");
          bookingState = new ConfirmedState();
          booking.setState(bookingState);
     }

     @Test
     public void objectConfirmedStateNotNullTest(){
          Assertions.assertNotNull(bookingState, "Object of CompletedState is null.  ");
     }
     @Test
     public void confirmedStateCancelAfterCheckOutTest() {
          booking.setState(new ConfirmedState());
          bookingState.checkOut(booking);
          bookingState.cancel(booking);
          String expectedBookingState = "CANCELLED";
          String actualBookingState = booking.getStatus();

          Assertions.assertEquals(expectedBookingState, actualBookingState, "Booking state is wrong.  ");
     }
     @Test
     public void confirmedStateCheckOutTwiceTest() {
          booking.setState(new ConfirmedState());
          bookingState.checkOut(booking);
          bookingState.checkOut(booking);
          String expectedBookingState = "CONFIRMED";
          String actualBookingState = booking.getStatus();

          Assertions.assertEquals(expectedBookingState, actualBookingState, "Booking state is wrong.  ");
     }
     @Test
     public void checkOutHandlesNullBookingTest() {
          Assertions.assertDoesNotThrow(() -> bookingState.checkOut(null), "Exception shouldn't be thrown for null booking.  ");
     }

     @Test
     public void confirmedStateNameTest(){
          String expectedStateName = "CONFIRMED";
          String actualStateName = bookingState.getStatus();

          Assertions.assertEquals(expectedStateName, actualStateName, "States aren't the same.  ");
     }
     @Test
     public void confirmedStateCancelTest(){
          bookingState.cancel(booking);
          String expectedStateName = "CONFIRMED";
          String actualStateName = bookingState.getStatus();
          // Since checkOut only has a print statement,
          // we just check to see if calling it changed
          // the state from COMPLETED to anything.

          Assertions.assertEquals(expectedStateName, actualStateName, "States aren't the same.  ");
     }
     @Test
     public void confirmedStateCheckInTest(){
          bookingState.checkIn(booking);
          String expectedStateName = "CHECKED_IN";
          String actualStateName = booking.getStatus();
          // Since checkOut only has a print statement,
          // we just check to see if calling it changed
          // the state from COMPLETED to anything.

          Assertions.assertEquals(expectedStateName, actualStateName, "State's aren't the same.  ");
     }
     @Test
     public void confirmedStateCheckOutTest(){
          bookingState.checkOut(booking);
          String expectedStateName = "CONFIRMED";
          String actualStateName = bookingState.getStatus();
          // Since checkOut only has a print statement,
          // we just check to see if calling it changed
          // the state from COMPLETED to anything.

          Assertions.assertEquals(expectedStateName, actualStateName, "States aren't the same.  ");
     }
     @Test
     public void instanceOfConfirmedStateTest() {
          Assertions.assertInstanceOf(ConfirmedState.class, bookingState, "BookingState object has wrong state.  ");
     }
     @Test
     public void doubleGetConfirmedStateNameCallTest() {
          String firstActualStateName = bookingState.getStatus();
          String secondActualStateName = bookingState.getStatus();
          String expectedStateName = "CONFIRMED";

          Assertions.assertEquals(expectedStateName, firstActualStateName, "States aren't the same.  ");
          Assertions.assertEquals(expectedStateName, secondActualStateName, "States aren't the same.  ");
     }
}
