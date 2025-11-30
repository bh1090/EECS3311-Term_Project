package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.EventCoordinator;

import Controller.AddRoomController;
import Model.Room.Room;
import Repository.RoomRepository;
import Service.RoomService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AddRoomControllerTest {
     private static AddRoomController addRoomController;

     @BeforeAll
     public static void setUp(){
          RoomService roomService = new RoomService();
          addRoomController = new AddRoomController(roomService);
          addRoomController.handleAddRoomSubmission("Lassonde 1111", 50, 20);
     }
     @Test
     public void objectRoomIsNotNullTest(){
          assertNotNull(addRoomController, "The controller object is null.  ");
     }
     @Test
     public void checkRoomLocationNotNullTest(){
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);
          String roomLocation = room.getLocation();

          Assertions.assertNotNull(roomLocation, "The room's location is null.  ");
     }
     @Test
     public void checkRoomCapacityInitializationTest(){
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);
          int roomCapacity = Integer.parseInt(room.getRoomCapacity());

          Assertions.assertNotEquals(0, roomCapacity, "The room's capacity is 0.  ");
     }
     @Test
     public void checkRoomPriceInitializationTest(){
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);
          double roomPrice = room.getPrice();

          Assertions.assertNotEquals(0, roomPrice, "The room's price is 0.  ");
     }
     @Test
     public void checkRoomLocationTest(){
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);
          String actualRoomLocation = "Lassonde 1111";
          String expectedRoomLocation = room.getLocation();

          Assertions.assertEquals(actualRoomLocation, expectedRoomLocation, "The room's location is incorrect.  ");
     }
     @Test
     public void checkRoomCapacityTest(){
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);
          int expectedRoomCapacity = Integer.parseInt(room.getRoomCapacity());
          int actualRoomCapacity = 50;

          Assertions.assertEquals(actualRoomCapacity, expectedRoomCapacity, "The room's capacity is incorrect.  ");
     }
     @Test
     public void checkRoomPriceTest(){
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);
          double expectedRoomPrice = room.getPrice();
          double actualRoomPrice = 20;

          Assertions.assertEquals(actualRoomPrice, expectedRoomPrice, "The room's price is incorrect.  ");
     }
     @Test
     public void roomExistsInRoomRepositoryTest(){
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);

          Assertions.assertNotNull(room, "The room wasn't properly stored in the room repository.  ");
     }
     @Test
     public void roomIsCorrectObjectTest(){
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);

          assertEquals(Room.class, room.getClass(), "The object is not of type Room.  ");
     }
     @Test
     public void roomIdIsNotNullTest(){
          String roomId = String.valueOf(RoomRepository.getInstance().findAll().size());
          Room room = RoomRepository.getInstance().findById(roomId);
          String actualRoomId = room.getRoomId();

          assertNotNull(actualRoomId, "The room ID is null.  ");
     }
}
