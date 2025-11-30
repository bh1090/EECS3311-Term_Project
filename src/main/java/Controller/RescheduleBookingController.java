package Controller;

import Service.RoomService;
import View.GuestSelectActionView;
import View.PaymentView;
import View.RescheduleBookingView;

public class RescheduleBookingController {
	private RescheduleBookingView view;
	private RoomService service;
	
	public RescheduleBookingController(RescheduleBookingView view, RoomService service) {
		this.view = view;
		this.service = service;
		
		this.view.backButton.addActionListener(e -> back());
		this.view.rescheduleBookingButton.addActionListener(e -> rescheduleBooking());
	}
	
	public void back() {
		GuestSelectActionView view = new GuestSelectActionView();
		new GuestSelectActionController(view, null);
		this.view.dispose();
		view.setVisible(true);
	}
	
	public void rescheduleBooking() {
		this.service.cancelBooking(this.view.bookingIDTextField.getText());
		PaymentView view = new PaymentView();
		RoomService paymentService = new RoomService();
		new PaymentViewController(view, paymentService);
		this.view.dispose();
		view.setVisible(true);
	}
}
