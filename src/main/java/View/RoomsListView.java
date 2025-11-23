package View;

import Controller.RoomsListController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoomsListView {
     final RoomsListController roomsListController;

     public RoomsListView(RoomsListController roomsListController) {
          this.roomsListController = roomsListController;
     }

     public void getListOfRooms() {
          JFrame jframe = new JFrame();
          JButton button1 = new JButton("View Rooms");
          button1.setBounds(150, 200, 220, 50);
          jframe.add(button1);
          JButton button2 = new JButton("Close");
          button2.setBounds(150, 400, 220, 50);
          jframe.add(button2);
          jframe.setSize(500, 600);
          jframe.setLayout(null);
          jframe.setVisible(true);
          button1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e){
                    jframe.dispose();

                    roomsListController.getAllRooms();
               }
          });
          button2.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e){
                    jframe.dispose();
               }
          });
     }
}
