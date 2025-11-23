package view;
import javax.swing.*;
import java.awt.*;

public class GuestSelectActionView extends JFrame{
	public String UserID;
	public JButton availableRoomsButton = new JButton("Available Rooms");
	public JButton bookRoomButton = new JButton("Book Room");
	public JButton rescheduleRoomButton = new JButton("Reschedule Room");
	public JButton payButton = new JButton("Pay");
	public JButton logoutButton = new JButton("Logout");
	
	public GuestSelectActionView(String UserID) {
		this.UserID = UserID;
		
		setTitle("Guest Select Action");
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(5,2));
		add(new JLabel("User ID:"));
        add(new JLabel(this.UserID));
        add(availableRoomsButton);
        add(bookRoomButton);
        add(rescheduleRoomButton);
        add(payButton);
        add(logoutButton);
		
		pack();
	}
}
