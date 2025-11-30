package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.EventCoordinator;

import Controller.AddRoomController;
import Controller.AdminSelectActionController;
import Model.Room.Room;
import Model.State.RoomEnabledState;
import Model.State.RoomReadyForEnableState;
import Model.State.RoomState;
import Repository.RoomRepository;
import Service.RoomService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AdminSelectActionControllerTest {
     private AdminSelectActionController adminSelectActionController;

     @BeforeEach
     public void setUp(){
          RoomService roomService = new RoomService();
          String location = "Lassonde 1111";
          int capacity = 40;
          double price = 15;
          AddRoomController addRoomController = new AddRoomController(roomService);
          addRoomController.handleAddRoomSubmission(location, capacity, price);
          adminSelectActionController = new AdminSelectActionController(addRoomController);
     }

     @Test
     public void objectAdminSelectActionControllerNotNullTest(){

          Assertions.assertNotNull(this.adminSelectActionController, "The admin select action controller is null.  ");
     }
     @Test
     public void checkEnableRoomTest(){
          RoomService roomService = new RoomService();
          Room room = RoomRepository.getInstance().findById("1");
          RoomState roomState = new RoomReadyForEnableState();
          roomState.enable(room);
          roomService.enableRoom(room.getRoomId());
          String expectedRoomState = "ENABLED";
          String actualRoomState = room.getState().getStateName();

          Assertions.assertEquals(expectedRoomState, actualRoomState, "Room states don't match.  ");
     }
     @Test
     public void checkDisableRoomTest(){
          RoomService roomService = new RoomService();
          Room room = RoomRepository.getInstance().findById("1");
          RoomState roomState = new RoomReadyForEnableState();
          roomState.enable(room);
          roomService.enableRoom(room.getRoomId());
          room.requestDisable();
          String expectedRoomState = "DISABLED";
          String actualRoomState = room.getState().getStateName();

          Assertions.assertEquals(expectedRoomState, actualRoomState, "Room states don't match.  ");
     }

}
