package Controller;

import View.AddRoomView;
import View.RoomsListView;

public class AdminSelectActionController {
     private final AddRoomController addRoomController = new AddRoomController();
     private final RoomsListController roomsListController = new RoomsListController();

     public void accessAddRoomView() {
          AddRoomView addRoomView = new AddRoomView(addRoomController);
          addRoomView.getAdminAddRoomInput();
     }
     public void accessRoomsListView() {
          RoomsListView roomsListView = new RoomsListView(roomsListController);
          roomsListView.getListOfRooms();
     }
}
