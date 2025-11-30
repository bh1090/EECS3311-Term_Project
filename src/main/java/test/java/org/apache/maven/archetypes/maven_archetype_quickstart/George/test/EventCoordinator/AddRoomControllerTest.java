package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.EventCoordinator;

public class AddRoomControllerTest {

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
