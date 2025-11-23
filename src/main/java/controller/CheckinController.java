package controller;
import service.SensorService;
import view.CheckinView;
import view.GuestSelectActionView;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import service.CheckinService;

public class CheckinController {
	private CheckinView view;
	private CheckinService service;
	public CheckinController(CheckinView view, CheckinService service) {
		this.view = view;
		this.service = service;
		
		this.view.backButton.addActionListener(e -> back());
		this.view.checkinButton.addActionListener(e -> checkin());
	}
	
	private void checkin() {
		//logic
		//check if in 30min window, then booking.performcheckin()
		Booking booking = this.service.getBookingDetails(this.view.bookingIDTextField);
		if (booking == null) {
			JOptionPane.showMessageDialog(null, "Invalid bookingID");
			return;
		}
		if (!booking.getStatus().equals("CONFIRMED")) {
			JOptionPane.showMessageDialog(null, "Booking not confirmed");
			return;
		}
		LocalDateTime bookingDateTime = booking.getStartDate().atTime(booking.getStartTime());
		LocalDateTime nowDateTime = LocalDateTime.now();
		if (nowDateTime.isBefore(bookingDateTime.minusMinutes(30))) {
			JOptionPane.showMessageDialog(null, "Too early to checkin");
			return;
		}
		if (nowDateTime.isAfter(bookingDateTime)) {
			JOptionPane.showMessageDialog(null, "Booking passed");
			return;
		}
		service.performCheckIn(this.view.bookingIDTextField);
		JOptionPane.showMessageDialog(null, "Checked in");
		back();
	}
	private void back() {
		GuestSelectActionView view = new GuestSelectActionView();
		new GuestSelectActionController(view, null);
		this.view.dispose();
		view.setVisible(true);
	}
}
