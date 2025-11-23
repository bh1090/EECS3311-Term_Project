package controller;

import javax.swing.JOptionPane;

import service.RoomService;
import view.PaymentView;

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
				this.view.ccvTextField.getText().length() == 3 && this.view.ccvTextField.getText().matches("\\d+")) {
			JOptionPane.showMessageDialog(null, "Thank you!");
			back();
		} else {
			JOptionPane.showMessageDialog(null, "invalid parameters");
		}
	}

	private void back() {
		this.view.dispose();
		//todo: next view
	}
}
