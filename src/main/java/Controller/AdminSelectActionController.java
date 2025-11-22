package Controller;

public class AdminSelectActionController {

     public void accessAddRoomView() {
          AddRoomController addRoomController = new AddRoomController();
          AddRoomView addRoomView = new AddRoomView(addRoomController);
          addRoomView.getAdminAddRoomInput();
     }
     public void accessRoomsListView() {
          AddRoomController addRoomController = new AddRoomController();
          AddRoomView addRoomView = new AddRoomView(addRoomController);
          addRoomView.getAdminAddRoomInput();
     }
}
