package Model.Sensor;

import com.opencsv.bean.CsvBindByName;

public class Sensor {
	@CsvBindByName(column = "Sensor ID")
	protected String id;
	@CsvBindByName(column = "Type")
	protected String type;
	@CsvBindByName(column = "Status")
	protected String status;
	@CsvBindByName(column = "Room ID")
	protected String roomID;
	@CsvBindByName(column = "Occupied")
	protected boolean occupied;
	
	public Sensor(String id, String type, String status, String roomID, boolean occupied) {
		this.id = id;
		this.type = type;
		this.status = status;
		this.roomID = roomID;
		this.occupied = occupied;
	}

	public String getID() {
		return this.id;
	}

	public String getType() {
		return this.type;
	}

	public String getStatus() {
		return this.status;
	}

	public String getRoomID() {
		return this.roomID;
	}

	public boolean getOccupied() {
		return this.occupied;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	@Override
	public boolean equals(Object obj) { // id is same
		return obj instanceof Sensor && this.id.equals(((Sensor) obj).getID());
	}
}
