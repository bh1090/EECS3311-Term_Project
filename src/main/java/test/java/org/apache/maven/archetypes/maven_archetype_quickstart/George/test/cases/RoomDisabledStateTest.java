package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.cases;

import Model.Room.Room;
import Model.State.RoomDisabledState;
import Model.State.RoomState;
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
     public void enableRoomFromDisabledStateTest(){
          roomState.enable(room);
          String expectedRoomState = "DISABLED";
          String actualRoomState = room.getState().getStateName();

          assertEquals(expectedRoomState, actualRoomState, "Room state should not change.  ");
     }
     @Test
     public void disableRoomFromDisabledStateTestTest(){
          roomState.disable(room);
          String expectedRoomState = "DISABLED";
          String actualRoomState = room.getState().getStateName();

          assertEquals(expectedRoomState, actualRoomState, "Room state should not change.  ");
     }
     @Test
     public void isBookableFromRoomDisabledStateTest(){
          boolean expectedBookability = false;
          boolean actualBookability = roomState.isBookable();

          assertEquals(expectedBookability, actualBookability, "Room should not be bookable in the room disabled state.  ");
     }
     @Test
     public void getStateNameFromDisabledStateTest(){
          String expectedDisabledStateName = "DISABLED";
          String actualDisabledStateName = roomState.getStateName();

          assertEquals(expectedDisabledStateName, actualDisabledStateName, "Room state name should be DISABLED.  ");
     }
}
