package Controller;

import javax.swing.JOptionPane;

import Application.SessionData;
import Model.Room.Booking;
import Model.Sensor.Sensor;
import Service.RoomService;
import Service.SensorService;
import View.CheckoutView;
import View.GuestSelectActionView;

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
		Sensor badgeScanner;
		if (booking != null) {
			badgeScanner = sensorService.getSensorByRoomID(booking.getRoomId(), "Badge Scanner");
		} else {
			return;
		}
		if (badgeScanner != null) {
			if (pass) {
				sensorService.addScanIDSensorData(badgeScanner.getID(), SessionData.getCurrentUser().getId(), "Accepted");				
			} else {
				sensorService.addScanIDSensorData(badgeScanner.getID(), SessionData.getCurrentUser().getId(), "Denied");
				return;
			}
		}
		Sensor entrySensor = sensorService.getSensorByRoomID(booking.getRoomId(), "Entry Sensor");
		if (entrySensor != null) {			
			entrySensor.setOccupied(false);
			sensorService.addOccupancySensorData(entrySensor.getID());
		}
		JOptionPane.showMessageDialog(null, "Checked out");
		back();
	}
	private void back() {
		GuestSelectActionView view = new GuestSelectActionView();
		new GuestSelectActionController(view, null);
		this.view.dispose();
		view.setVisible(true);
	}
}
