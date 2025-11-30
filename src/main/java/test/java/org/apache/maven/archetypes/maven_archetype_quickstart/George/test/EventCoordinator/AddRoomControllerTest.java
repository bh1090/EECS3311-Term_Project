package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.EventCoordinator;

import Controller.AddRoomController;
import Model.Room.Room;
import Repository.RoomRepository;
import Service.RoomService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AddRoomControllerTest {
     private AddRoomController addRoomController;

     @BeforeEach
     public void setUp(){
          RoomService roomService = new RoomService();
          this.addRoomController = new AddRoomController(roomService);
          this.addRoomController.handleAddRoomSubmission("Lassonde 1111", 50, 20);
     }
     @Test
     public void objectRoomIsNotNullTest(){
          assertNotNull(this.addRoomController, "The controller object is null.  ");
     }
     @Test
     public void checkRoomLocationNotNullTest(){
          Room room = RoomRepository.getInstance().findById("1"); // Assuming this method call has already been tested.
          String roomLocation = room.getLocation();

          Assertions.assertNotNull(roomLocation, "The room's location is null.  ");
     }
     @Test
     public void checkRoomCapacityInitializationTest(){
          Room room = RoomRepository.getInstance().findById("1"); // Assuming this method call has already been tested.
          int roomCapacity = Integer.parseInt(room.getRoomCapacity());

          Assertions.assertNotEquals(0, roomCapacity, "The room's capacity is 0.  ");
     }
     @Test
     public void checkRoomPriceInitializationTest(){
          Room room = RoomRepository.getInstance().findById("1"); // Assuming this method call has already been tested.
          double roomPrice = room.getPrice();

          Assertions.assertNotEquals(0, roomPrice, "The room's price is 0.  ");
     }
     @Test
     public void checkRoomCapacityTest(){
          Room room = RoomRepository.getInstance().findById("1"); // Assuming this method call has already been tested.
          int expectedRoomCapacity = Integer.parseInt(room.getRoomCapacity());
          int actualRoomCapacity = 50;

          Assertions.assertEquals(actualRoomCapacity, expectedRoomCapacity, "The room's capacity is incorrect.  ");
     }
     @Test
     public void checkRoomPriceTest(){
          Room room = RoomRepository.getInstance().findById("1"); // Assuming this method call has already been tested.
          double expectedRoomPrice = room.getPrice();
          double actualRoomPrice = 20;

          Assertions.assertEquals(actualRoomPrice, expectedRoomPrice, "The room's price is incorrect.  ");
     }
     @Test
     public void roomExistsInRoomRepositoryTest(){
          Room room = RoomRepository.getInstance().findById("1"); // Assuming this method call has already been tested.

          Assertions.assertNotNull(room, "The room wasn't properly stored in the room repository.  ");
     }
}
