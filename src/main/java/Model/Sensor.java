package Model;

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
	
	
	public Sensor(String id2, String type2, String status2, String roomID2, boolean b) {
		// TODO Auto-generated constructor stub
	}
	public void setOccupied(boolean occupied) {
		// TODO Auto-generated method stub
		
	}
    
    // Note: I removed 'sensorService' as typically models don't hold service references.
    // If you explicitly need it, add: public SensorService sensorService; back here.
	
}