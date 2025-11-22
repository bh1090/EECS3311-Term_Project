package Controller;

import View.AddRoomView;
import View.RoomsListView;

public class AdminSelectActionController {

     public void accessAddRoomView() {
          AddRoomController addRoomController = new AddRoomController();
          AddRoomView addRoomView = new AddRoomView(addRoomController);
          addRoomView.getAdminAddRoomInput();
     }
     public void accessRoomsListView() {
          RoomsListController roomsListController = new RoomsListController();
          RoomsListView roomsListView = new RoomsListView(roomsListController);
          roomsListView.getListOfRooms();
     }
}
