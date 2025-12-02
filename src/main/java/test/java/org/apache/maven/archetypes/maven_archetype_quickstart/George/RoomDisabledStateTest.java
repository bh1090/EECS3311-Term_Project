package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George;

import Model.Room.Room;
import Model.State.RoomDisabledState;
import Model.State.RoomState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomDisabledStateTest {
     private RoomState roomState;
     private Room room;

     @BeforeEach
     public void setUp(){
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
     @Test
     public void doubleEnableRoomFromDisabledStateTest(){
          roomState.enable(room);
          roomState.enable(room);
          String expectedRoomState = "DISABLED";
          String actualRoomState = room.getState().getStateName();

          assertEquals(expectedRoomState, actualRoomState, "Room state should not change.  ");
     }
     @Test
     public void doubleDisableRoomFromDisabledStateTest(){
          roomState.disable(room);
          roomState.disable(room);
          String expectedRoomState = "DISABLED";
          String actualRoomState = room.getState().getStateName();

          assertEquals(expectedRoomState, actualRoomState, "Room state should not change.  ");
     }
     @Test
     public void doubleMaintainRoomFromDisabledStateTest(){
          roomState.maintain(room);
          roomState.maintain(room);
          String expectedRoomState = "READY_FOR_ENABLE";
          String actualRoomState = room.getState().getStateName();

          assertEquals(expectedRoomState, actualRoomState, "Room state should not change.  ");
     }
     @Test
     public void allMethodsForDisableRoomFromDisabledStateTest(){
          roomState.enable(room);
          roomState.maintain(room);
          roomState.disable(room);
          String expectedRoomState = "READY_FOR_ENABLE";
          String actualRoomState = room.getState().getStateName();

          assertEquals(expectedRoomState, actualRoomState, "Room state should not change.  ");
     }
     @Test
     public void stateNameNotNullTest(){
          String stateName = roomState.getStateName();

          Assertions.assertNotNull(stateName, "Object of RoomDisabledState has a null name.  ");
     }

}
