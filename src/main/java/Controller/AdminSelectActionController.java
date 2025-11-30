package Controller;

import Service.RoomService;
import View.AddRoomView;

public class AdminSelectActionController {
     private final AddRoomController addRoomController;
     public AdminSelectActionController(AddRoomController addRoomController) {
          this.addRoomController = addRoomController;
     }
     public void adminAddRoom(String location, int capacity, double price) {
          RoomService roomService = new RoomService();
          roomService.createRoom(location, capacity, String.valueOf(price));
     }
     public void enableRoom(String roomID) {
          RoomService roomService = new RoomService();
          roomService.enableRoom(roomID);
     }
     public void disableRoom(String roomID) {
          RoomService roomService = new RoomService();
          roomService.disableRoom(roomID);
     }
}
