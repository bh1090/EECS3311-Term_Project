package Model.Sensor;

import java.time.LocalDateTime;

import com.opencsv.bean.CsvBindByName;

public class ScanIDSensorData extends OccupancySensorData {
	@CsvBindByName(column = "User ID")
	public String userID;
	@CsvBindByName(column = "Scan Outcome")
	public String scanOutcome;
	public ScanIDSensorData() {
	}
	public ScanIDSensorData(String logID, String sensorID, String userID, String scanOutcome, LocalDateTime dateTime) {
		super(logID, sensorID, dateTime);
		this.userID = userID;
		this.scanOutcome = scanOutcome;
	}
}