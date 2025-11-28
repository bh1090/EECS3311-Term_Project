package Model.Sensor;

import java.time.LocalDateTime;

public class OccupancySensorData {
	// @CsvBindByName(column = "Log ID")
	public String logID;
	// @CsvBindByName(column = "Sensor ID")
	public String sensorID;
	// @CsvBindByName(column = "DateTime")
	public LocalDateTime dateTime;
	public OccupancySensorData(String logID, String sensorID, LocalDateTime dateTime) {
		this.logID = logID;
		this.sensorID = sensorID;
		this.dateTime = dateTime;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof OccupancySensorData && this.logID.equals(((OccupancySensorData) obj).logID);
	}
}
