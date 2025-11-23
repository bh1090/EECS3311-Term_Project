package controller;
//import service.RoomService;

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
		
	}
	
	public void rescheduleBooking() {
		
	}
}
