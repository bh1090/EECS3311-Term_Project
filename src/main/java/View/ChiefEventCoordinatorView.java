package View;

import Controller.ChiefEventCoordinatorController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChiefEventCoordinatorView {
     final ChiefEventCoordinatorController chiefEventCoordinatorController = new ChiefEventCoordinatorController();

     public void handleChiefCoordinatorAction() {
          JFrame jframe = new JFrame();

          JButton button1 = new JButton("Create Admin");
          JButton button2 = new JButton("Remove Admin");

          button1.setBounds(150, 200, 220, 50);
          jframe.add(button1);
          button2.setBounds(150, 250, 220, 50);
          jframe.add(button2);
          jframe.setSize(500, 600);
          jframe.setLayout(null);
          jframe.setVisible(true);
          button1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Set default close operation
                    jframe.setSize(300, 200);
                    jframe.setLocationRelativeTo(null);
                    jframe.dispose();

                    chiefEventCoordinatorController.createAdmin();

               }
          });
          button2.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Set default close operation
                    jframe.setSize(300, 200);
                    jframe.setLocationRelativeTo(null);
                    jframe.dispose();

                    chiefEventCoordinatorController.removeAdmin();
               }
          });
     }
}
