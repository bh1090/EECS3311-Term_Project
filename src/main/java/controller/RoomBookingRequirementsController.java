package controller;

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
		//logic
	}

	private void back() {
		this.view.dispose();
		//back
	}
}
