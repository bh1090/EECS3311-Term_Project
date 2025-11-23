package controller;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import application.SessionData;
import model.Booking;
import model.Sensor;
import service.RoomService;
import service.SensorService;
import view.CheckinView;
import view.GuestSelectActionView;

public class CheckoutController {
	private CheckinView view;
	private RoomService roomService;
	private SensorService sensorService;
	public CheckoutController(CheckinView view, RoomService roomService, SensorService sensorService) {
		this.view = view;
		this.roomService = roomService;
		this.sensorService = sensorService;
		
		this.view.backButton.addActionListener(e -> back());
		this.view.checkinButton.addActionListener(e -> checkout());
	}
	private void checkout() {
		boolean pass = true;
		Booking booking = this.roomService.getBookingDetails(this.view.bookingIDTextField.getText());
		LocalDateTime bookingDateTime;
		LocalDateTime nowDateTime;
		if (booking == null) {
			JOptionPane.showMessageDialog(null, "Invalid bookingID");
			pass = false;
		} else if (!booking.getStatus().equals("CONFIRMED")) {
			JOptionPane.showMessageDialog(null, "Booking not confirmed");
			pass = false;
		} else {
			bookingDateTime = booking.getStartDate().atTime(booking.getStartTime());
			nowDateTime = LocalDateTime.now();
			if (nowDateTime.isBefore(bookingDateTime.minusMinutes(30))) {
				JOptionPane.showMessageDialog(null, "Too early to checkin");
				pass = false;
			} else if (nowDateTime.isAfter(bookingDateTime)) {
				JOptionPane.showMessageDialog(null, "Booking passed");
				pass = false;
			}
		}
		roomService.performCheckOut(this.view.bookingIDTextField.getText());
		Sensor badgeScanner = sensorService.getSensorByRoomID(booking.getRoomId(), "Badge Scanner");
		if (badgeScanner != null) {
			if (pass) {
				sensorService.addScanIDSensorData(badgeScanner.id, SessionData.getCurrentUser().getId(), "Accepted");				
			} else {
				sensorService.addScanIDSensorData(badgeScanner.id, SessionData.getCurrentUser().getId(), "Denied");
				return;
			}
		}
		Sensor entrySensor = sensorService.getSensorByRoomID(booking.getRoomId(), "Entry Sensor");
		if (entrySensor != null) {			
			sensorService.addOccupancySensorSensorData(entrySensor.id);
		}
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
