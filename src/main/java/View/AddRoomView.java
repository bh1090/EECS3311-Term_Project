package View;

import Controller.AddRoomController;
import javax.swing.*;

public class AddRoomView {
     final AddRoomController addRoomController;

     public AddRoomView(AddRoomController addRoomController) {
          this.addRoomController = addRoomController;
     }
     public void getAdminAddRoomInput(){
          Scanner sc = new Scanner(System.in);

          System.out.print("Please enter the new room name: ");
          String roomName = sc.nextLine();

          System.out.print("Please specify the new room's capacity: ");
          int capacity = sc.nextInt();

          System.out.print("Please enter the location of the new room: ");
          String location = sc.nextLine();

          addRoomController.handleAddRoomSubmission(roomName, capacity, location);
     }
}
