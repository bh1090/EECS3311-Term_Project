package Model;

import java.time.LocalDateTime;

import com.opencsv.bean.CsvBindByName;

public class OccupancySensorData {
	@CsvBindByName(column = "Log ID")
	public String logID;
	@CsvBindByName(column = "Sensor ID")
	public String sensorID;
	@CsvBindByName(column = "DateTime")
	public LocalDateTime dateTime;
	public OccupancySensorData(String logID, String sensorID, LocalDateTime dateTime) {
		this.logID = logID;
		this.sensorID = sensorID;
		this.dateTime = dateTime;
	}
}
