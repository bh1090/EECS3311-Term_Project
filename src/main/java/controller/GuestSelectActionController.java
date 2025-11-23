package controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import view.GuestSelectActionView;

public class GuestSelectActionController {
	private GuestSelectActionView view;
	private Object service; // no service needed
	
	public GuestSelectActionController(GuestSelectActionView view, Object service) {
		this.view = view;
		this.service = service;
		
		view.availableRoomsButton.addActionListener(e -> foo(e));
		view.bookRoomButton.addActionListener(e -> foo(e));
		view.logoutButton.addActionListener(e -> foo(e));
		view.payButton.addActionListener(e -> foo(e));
		view.rescheduleRoomButton.addActionListener(e -> foo(e));
	}
	
	private void foo(ActionEvent e) {
		String action = ((JButton) e.getSource()).getText();
		if (action.equals("Available Rooms")) {
			//todo
		} else if (action.equals("Book Room")) {
			
		} else if (action.equals("Reschedule Room")) {
			
		} else if (action.equals("Pay")) {
			
		} else if (action.equals("Logout")) {
			
		}
	}
}
