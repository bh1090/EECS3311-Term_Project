package controller;
import service.SensorService;
import view.SensorsListView;

public class SensorsListController {
	private SensorsListView view;
	private SensorService service;
	
	public SensorsListController(SensorsListView view, SensorService service) {
		this.service = new SensorService();
		this.view = new SensorsListView(this.service.getSensorsFormatted());
		
		view.backButton.addActionListener(e -> back());
	}
	
	private void back() {
		view.dispose();
		//next view
	}
}
