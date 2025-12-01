package Model.Sensor;

import java.time.LocalDateTime;

import com.opencsv.bean.CsvBindByName;

public class ScanIDSensorData extends OccupancySensorData {
	@CsvBindByName(column = "User ID")
	private String userID;
	@CsvBindByName(column = "Scan Outcome")
	private String scanOutcome;
	public ScanIDSensorData() {
	}
	public ScanIDSensorData(String logID, String sensorID, String userID, String scanOutcome, LocalDateTime dateTime) {
		super(logID, sensorID, dateTime);
		this.userID = userID;
		this.scanOutcome = scanOutcome;
	}

	public String getUserID() {
		return this.userID;
	}
	public String getScanOutcome() {
		return this.scanOutcome;
	}
}