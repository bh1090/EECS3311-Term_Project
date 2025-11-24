package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import service.RoomService;
import service.SensorService;
import view.CheckinView;
import view.CheckoutView;
import view.GuestSelectActionView;
import view.PaymentView;
import view.RescheduleBookingView;
import view.RoomBookingRequirementsView;

//import view.WelcomeView;
//import view.RoomsListView;
//import service.RoomsListController;

public class GuestSelectActionController {
	private GuestSelectActionView view;
	private Object service; // no service needed, can set null
	
	public GuestSelectActionController(GuestSelectActionView view, Object service) {
		this.view = view;
		
		view.availableRoomsButton.addActionListener(e -> foo(e));
		view.bookRoomButton.addActionListener(e -> foo(e));
		view.logoutButton.addActionListener(e -> foo(e));
		view.rescheduleRoomButton.addActionListener(e -> foo(e));
		view.checkinButton.addActionListener(e -> foo(e));
		view.checkoutButton.addActionListener(e -> foo(e));
	}
	
	private void foo(ActionEvent e) {
		String action = ((JButton) e.getSource()).getText();
		if (action.equals("Available Rooms")) { //OTHER
//			this.view.dispose()
//			RoomsListView view = new RoomsListView(new RoomsListController(new RoomService()));
//			view.getListOfRooms();
		} else if (action.equals("Book Room")) { //to pay
			PaymentView view = new PaymentView();
			RoomService service = new RoomService(); //unknown
			new PaymentViewController(view, service);
			this.view.dispose();
			view.setVisible(true);
		} else if (action.equals("Reschedule/Cancel Room")) { // to remove booking -> to pay -> to add new booking
			RescheduleBookingView view = new RescheduleBookingView();
			RoomService service = new RoomService(); //unknown
			new RescheduleBookingController(view, service);
			this.view.dispose();
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
			new CheckoutController(view, roomService, sensorService);
			this.view.dispose();
			view.setVisible(true);
		} else if (action.equals("Logout")) { //OTHER
//			this.view.dispose();
//			WelcomeView();
		}
	}
	public static void main(String[] args) {
		GuestSelectActionView view = new GuestSelectActionView();
		new GuestSelectActionController(view, null);
		view.setVisible(true);
	}
}
