package model;

import service.SensorService;

public class Sensor {
	public String id;
	public SensorService sensorService;
	
	public Sensor(String id, SensorService sensorService) {
		this.id = id;
		this.sensorService = sensorService;
	}
	
	public boolean sendData(String msg) {
		sensorService.addSensorData(msg);
		return true;
	}
}
