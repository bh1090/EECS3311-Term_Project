package Model.Sensor;

import java.time.LocalDateTime;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class OccupancySensorData {
	 @CsvBindByName(column = "Log ID")
	public String logID;
	 @CsvBindByName(column = "Sensor ID")
	public String sensorID;
	 @CsvDate("yyyy-MM-dd'T'HH:mm")
	public LocalDateTime dateTime;
	public OccupancySensorData() {
		// TODO Auto-generated constructor stub
	}
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
