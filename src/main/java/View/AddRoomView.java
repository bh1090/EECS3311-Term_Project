package View;

import Controller.AddRoomController;
import javax.swing.*;

public class AddRoomView {
     final AddRoomController addRoomController;

     public AddRoomView(AddRoomController addRoomController) {
          this.addRoomController = addRoomController;
     }

     public void getAdminAddRoomInput(){
          JFrame jframe = new JFrame();

          JLabel label1 = new JLabel("Enter the room name:");
          jframe.add(label1);
          JTextField roomName = new JTextField();
          jframe.add(roomName);
          label1.setBounds(50, 200, 150, 50);
          roomName.setBounds(200, 200, 220, 50);

          JLabel label2 = new JLabel("Enter the room capacity: ");
          jframe.add(label2);
          JTextField roomCapacity = new JTextField();
          jframe.add(roomCapacity);
          label2.setBounds(50, 250, 150, 50);
          roomCapacity.setBounds(200, 250, 220, 50);

          JLabel label3 = new JLabel("Enter the room's location: ");
          jframe.add(label3);
          JTextField roomLocation = new JTextField();
          jframe.add(roomLocation);
          label3.setBounds(50, 300, 150, 50);
          roomLocation.setBounds(200, 300, 220, 50);

          jframe.setSize(500, 600);
          jframe.setLayout(null);
          jframe.setVisible(true);
          
          addRoomController.handleAddRoomSubmission(roomName.getText(), Integer.parseInt(roomCapacity.getText()), roomLocation.getText());
     }
}
