package view;
import javax.swing.*;
import java.awt.*;

public class RoomBookingRequirementsView extends JFrame{
	public String UserID;
	public JTextField roomIDTextField = new JTextField(1);
	public JSpinner startDateTimeSpinner = new JSpinner(new SpinnerDateModel());
	public JSpinner endDateTimeSpinner = new JSpinner(new SpinnerDateModel());
	public JButton backButton = new JButton("Back");
	public JButton bookRoomButton = new JButton("Book Room");
	
	public RoomBookingRequirementsView(String UserID) {
		this.UserID = UserID;
		
		this.startDateTimeSpinner.setEditor(new JSpinner.DateEditor(startDateTimeSpinner, "yyyy, MMMM dd hh:mm aa"));
		this.endDateTimeSpinner.setEditor(new JSpinner.DateEditor(startDateTimeSpinner, "yyyy, MMMM dd hh:mm aa"));
		
		setTitle("Book Room");
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(5,2));
        add(new JLabel("User ID:"));
        add(new JLabel(this.UserID));
        add(new JLabel("Room ID:"));
        add(this.roomIDTextField);
        add(new JLabel("Start datetime:"));
        add(this.startDateTimeSpinner);
        add(new JLabel("End datetime:"));
        add(this.endDateTimeSpinner);
        add(this.backButton);
        add(this.bookRoomButton);
        
        pack();
	}
}
