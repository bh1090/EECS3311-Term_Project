package view;
import javax.swing.*;
import java.awt.*;

import application.SessionData;

public class CheckinView extends JFrame{
	public String UserID;
	public JTextField bookingIDTextField = new JTextField(1);
	public JButton backButton = new JButton("Back");
	public JButton checkinButton = new JButton("Checkin");
	
	public CheckinView() {
		this.UserID = SessionData.getCurrentUser().getId();
		
		setTitle("Checkin");
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(3,2));
        add(new JLabel("User ID:"));
        add(new JLabel(this.UserID));
        add(new JLabel("Booking ID:"));
        add(this.bookingIDTextField);
        add(this.backButton);
        add(this.checkinButton);
        
		pack();
	}
}
