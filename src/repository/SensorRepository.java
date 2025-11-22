package repository;

import java.util.List;
import java.util.Map;

import database.Database;

import model.Sensor;
import model.SensorData;

public class SensorRepository {
	private Database db = Database.getInstance();
	public SensorRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean addSensor(Sensor sensor) { // should not be null
		this.db.sensors.add(sensor);
		this.db.save();
		return true;
	}
	
	public boolean deleteSensorByID(String ID) {
		boolean ret = this.db.sensors.remove(this.db.sensors.stream().filter(s -> s.id.equals(ID)).findFirst().orElse(null));
		this.db.save();
		return ret;
	}
	
	public Sensor getSensorByID(String ID) {
		return this.db.sensors.stream().filter(s -> s.id.equals(ID)).findFirst().orElse(null);
	}
	
	public boolean addSensorData(SensorData sensorData) { // should not be null
		this.db.sensorData.add(sensorData);
		this.db.save();
		return true;
	}
	
	public List<SensorData> getSensorDataList() {
		return this.db.sensorData;
	}
}
