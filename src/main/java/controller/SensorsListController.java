package controller;
import service.SensorService;

public class SensorsListController {
	SensorService sensorService;
	public SensorsListController(SensorService sensorService) {
		this.sensorService = sensorService;
	}
}
