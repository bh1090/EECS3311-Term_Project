package View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Application.SessionData;

public class CheckoutView extends JFrame{
	public String UserID;
	public JTextField bookingIDTextField = new JTextField(1);
	public JButton backButton = new JButton("Back");
	public JButton checkoutButton = new JButton("Checkout");
	
	public CheckoutView() {
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
        add(this.checkoutButton);
        
		pack();
	}
}
