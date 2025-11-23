package view;
import javax.swing.*;
import java.awt.*;

public class PaymentView extends JFrame{
	public String UserID;
	public JTextField bookingIDTextField = new JTextField(1);
	public JCheckBox institutionalBillingCheckBox = new JCheckBox("Institutional billing");
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
        
        setLayout(new GridLayout(7,2));
        add(new JLabel("User ID:"));
        add(new JLabel(this.UserID));
        add(new JLabel("booking ID:"));
        add(this.bookingIDTextField);
        add(this.institutionalBillingCheckBox);
        add(new JLabel(""));
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
