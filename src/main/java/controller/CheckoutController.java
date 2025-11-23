package controller;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import application.SessionData;
import model.Booking;
import model.Sensor;
import service.RoomService;
import service.SensorService;
import view.CheckinView;
import view.CheckoutView;
import view.GuestSelectActionView;

public class CheckoutController {
	private CheckoutView view;
	private RoomService roomService;
	private SensorService sensorService;
	public CheckoutController(CheckoutView view, RoomService roomService, SensorService sensorService) {
		this.view = view;
		this.roomService = roomService;
		this.sensorService = sensorService;
		
		this.view.backButton.addActionListener(e -> back());
		this.view.checkoutButton.addActionListener(e -> checkout());
	}
	private void checkout() {
		boolean pass = true;
		Booking booking = this.roomService.getBookingDetails(this.view.bookingIDTextField.getText());
		if (booking == null || !this.view.UserID.equals(booking.getUserId())) {
			JOptionPane.showMessageDialog(null, "Invalid bookingID");
			pass = false;
		} else if (!booking.getStatus().equals("CHECKED_IN")) {
			JOptionPane.showMessageDialog(null, "Booking not checked in");
			pass = false;
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
		entrySensor.occupied = false;
		if (entrySensor != null) {			
			sensorService.addOccupancySensorData(entrySensor.id);
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
