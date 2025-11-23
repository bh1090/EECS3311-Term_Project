package controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JOptionPane;

import service.RoomService;
import view.RoomBookingRequirementsView;

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
		LocalDateTime eldt = ((Date) this.view.endDateTimeSpinner.getValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		if (service.createBooking(this.view.UserID, this.view.roomIDTextField.getText(), sldt.toLocalDate(), eldt.toLocalDate(), sldt.toLocalTime(), eldt.toLocalTime())) {
			back();
		} else {
			JOptionPane.showMessageDialog(null, "Invalid booking");
		}
	}

	private void back() {
		this.view.dispose();
		//todo: next view
	}
}
