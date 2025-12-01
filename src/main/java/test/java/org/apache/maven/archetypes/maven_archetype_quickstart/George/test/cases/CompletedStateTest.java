package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.cases;

import Model.Room.Booking;
import Model.State.BookingState;
import Model.State.CompletedState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;


public class CompletedStateTest {
     private static BookingState bookingState;
     private static Booking booking;
     @BeforeAll
     public static void setUp(){
          bookingState = new CompletedState();
          booking = new Booking("1", "1", "1",
                  LocalDate.of(2030, 12, 12),
                  LocalDate.of(2030, 12, 13),
                  LocalTime.of(12, 0),
                  LocalTime.of(13, 0),
                  "1");
          }

     @Test
     public void objectCompletedStateNotNull(){

          Assertions.assertNotNull(bookingState, "Object of CompletedState is null.  ");
     }
     @Test
     public void completedStateNameTest(){
          String expectedStateName = bookingState.getStatus();
          String actualStateName = "COMPLETED";

          Assertions.assertEquals(actualStateName, expectedStateName, "State's aren't the same.  ");
     }
     @Test
     public void completedStateCancelTest(){
          bookingState.cancel(booking);
          String expectedStateName = bookingState.getStatus();
          String actualStateName = "COMPLETED";
          // Since checkOut only has a print statement,
          // we just check to see if calling it changed
          // the state from COMPLETED to anything.
          Assertions.assertEquals(actualStateName, expectedStateName, "State's aren't the same.  ");
     }
     @Test
     public void completedStateCheckInTest(){
          bookingState.checkIn(booking);
          String expectedStateName = bookingState.getStatus();
          String actualStateName = "COMPLETED";
          // Since checkOut only has a print statement,
          // we just check to see if calling it changed
          // the state from COMPLETED to anything.
          Assertions.assertEquals(actualStateName, expectedStateName, "State's aren't the same.  ");
     }
     @Test
     public void completedStateCheckOutTest(){
          bookingState.checkOut(booking);
          String expectedStateName = bookingState.getStatus();
          String actualStateName = "COMPLETED";
          // Since checkOut only has a print statement,
          // we just check to see if calling it changed
          // the state from COMPLETED to anything.
          Assertions.assertEquals(actualStateName, expectedStateName, "State's aren't the same.  ");
     }
}
