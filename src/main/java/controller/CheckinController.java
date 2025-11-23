package controller;
import service.SensorService;
import view.CheckinView;
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
	}
	private void back() {
		this.view.dispose();
		//todo: next view
	}
}
