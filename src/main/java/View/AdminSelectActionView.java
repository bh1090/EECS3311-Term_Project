package View;

import Controller.AdminSelectActionController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminSelectActionView {

     private final AdminSelectActionController adminSelectActionController;
     public AdminSelectActionView(AdminSelectActionController adminSelectActionController) {
          this.adminSelectActionController = adminSelectActionController;
     }
     public void handleAdminAction(){
          JFrame jframe = new JFrame();
          jframe.setTitle("Admin Actions");

          JButton button1 = new JButton("Add New Room");
          JButton button2 = new JButton("List Rooms");
          JButton button3 = new JButton("Disable Room");
          JButton button4 = new JButton("Disable Room");


          button1.setBounds(150, 50, 220, 50);
          jframe.add(button1);
          button2.setBounds(150, 100, 220, 50);
          jframe.add(button2);
          button3.setBounds(150, 150, 220, 50);
          jframe.add(button3);
          button4.setBounds(150, 200, 220, 50);
          jframe.add(button4);
          jframe.setSize(500, 600);
          jframe.setLayout(null);
          jframe.setVisible(true);
          button1.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e){
                    jframe.dispose();

                     adminSelectActionController.accessAddRoomView();
               }
          });
          button2.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e){
                    jframe.dispose();

                    adminSelectActionController.accessRoomsListView();
               }
          });
          button3.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e){
                    jframe.dispose();
                    JFrame frameEnableRoom = new JFrame();
                    frameEnableRoom.setTitle("Enable a Rom");
                    JLabel label1 = new JLabel("Enter the room's ID: ");
                    frameEnableRoom.add(label1);
                    JTextField roomID = new JTextField();
                    frameEnableRoom.add(roomID);
                    label1.setBounds(50, 200, 150, 50);
                    roomID.setBounds(200, 200, 220, 50);

                    adminSelectActionController.enableRoom(roomID.getText());
               }
          });
          button4.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e){
                    jframe.dispose();
                    JFrame frameDisableRoom = new JFrame();
                    frameDisableRoom.setTitle("Disable a Room");
                    JLabel label1 = new JLabel("Enter the room's ID: ");
                    frameDisableRoom.add(label1);
                    JTextField roomID = new JTextField();
                    frameDisableRoom.add(roomID);
                    label1.setBounds(50, 200, 150, 50);
                    roomID.setBounds(200, 200, 220, 50);
                    adminSelectActionController.disableRoom(roomID.getText());
               }
          });
     }

}
