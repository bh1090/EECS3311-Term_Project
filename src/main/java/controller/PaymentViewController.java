package controller;

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
		//logic
	}

	private void back() {
		this.view.dispose();
		//todo: next view
	}
}
