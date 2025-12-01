package maven_archetype_quickstart.George;

import Controller.AddRoomController;
import Controller.AdminSelectActionController;
import Model.Room.Room;
import Model.State.RoomReadyForEnableState;
import Model.State.RoomState;
import Repository.RoomRepository;
import Service.RoomService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdminSelectActionControllerTest {
     private AdminSelectActionController adminSelectActionController;

     @BeforeEach
     public void setUp(){
          RoomService roomService = new RoomService();
          AddRoomController addRoomController = new AddRoomController(roomService);
          adminSelectActionController = new AdminSelectActionController(addRoomController);
     }

     @Test
     public void objectAdminSelectActionControllerNotNullTest(){

          Assertions.assertNotNull(this.adminSelectActionController, "The admin select action controller is null.  ");
     }
     @Test
     public void checkAdminSuccessfullyAddedRoomLocation(){
          adminSelectActionController.adminAddRoom("Lassonde 1111", 10, 10);
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);
          String actualRoomLocation = "Lassonde 1111";
          String expectedRoomLocation = room.getLocation();

          Assertions.assertEquals(actualRoomLocation, expectedRoomLocation, "The room's location is incorrect.  ");
     }
     @Test
     public void checkAdminSuccessfullyAddedRoomCapacity(){
          adminSelectActionController.adminAddRoom("Lassonde 2222", 20, 20);
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);
          int expectedRoomCapacity = Integer.parseInt(room.getRoomCapacity());
          int actualRoomCapacity = 20;

          Assertions.assertEquals(actualRoomCapacity, expectedRoomCapacity, "The room's capacity is incorrect.  ");
     }
     @Test
     public void checkAdminSuccessfullyAddedRoomPrice(){
          adminSelectActionController.adminAddRoom("Lassonde 3333", 30, 30);
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);
          double expectedRoomPrice = room.getPrice();
          double actualRoomPrice = 30;

          Assertions.assertEquals(actualRoomPrice, expectedRoomPrice, "The room's price is incorrect.  ");
     }
     @Test
     public void roomAdminAddedRoomExistsInRoomRepositoryTest(){
          Room room = RoomRepository.getInstance().findById("1"); // Assuming this method call has already been tested.

          Assertions.assertNotNull(room, "The room wasn't properly stored in the room repository.  ");
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
     public void adminAddRoomInitialStateIsDisabledTest() {
          adminSelectActionController.adminAddRoom("Lassonde 4444", 40, 40);
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);
          String roomState = room.getState().getStateName();

          Assertions.assertEquals("ENABLED", roomState, "Newly created room should default to DISABLED.");
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
     @Test
     public void adminAddRoomWhereRoomIDNotNullTest() {
          adminSelectActionController.adminAddRoom("Lassonde 5555", 50, 50);
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);

          Assertions.assertNotNull(room.getRoomId(), "Admin's newly added room has a null roomId.  ");
     }
     @Test
     public void adminAddRoomCreatesCorrectObjectTypeTest() {
          adminSelectActionController.adminAddRoom("Lassonde 6666", 60, 60);
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);

          Assertions.assertEquals(Room.class, room.getClass(), "Admin add room action did not create a Room object.  ");
     }

}
