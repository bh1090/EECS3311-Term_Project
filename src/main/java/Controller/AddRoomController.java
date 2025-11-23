package Controller;

import Service.RoomService;

public class AddRoomController {
     final RoomService roomService;
     public AddRoomController(RoomService roomService){
          this.roomService = roomService;
     }
     public void handleAddRoomSubmission(String location, int capacity, double price){
          roomService.createRoom(location, price, String.valueOf(capacity));
     }
}
