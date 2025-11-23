package View;

import Controller.AddRoomController;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoomView {
     final AddRoomController addRoomController;

     public AddRoomView(AddRoomController addRoomController) {
          this.addRoomController = addRoomController;
     }

     public void getAdminAddRoomInput(){
          JFrame jframe = new JFrame();
          JButton button1 = new JButton("Submit");
          button1.setBounds(150, 350, 220, 50);
          jframe.add(button1);

          JLabel label1 = new JLabel("Enter the room's location:");
          jframe.add(label1);
          JTextField roomLocation = new JTextField();
          jframe.add(roomLocation);
          label1.setBounds(50, 200, 150, 50);
          roomLocation.setBounds(200, 200, 220, 50);

          JLabel label2 = new JLabel("Enter the room capacity: ");
          jframe.add(label2);
          JTextField roomCapacity = new JTextField();
          jframe.add(roomCapacity);
          label2.setBounds(50, 250, 150, 50);
          roomCapacity.setBounds(200, 250, 220, 50);

          JLabel label3 = new JLabel("Enter the room's price: ");
          jframe.add(label3);
          JTextField roomPrice = new JTextField();
          jframe.add(roomPrice);
          label3.setBounds(50, 300, 150, 50);
          roomPrice.setBounds(200, 300, 220, 50);

          jframe.setSize(500, 600);
          jframe.setLayout(null);
          jframe.setVisible(true);

          button1.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e){
                    jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Set default close operation
                    jframe.setSize(300, 200);
                    jframe.setLocationRelativeTo(null);
                    jframe.dispose();

                    //RoomService roomService = new RoomService();
                    addRoomController.handleAddRoomSubmission(roomLocation.getText(), Integer.parseInt(roomCapacity.getText()), Double.parseDouble(roomPrice.getText()));
               }
          });
     }
}
