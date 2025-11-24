package Controller;

import Service.RoomService;

public class RoomsListController {
     final RoomService roomService;
     public RoomsListController(RoomService roomService){
          this.roomService = roomService;
     }
     public void getAllRooms() {
          //roomService.getRooms();
     }
}
