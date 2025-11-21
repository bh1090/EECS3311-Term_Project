package view;
import javax.swing.*;
import java.awt.*;

public class RescheduleBookingView extends JFrame{
	public String UserID;
	public JTextField bookingIDTextField = new JTextField(1);
	public JTextField roomIDTextField = new JTextField(1);
	public JSpinner startDateTimeSpinner = new JSpinner(new SpinnerDateModel());
	public JSpinner endDateTimeSpinner = new JSpinner(new SpinnerDateModel());
	public JButton backButton = new JButton("Back");
	public JButton rescheduleBookingButton = new JButton("Reschedule Booking");
	public RescheduleBookingView(String UserID) {
		this(UserID, null);
	}
	
	public RescheduleBookingView(String UserID, String BookingID) {
		this.UserID = UserID;
		this.bookingIDTextField.setText(BookingID);
		
		this.startDateTimeSpinner.setEditor(new JSpinner.DateEditor(startDateTimeSpinner, "yyyy, MMMM dd hh:mm aa"));
		this.endDateTimeSpinner.setEditor(new JSpinner.DateEditor(startDateTimeSpinner, "yyyy, MMMM dd hh:mm aa"));
		
		setTitle("Reschedule Booking");
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(6,2));
        add(new JLabel("User ID:"));
        add(new JLabel(this.UserID));
        add(new JLabel("Booking ID:"));
        add(this.bookingIDTextField);
        add(new JLabel("Room ID:"));
        add(this.roomIDTextField);
        add(new JLabel("Start datetime:"));
        add(this.startDateTimeSpinner);
        add(new JLabel("End datetime:"));
        add(this.endDateTimeSpinner);
        add(this.backButton);
        add(this.rescheduleBookingButton);
        
        pack();
	}
}
