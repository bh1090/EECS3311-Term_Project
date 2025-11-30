package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.cases;

import Model.State.BookingState;
import Model.State.CompletedState;
import org.junit.jupiter.api.BeforeAll;

public class CompletedStateTest {
     private static BookingState bookingState;

     @BeforeAll
     public static void setUp(){
          bookingState = new CompletedState();
     }
}
