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
	
	private void back() {
		view.dispose();
		// go back to admin start
	}
	
	private void submit() {
		String type = (String) view.typeComboBox.getSelectedItem();
		String status = (String) view.statusComboBox.getSelectedItem();
		String roomID = (String) view.idTextField.getText();
		if (service.addSensor(type, status, roomID)) {
			view.dispose();
			// go back to admin start
		} else {
			JOptionPane.showMessageDialog(null, "Invalid parameters");
		}
	}
}
