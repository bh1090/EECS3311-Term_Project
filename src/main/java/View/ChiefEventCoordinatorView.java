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
          JButton button3 = new JButton("Submit");

          button1.setBounds(150, 200, 220, 50);
          jframe.add(button1);
          button2.setBounds(150, 250, 220, 50);
          jframe.add(button2);
          jframe.setSize(500, 600);
          jframe.setLayout(null);
          jframe.setVisible(true);
          button1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    jframe.dispose();

                    JFrame frameCreateAdmin = new JFrame();
                    frameCreateAdmin.setSize(500, 600);
                    frameCreateAdmin.setLayout(null);

                    JLabel label1 = new JLabel("Enter the new admin's name: ");
                    frameCreateAdmin.add(label1);
                    JTextField newAdminName = new JTextField();
                    frameCreateAdmin.add(newAdminName);
                    label1.setBounds(25, 200, 150, 50);
                    newAdminName.setBounds(200, 200, 220, 50);

                    JLabel label2 = new JLabel("Enter the new admin's email: ");
                    frameCreateAdmin.add(label2);
                    JTextField newAdminEmail = new JTextField();
                    frameCreateAdmin.add(newAdminEmail);
                    label2.setBounds(25, 250, 150, 50);
                    newAdminEmail.setBounds(200, 250, 220, 50);

                    JLabel label3 = new JLabel("Enter the new admin's temporary password: ");
                    frameCreateAdmin.add(label3);
                    JTextField newAdminPassword = new JTextField();
                    frameCreateAdmin.add(newAdminPassword);
                    label3.setBounds(25, 300, 150, 50);
                    newAdminPassword.setBounds(200, 300, 220, 50);

                    frameCreateAdmin.setVisible(true);
                    button3.addActionListener(new ActionListener() {
                         public void actionPerformed(ActionEvent e) {
                              frameCreateAdmin.dispose();
                         }
                    });
                    chiefEventCoordinatorController.createAdmin(newAdminName.getText(), newAdminEmail.getText(), newAdminPassword.getText());

               }
          });
          button2.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    jframe.dispose();

                    JFrame frameRemoveAdmin = new JFrame();
                    JLabel label1 = new JLabel("Remove admin by their user ID: ");
                    frameRemoveAdmin.add(label1);
                    JTextField adminID = new JTextField();
                    frameRemoveAdmin.add(adminID);
                    label1.setBounds(50, 200, 150, 50);
                    adminID.setBounds(200, 200, 220, 50);

                    chiefEventCoordinatorController.removeAdmin(Integer.parseInt(adminID.getText()));
               }
          });
     }
}
