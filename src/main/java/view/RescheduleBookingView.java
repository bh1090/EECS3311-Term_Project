package view;
import javax.swing.*;

import application.SessionData;

import java.awt.*;

public class RescheduleBookingView extends JFrame{
	public String UserID;
	public JTextField bookingIDTextField = new JTextField(1);
	public JButton backButton = new JButton("Back");
	public JButton rescheduleBookingButton = new JButton("Reschedule Booking");
	
	public RescheduleBookingView() {
		this.UserID = SessionData.getCurrentUser().getId();
		
		setTitle("Reschedule Booking");
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(3,2));
        add(new JLabel("User ID:"));
        add(new JLabel(this.UserID));
        add(new JLabel("Booking ID:"));
        add(this.bookingIDTextField);
        add(this.backButton);
        add(this.rescheduleBookingButton);
        
        pack();
	}
}
