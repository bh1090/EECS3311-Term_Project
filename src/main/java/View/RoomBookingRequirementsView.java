package View;
import javax.swing.*;

import Application.SessionData;

import java.awt.*;

public class RoomBookingRequirementsView extends JFrame{
	public String userID;
	public String paymentID;
	public JTextField roomIDTextField = new JTextField(1);
	public JSpinner startDateTimeSpinner = new JSpinner(new SpinnerDateModel());
	public JButton backButton = new JButton("Back");
	public JButton bookRoomButton = new JButton("Book Room");
	
	public RoomBookingRequirementsView(String paymentID) {
		this.userID = SessionData.getCurrentUser().getId();
		this.paymentID = paymentID;
		
		this.startDateTimeSpinner.setEditor(new JSpinner.DateEditor(startDateTimeSpinner, "yyyy, MMMM dd hh:mm aa"));
		
		setTitle("Book Room");
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(5,2));
        add(new JLabel("User ID:"));
        add(new JLabel(this.userID));
        add(new JLabel("Payment ID:"));
        add(new JLabel(this.paymentID));
        add(new JLabel("Room ID:"));
        add(this.roomIDTextField);
        add(new JLabel("Start datetime:"));
        add(this.startDateTimeSpinner);
        add(this.backButton);
        add(this.bookRoomButton);
        
        pack();
	}
}
