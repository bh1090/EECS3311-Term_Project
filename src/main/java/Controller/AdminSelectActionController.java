package Controller;

import Service.RoomService;
import View.AddRoomView;
import View.RoomsListView;

public class AdminSelectActionController {
     private final AddRoomController addRoomController;
     public AdminSelectActionController(AddRoomController addRoomController, RoomsListController roomsListController) {
          this.addRoomController = addRoomController;
     }
     public void accessAddRoomView() {
          AddRoomView addRoomView = new AddRoomView(addRoomController);
          addRoomView.getAdminAddRoomInput();
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
