package Controller;

import javax.swing.JOptionPane;

import Application.SessionData;
import Service.RoomService;
import View.GuestSelectActionView;
import View.PaymentView;
import View.RoomBookingRequirementsView;

public class PaymentViewController {
	private PaymentView view;
	private RoomService service;
	
	public PaymentViewController(PaymentView view, RoomService service) {
		this.view = view;
		this.service = service;
		
		this.view.backButton.addActionListener(e -> back());
		this.view.payButton.addActionListener(e -> pay());
	}

	private void pay() {
		if (this.view.institutionalBillingCheckBox.isSelected() ||
				this.view.cardNumberTextField.getText().length() == 16 && this.view.cardNumberTextField.getText().matches("\\d+") &&
				this.view.expiryTextField.getText().length() == 4 && this.view.expiryTextField.getText().matches("\\d+") &&
				this.view.ccvTextField.getText().length() == 3 && this.view.ccvTextField.getText().matches("\\d+")) { //make payment id, 
			String paymentId = "TXN-" + System.currentTimeMillis();
			this.service.savePayment(paymentId, SessionData.getCurrentUser().getHourlyRate());
			RoomBookingRequirementsView view = new RoomBookingRequirementsView(paymentId);
			RoomService roomService = new RoomService();
			new RoomBookingRequirementsController(view, roomService);
			this.view.dispose();
			view.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "invalid parameters");
		}
	}

	private void back() {
		GuestSelectActionView view = new GuestSelectActionView();
		new GuestSelectActionController(view, null);
		this.view.dispose();
		view.setVisible(true);
	}
}
