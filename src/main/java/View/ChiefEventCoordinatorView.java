package View;

import Controller.ChiefEventCoordinatorController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChiefEventCoordinatorView {
     private final ChiefEventCoordinatorController chiefEventCoordinatorController;
     public ChiefEventCoordinatorView(ChiefEventCoordinatorController chiefEventCoordinatorController) {
          this.chiefEventCoordinatorController = chiefEventCoordinatorController;
     }

     public void handleChiefCoordinatorAction() {
          JFrame jframe = new JFrame();

          JButton button1 = new JButton("Create Admin");
          JButton button3 = new JButton("Submit");

          button1.setBounds(150, 200, 220, 50);
          jframe.add(button1);
          jframe.setSize(500, 600);
          jframe.setLayout(null);
          jframe.setVisible(true);
          button1.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                    jframe.dispose();

                    JFrame frameCreateAdmin = new JFrame();
                    frameCreateAdmin.setSize(500, 600);
                    frameCreateAdmin.setLayout(null);

                    JLabel label1 = new JLabel("Enter the new admin's name: ");
                    frameCreateAdmin.add(label1);
                    JTextField newAdminName = new JTextField();
                    frameCreateAdmin.add(newAdminName);
                    label1.setBounds(25, 200, 200, 50);
                    newAdminName.setBounds(200, 200, 220, 50);

                    JLabel label2 = new JLabel("Enter the new admin's email: ");
                    frameCreateAdmin.add(label2);
                    JTextField newAdminEmail = new JTextField();
                    frameCreateAdmin.add(newAdminEmail);
                    label2.setBounds(25, 250, 200, 50);
                    newAdminEmail.setBounds(200, 250, 220, 50);

                    JLabel label3 = new JLabel("Set temporary password: ");
                    frameCreateAdmin.add(label3);
                    JPasswordField newAdminPassword = new JPasswordField();
                    frameCreateAdmin.add(newAdminPassword);
                    label3.setBounds(25, 300, 200, 50);
                    newAdminPassword.setBounds(200, 300, 220, 50);

                    button3.setBounds(150, 350, 220, 50);
                    frameCreateAdmin.add(button3);

                    frameCreateAdmin.setVisible(true);

                    button3.addActionListener(new ActionListener() {
                         @Override
                         public void actionPerformed(ActionEvent e) {
                              String name = newAdminName.getText();
                              String email = newAdminEmail.getText();
                              String password = newAdminPassword.getText();
                              if (name == null || name.trim().isEmpty()) {
                                   JOptionPane.showMessageDialog(frameCreateAdmin, "Name cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
                                   return;
                              }
                              if (email == null || email.trim().isEmpty()) {
                                   JOptionPane.showMessageDialog(frameCreateAdmin, "Email cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
                                   return;
                              }
                              if (!isValidEmail(email)) {
                                   JOptionPane.showMessageDialog(frameCreateAdmin, "Invalid email format.", "Input Error", JOptionPane.ERROR_MESSAGE);
                                   return;
                              }
                              if (password == null || password.trim().isEmpty()) {
                                   JOptionPane.showMessageDialog(frameCreateAdmin, "Password cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
                                   return;
                              }
                              chiefEventCoordinatorController.createAdmin(name, email, password);
                              frameCreateAdmin.dispose();
                         }
                    });
               }
          });
     }
}
