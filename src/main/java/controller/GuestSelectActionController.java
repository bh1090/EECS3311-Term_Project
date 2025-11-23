package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import service.RoomService;
import view.GuestSelectActionView;
import view.PaymentView;
import view.RescheduleBookingView;
import view.RoomBookingRequirementsView;

public class GuestSelectActionController {
	private GuestSelectActionView view;
	private Object service; // no service needed, can set null
	
	public GuestSelectActionController(GuestSelectActionView view, Object service) {
		this.view = view;
		this.service = service;
		
		view.availableRoomsButton.addActionListener(e -> foo(e));
		view.bookRoomButton.addActionListener(e -> foo(e));
		view.logoutButton.addActionListener(e -> foo(e));
		view.rescheduleRoomButton.addActionListener(e -> foo(e));
		view.checkinButton.addActionListener(e -> foo(e));
		view.checkoutButton.addActionListener(e -> foo(e));
	}
	
	private void foo(ActionEvent e) {
		this.view.dispose();
		String action = ((JButton) e.getSource()).getText();
		if (action.equals("Available Rooms")) {
			//todo
		} else if (action.equals("Book Room")) { //to pay
			PaymentView view = new PaymentView();
			RoomService service = new RoomService(); //unknown
			new PaymentViewController(view, service);
			view.setVisible(true);
		} else if (action.equals("Reschedule/Cancel Room")) { // to remove booking -> to pay -> to add new booking
			RescheduleBookingView view = new RescheduleBookingView();
			RoomService service = new RoomService(); //unknown
			new RescheduleBookingController(view, service);
			view.setVisible(true);
		} else if (action.equals("Checkin")) {
			CheckinView view = new CheckinView();
			RoomService roomService = new RoomService();
			SensorService sensorService = new SensorService();
			new CheckinController(view, roomService, sensorService);
			this.view.dispose();
			view.setVisible(true);
		} else if (action.equals("Checkout")) {
			CheckoutView view = new CheckoutView();
			RoomService roomService = new RoomService();
			SensorService sensorService = new SensorService();
			new CheckinController(view, roomService, sensorService);
			this.view.dispose();
			view.setVisible(true);
		} else if (action.equals("Logout")) {
			//todo
		}
	}
}
