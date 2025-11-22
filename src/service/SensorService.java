package service;

import model.SensorData;
import repository.SensorRepository;

public class SensorService {
	private SensorRepository sensorRepository = new SensorRepository();

	public SensorService() {
	}
	
	public boolean addSensorData(String msg) {
		return this.sensorRepository.addSensorData(new SensorData(msg));
	}
	
	
}
