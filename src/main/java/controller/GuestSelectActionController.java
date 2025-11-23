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
	private Object service; // no service needed
	
	public GuestSelectActionController(GuestSelectActionView view, Object service) {
		this.view = view;
		this.service = service;
		
		view.availableRoomsButton.addActionListener(e -> foo(e));
		view.bookRoomButton.addActionListener(e -> foo(e));
		view.logoutButton.addActionListener(e -> foo(e));
		view.payButton.addActionListener(e -> foo(e));
		view.rescheduleRoomButton.addActionListener(e -> foo(e));
	}
	
	private void foo(ActionEvent e) {
		this.view.dispose();
		String action = ((JButton) e.getSource()).getText();
		if (action.equals("Available Rooms")) {
			//todo
		} else if (action.equals("Book Room")) {
			RoomBookingRequirementsView view = new RoomBookingRequirementsView(this.view.UserID);
			RoomService service = new RoomService(); //unknown
			new RoomBookingRequirementsController(view, service);
			view.setVisible(true);
		} else if (action.equals("Reschedule Room")) {
			RescheduleBookingView view = new RescheduleBookingView(this.view.UserID);
			RoomService service = new RoomService(); //unknown
			new RescheduleBookingController(view, service);
			view.setVisible(true);
		} else if (action.equals("Pay")) {
			PaymentView view = new PaymentView(this.view.UserID);
			RoomService service = new RoomService(); //unknown
			new PaymentViewController(view, service);
			view.setVisible(true);
		} else if (action.equals("Logout")) {
			//todo
		}
	}
}
