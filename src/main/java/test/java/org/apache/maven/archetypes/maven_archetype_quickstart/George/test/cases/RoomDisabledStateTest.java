package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.cases;

import Model.Room.Room;
import Model.State.RoomDisabledState;
import Model.State.RoomState;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
     public void objectRoomDisabledStateNotNullTest(){
          Assertions.assertNotNull(roomState, "Object of RoomDisabledState is null.  ");
     }
     @Test
     public void Test(){
          roomState.enable(room);
          String expectedRoomState = "DISABLED";
          String actualRoomState = room.getState().getStateName();

          assertEquals(expectedRoomState, actualRoomState, "Room state should not change.  ");
     }
}
