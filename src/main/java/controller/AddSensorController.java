package controller;
import service.SensorService;

public class AddSensorController {
	final SensorService sensorService;
	public AddSensorController(SensorService sensorService) {
		this.sensorService = sensorService;
	}
}
