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

          JButton button1 = new JButton("Add New Room");
          JButton button2 = new JButton("List Rooms");

          button1.setBounds(150, 200, 220, 50);
          jframe.add(button1);
          button2.setBounds(150, 250, 220, 50);
          jframe.add(button2);
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
     }

}
