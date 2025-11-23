package Controller;

import View.AddRoomView;
import View.RoomsListView;

public class AdminSelectActionController {
     private final AddRoomController addRoomController;
     private final RoomsListController roomsListController;
     public AdminSelectActionController(AddRoomController addRoomController, RoomsListController roomsListController) {
          this.addRoomController = addRoomController;
          this.roomsListController = roomsListController;
     }

     public void accessAddRoomView() {
          AddRoomView addRoomView = new AddRoomView(addRoomController);
          addRoomView.getAdminAddRoomInput();
     }
     public void accessRoomsListView() {
          RoomsListView roomsListView = new RoomsListView(roomsListController);
          roomsListView.getListOfRooms();
     }
}
