package Model.Sensor;

public class ScanIDSensor extends Sensor {
	public ScanIDSensor(String id, String type, String status, String roomID) {
		super(id, type, status, roomID, false);
		//occupied should never be true
	}

	@Override
	public void setOccupied(boolean occupied) {
		this.occupied = false; // cannot set occupied
	}
}