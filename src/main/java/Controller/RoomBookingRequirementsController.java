package Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JOptionPane;

import Service.RoomService;
import View.GuestSelectActionView;
import View.RoomBookingRequirementsView;

public class RoomBookingRequirementsController {
	private RoomBookingRequirementsView view;
	private RoomService service;
	
	public RoomBookingRequirementsController(RoomBookingRequirementsView view, RoomService service) {
		this.view = view;
		this.service = service;
		
		this.view.backButton.addActionListener(e -> back());
		this.view.bookRoomButton.addActionListener(e -> bookRoom());
	}

	private void bookRoom() {
		LocalDateTime sldt = ((Date) this.view.startDateTimeSpinner.getValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		LocalDateTime eldt = sldt.plusHours(1);
		String bookingID = service.createBooking(this.view.userID, this.view.roomIDTextField.getText(), sldt.toLocalDate(), eldt.toLocalDate(), sldt.toLocalTime(), eldt.toLocalTime(), this.view.paymentID);
		if (bookingID != null) {
			JOptionPane.showMessageDialog(null, "Your BookingID is " + bookingID);
			back();
		} else {
			JOptionPane.showMessageDialog(null, "Invalid booking");
		}
	}

	private void back() {
		GuestSelectActionView view = new GuestSelectActionView();
		new GuestSelectActionController(view, null);
		this.view.dispose();
		view.setVisible(true);
	}
}
