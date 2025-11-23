package model;

import service.SensorService;

public class ScanIDSensor extends Sensor{
	public ScanIDSensor(String id, String type, String status, String roomID, boolean occupied, SensorService sensorService) {
		super(id, type, status, roomID, occupied, sensorService);
		// TODO Auto-generated constructor stub
	}
}
