package View;

import javax.swing.*;

public class AdminSelectActionView {
     public void handleAdminAction(){
          JFrame jframe = new JFrame();

          JButton button1 = new JButton("Add New Room");
          JButton button2 = new JButton("List Rooms");

          button1.setBounds(150, 200, 220, 50);
          jframe.add(button1);
          button2.setBounds(150, 200, 220, 50);
          jframe.add(button2);
          jframe.setSize(500, 600);
          jframe.setLayout(null);
          jframe.setVisible(true);
     }

}
