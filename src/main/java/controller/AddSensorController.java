package controller;
import javax.swing.JOptionPane;

import service.SensorService;
import view.AddSensorView;

public class AddSensorController {
	private AddSensorView view;
	private SensorService service;
	
	public AddSensorController(AddSensorView view, SensorService service) {
		this.view = view;
		this.service = service;
		
		this.view.backButton.addActionListener(e -> back());
		this.view.submitButton.addActionListener(e -> submit());
	}
	
	private void back() { //OTHER
		this.view.dispose();
//		RoomService serivce = new RoomService();
//		AdminSelectActionController controller = new AdminSelectActionController(new AddRoomController(service), new RoomsListController(service));
//		AdminSelectActionView view = new AdminSelectActionView(controller);
//		view.handleAdminAction();
	}
	
	private void submit() {
		String type = (String) view.typeComboBox.getSelectedItem();
		String status = (String) view.statusComboBox.getSelectedItem();
		String roomID = (String) view.idTextField.getText();
		if (service.addSensor(type, status, roomID)) {
			JOptionPane.showMessageDialog(null, "Added");
			back();
		} else {
			JOptionPane.showMessageDialog(null, "Invalid parameters");
		}
	}
}
