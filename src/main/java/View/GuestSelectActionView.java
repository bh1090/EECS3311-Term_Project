package View;
import javax.swing.*;

import Application.SessionData;

import java.awt.*;

public class GuestSelectActionView extends JFrame{
	public String userID;
	public JButton availableRoomsButton = new JButton("Available Rooms");
	public JButton bookRoomButton = new JButton("Book Room");
	public JButton rescheduleRoomButton = new JButton("Reschedule/Cancel Room");
	public JButton logoutButton = new JButton("Logout");
	public JButton checkinButton = new JButton("Checkin");
	public JButton checkoutButton = new JButton("Checkout");
	
	public GuestSelectActionView() {
		this.userID = SessionData.getCurrentUser().getId();
		
		setTitle("Guest Select Action");
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(4,2));
		add(new JLabel("User ID:"));
        add(new JLabel(this.userID));
        add(availableRoomsButton);
        add(bookRoomButton);
		add(checkinButton);
		add(checkoutButton);
        add(logoutButton);
        add(rescheduleRoomButton);
		
		pack();
	}
}
