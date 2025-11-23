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
	
	private void back() { //OTHER
		this.view.dispose();
		RoomService serivce = new RoomService();
		AdminSelectActionController controller = new AdminSelectActionController(new AddRoomController(service), new RoomsListController(service));
		AdminSelectActionView view = new AdminSelectActionView(controller);
		view.handleAdminAction();
	}
}
