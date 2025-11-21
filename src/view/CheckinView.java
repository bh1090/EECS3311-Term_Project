package view;
import javax.swing.*;
import java.awt.*;

public class CheckinView extends JFrame{
	public String UserID;
	public JTextField roomIDTextField = new JTextField(1);
	public JButton backButton = new JButton("Back");
	public JButton checkinButton = new JButton("Checkin");
	
	public CheckinView(String UserID) {
		this.UserID = UserID;
		
		setTitle("Checkin");
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(3,2));
        add(new JLabel("User ID:"));
        add(new JLabel(this.UserID));
        add(new JLabel("Room ID:"));
        add(this.roomIDTextField);
        add(this.backButton);
        add(this.checkinButton);
        
		pack();
	}
}
