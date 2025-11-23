package Controller;

import core.service.RoomService;

public class AddRoomController {
     final RoomService roomService;
     public AddRoomController(RoomService roomService){
          this.roomService = roomService;
     }
     public void handleAddRoomSubmission(String location, int capacity, String price){
          roomService.createRoom(location, capacity, price);
     }
}
