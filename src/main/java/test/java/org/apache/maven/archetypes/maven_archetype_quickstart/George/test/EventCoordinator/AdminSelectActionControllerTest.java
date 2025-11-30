package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.EventCoordinator;

import Controller.AddRoomController;
import Controller.AdminSelectActionController;
import Service.RoomService;
import org.junit.jupiter.api.BeforeEach;

public class AdminSelectActionControllerTest {
     private AdminSelectActionController adminSelectActionController;

     @BeforeEach
     public void setUp(){
          RoomService roomService = new RoomService();
          AddRoomController addRoomController = new AddRoomController(roomService);
          adminSelectActionController = new AdminSelectActionController(addRoomController);
     }

}
