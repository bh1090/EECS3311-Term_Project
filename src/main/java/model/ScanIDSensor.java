package model;

import service.SensorService;

public class ScanIDSensor extends Sensor{
	public ScanIDSensor(String id, String type, String status, String roomID, SensorService sensorService) {
		super(id, type, status, roomID, sensorService);
		// TODO Auto-generated constructor stub
	}
}
