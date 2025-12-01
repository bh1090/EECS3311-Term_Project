package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.cases;

import Model.Room.Room;
import Model.State.RoomDisabledState;
import Model.State.RoomState;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RoomDisabledStateTest {
     private static RoomState roomState;
     private static Room room;

     @BeforeAll
     public static void setUp(){
          room = new Room("1", "Lassonde 1111", 50, "12");
          roomState = new RoomDisabledState();
          room.setState(new RoomDisabledState());
     }

     @Test
     public void Test(){

     }
}
