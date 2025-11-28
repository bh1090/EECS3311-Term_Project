package Model;


public class ScanIDSensor extends Sensor{
	public ScanIDSensor(String id, String type, String status, String roomID, SensorService sensorService) {
		super(id, type, status, roomID, false, sensorService);
		//occupied should never be true
	}
}
