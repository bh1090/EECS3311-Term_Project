package model;

import service.SensorService;

public class OccupancySensor extends Sensor{
	public OccupancySensor(String id, String type, String status, String roomID, SensorService sensorService) {
		super(id, type, status, roomID, sensorService);
		// TODO Auto-generated constructor stub
	}
}
