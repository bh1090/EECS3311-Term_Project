package controller;
import service.SensorService;
import view.CheckinView;
import view.GuestSelectActionView;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import application.SessionData;
import model.Booking;
import model.Sensor;
import service.RoomService;

public class CheckinController {
	private CheckinView view;
	private RoomService roomService;
	private SensorService sensorService;
	public CheckinController(CheckinView view, RoomService roomService, SensorService sensorService) {
		this.view = view;
		this.roomService = roomService;
		this.sensorService = sensorService;
		
		this.view.backButton.addActionListener(e -> back());
		this.view.checkinButton.addActionListener(e -> checkin());
	}
	
	private void checkin() {
		boolean pass = true;
		Booking booking = this.roomService.getBookingDetails(this.view.bookingIDTextField.getText());
		LocalDateTime bookingDateTime;
		LocalDateTime nowDateTime;
		if (booking == null || !this.view.UserID.equals(booking.getUserId())) {
			JOptionPane.showMessageDialog(null, "Invalid bookingID");
			pass = false;
		} else if (!booking.getStatus().equals("CHECKED_IN")) {
			JOptionPane.showMessageDialog(null, "Booking not checked in");
			pass = false;
		}
		roomService.performCheckIn(this.view.bookingIDTextField.getText());
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
		entrySensor.occupied = true;
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
