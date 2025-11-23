package Controller;

import Service.RoomService;

public class AddRoomController {
     private final RoomService roomService;
     public AddRoomController(RoomService roomService){
          this.roomService = roomService;
     }
     public void handleAddRoomSubmission(String location, double price, String capacity){
           roomService.createRoom(location, price, capacity);
     }
}
