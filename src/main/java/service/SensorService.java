package service;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import model.OccupancySensorData;
import model.ScanIDSensorData;
import repository.SensorRepository;

public class SensorService {
	private SensorRepository sensorRepository = new SensorRepository();

	public SensorService() {
	}
	
	public boolean addScanIDSensorData(String sensorID, String userID, String scanOutcome) {
		ThreadLocalRandom rng = ThreadLocalRandom.current();
		Set<String> ids = this.sensorRepository.getScanIDSensorDataList().stream().map(d -> d.logID).collect(Collectors.toSet());
		String logID;
		for (logID = String.valueOf(rng.nextInt(Integer.MAX_VALUE)); ids.contains(logID); logID = String.valueOf(rng.nextInt(Integer.MAX_VALUE))) {
		}
		return this.sensorRepository.addScanIDSensorData(new ScanIDSensorData(String.valueOf(logID), sensorID, userID, scanOutcome, LocalDateTime.now()));
	}
	
	public boolean addOccupancySensorSensorData(String sensorID, String userID, String scanOutcome) {
		ThreadLocalRandom rng = ThreadLocalRandom.current();
		Set<String> ids = this.sensorRepository.getOccupancySensorDataList().stream().map(d -> d.logID).collect(Collectors.toSet());
		String logID;
		for (logID = String.valueOf(rng.nextInt(Integer.MAX_VALUE)); ids.contains(logID); logID = String.valueOf(rng.nextInt(Integer.MAX_VALUE))) {
		}
		return this.sensorRepository.addoccupancySensorData(new OccupancySensorData(String.valueOf(logID), sensorID, LocalDateTime.now()));
	}
	
	public boolean addSensor() {
		
	}
}
