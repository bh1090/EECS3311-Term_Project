package model;

import com.opencsv.bean.CsvBindByName;

import service.SensorService;

public class Sensor {
	@CsvBindByName(column = "Sensor ID")
	public String id;
	@CsvBindByName(column = "Type")
	public String type;
	@CsvBindByName(column = "Status")
	public String status;
	@CsvBindByName(column = "Room ID")
	public String roomID;
	public SensorService sensorService;
	
	public Sensor(String id, String type, String status, String roomID, SensorService sensorService) {
		this.id = id;
		this.type = type;
		this.status = status;
		this.roomID = roomID;
		this.sensorService = sensorService;
	}
}
