package view;
import javax.swing.*;
import java.awt.*;

public class PaymentView extends JFrame{
	public String UserID;
	public JTextField bookingIDTextField = new JTextField(1);
	public JTextField cardNumberTextField = new JTextField(1);
	public JTextField expiryTextField = new JTextField(1);
	public JTextField ccvTextField = new JTextField(1);
	public JButton backButton = new JButton("Back");
	public JButton payButton = new JButton("Pay");
	
	public PaymentView(String UserID) {
		this.UserID = UserID;
		
		setTitle("Payment");
		setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(6,2));
        add(new JLabel("User ID:"));
        add(new JLabel(this.UserID));
        add(new JLabel("booking ID:"));
        add(this.bookingIDTextField);
        
        add(new JLabel("Card Number:"));
        add(this.cardNumberTextField);
        add(new JLabel("MMYY:"));
        add(this.expiryTextField);
        add(new JLabel("CCV:"));
        add(this.ccvTextField);
        
        add(this.backButton);
        add(this.payButton);
        
		pack();
	}
}
