package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.cases;

import Model.State.BookingState;
import Model.State.CompletedState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CompletedStateTest {
     private static BookingState bookingState;

     @BeforeAll
     public static void setUp(){
          bookingState = new CompletedState();
     }

     @Test
     public void completedStateNameTest(){
          String expectedStateName = bookingState.getStatus();
          String actualStateName = "COMPLETED";

          Assertions.assertEquals(actualStateName, expectedStateName, "State's aren't the same.  ");
     }
}
