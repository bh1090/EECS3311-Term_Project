package Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import Model.Sensor.OccupancySensor;
import Model.Sensor.OccupancySensorData;
import Model.Sensor.ScanIDSensor;
import Model.Sensor.ScanIDSensorData;
import Model.Sensor.Sensor;
import Repository.SensorRepository;

public class SensorService {
	private SensorRepository sensorRepository = new SensorRepository();
	
	public SensorService() {
	}
	
	public boolean addScanIDSensorData(String sensorID, String userID, String scanOutcome) {
		ThreadLocalRandom rng = ThreadLocalRandom.current();
		Set<String> ids = this.sensorRepository.getScanIDSensorLogsList().stream().map(d -> d.logID).collect(Collectors.toSet());
		String logID;
		for (logID = String.valueOf(rng.nextInt(Integer.MAX_VALUE)); ids.contains(logID); logID = String.valueOf(rng.nextInt(Integer.MAX_VALUE))) {
		}
		return this.sensorRepository.writeScanIDSensorLog(new ScanIDSensorData(logID, sensorID, userID, scanOutcome, LocalDateTime.now()));
	}
	
	public boolean addOccupancySensorData(String sensorID) {
		ThreadLocalRandom rng = ThreadLocalRandom.current();
		Set<String> ids = this.sensorRepository.getOccupancySensorLogsList().stream().map(d -> d.logID).collect(Collectors.toSet());
		String logID;
		for (logID = String.valueOf(rng.nextInt(Integer.MAX_VALUE)); ids.contains(logID); logID = String.valueOf(rng.nextInt(Integer.MAX_VALUE))) {
		}
		return this.sensorRepository.writeOccupancySensorLog(new OccupancySensorData(String.valueOf(logID), sensorID, LocalDateTime.now()));
	}
	
	public boolean addSensor(String type, String status, String roomID) {
		if (!(type.equals("Badge Scanner") || type.equals("Entry Sensor")) || !(status.equals("Enabled") || status.equals("Disabled"))) {
			return false;
		}
		ThreadLocalRandom rng = ThreadLocalRandom.current();
		String sensorID;
		for (sensorID = String.valueOf(rng.nextInt(Integer.MAX_VALUE)); this.sensorRepository.getSensorByID(sensorID) != null; sensorID = String.valueOf(rng.nextInt(Integer.MAX_VALUE))) {
		}
		this.sensorRepository.writeSensor(new Sensor(sensorID, type, status, roomID, false));
		return true;
	}
	
	public Sensor getSensorByRoomID(String id, String type) {
		return this.sensorRepository.getSensorByRoomIDType(id, type).stream().findFirst().orElse(null);
	}
	
	public List<List<String>> getSensorsFormatted() {
		return this.sensorRepository.getSensorsList().stream().map(s -> Arrays.asList(s.getID(), s.getType(), s.getStatus(), s.getRoomID())).collect(Collectors.toList());
	}
}
