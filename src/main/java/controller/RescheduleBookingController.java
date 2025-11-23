package controller;
//import service.RoomService;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JOptionPane;

import service.RoomService;
import view.RescheduleBookingView;

public class RescheduleBookingController {
	private RescheduleBookingView view;
	private RoomService service;
	
	public RescheduleBookingController(RescheduleBookingView view, RoomService service) {
		this.view = view;
		this.service = service;
		
		this.view.backButton.addActionListener(e -> back());
		this.view.rescheduleBookingButton.addActionListener(e -> back());
	}
	
	public void back() {
		this.view.dispose();
		//todo: next view
	}
	
	public void rescheduleBooking() {
		
		LocalDateTime sldt = ((Date) this.view.startDateTimeSpinner.getValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		LocalDateTime eldt = ((Date) this.view.endDateTimeSpinner.getValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		if (service.createBooking(this.view.UserID, this.view.roomIDTextField.getText(), sldt.toLocalDate(), eldt.toLocalDate(), sldt.toLocalTime(), eldt.toLocalTime())) {
			back();
		} else {
			JOptionPane.showMessageDialog(null, "Invalid booking");
		}
	}
}
