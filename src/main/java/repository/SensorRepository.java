package repository;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import database.Database;

import model.Sensor;
import model.OccupancySensorData;
import model.ScanIDSensorData;

public class SensorRepository {
	private Database db = Database.getInstance();
	public SensorRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Sensor> readSensorsCSV() {
		try {
			return new CsvToBeanBuilder<Sensor>(new FileReader(db.sensorsPath))
					.withType(Sensor.class)
					.build()
					.parse();
		} catch (Exception e) {
			return null;
		}
	}
	
	private boolean writeSensorsCSV(List<Sensor> sensors) {
		try {
			FileWriter writer = new FileWriter(db.sensorsPath);
			StatefulBeanToCsv<Sensor> beanToCsv = new StatefulBeanToCsvBuilder<Sensor>(writer).build();
            beanToCsv.write(sensors);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	private List<OccupancySensorData> readOccupancySensorLogsCSV() {
		try {
			return new CsvToBeanBuilder<OccupancySensorData>(new FileReader(db.occupancySensorLogsPath))
					.withType(OccupancySensorData.class)
					.build()
					.parse();
		} catch (Exception e) {
			return null;
		}
	}
	
	private boolean writeOccupancySensorLogsCSV(List<OccupancySensorData> occupancySensorLogs) {
		try {
			FileWriter writer = new FileWriter(db.occupancySensorLogsPath);
			StatefulBeanToCsv<OccupancySensorData> beanToCsv = new StatefulBeanToCsvBuilder<OccupancySensorData>(writer).build();
            beanToCsv.write(occupancySensorLogs);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	private List<ScanIDSensorData> readScanIDSensorLogsCSV() {
		try {
			return new CsvToBeanBuilder<ScanIDSensorData>(new FileReader(db.scanIDSensorLogsPath))
					.withType(ScanIDSensorData.class)
					.build()
					.parse();
		} catch (Exception e) {
			return null;
		}
	}
	
	private boolean writeScanIDSensorLogsCSV(List<ScanIDSensorData> scanIDSensorLogs) {
		try {
			FileWriter writer = new FileWriter(db.scanIDSensorLogsPath);
			StatefulBeanToCsv<ScanIDSensorData> beanToCsv = new StatefulBeanToCsvBuilder<ScanIDSensorData>(writer).build();
            beanToCsv.write(scanIDSensorLogs);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean addSensor(Sensor sensor) { // should not be null
		List<Sensor> sensors = this.readSensorsCSV();
		if (sensors == null) {
			return false;
		}
		sensors.add(sensor);
		return this.writeSensorsCSV(sensors);
	}
	
	public boolean deleteSensorByID(String ID) {
		List<Sensor> sensors = this.readSensorsCSV();
		if (sensors == null) {
			return false;
		}
		boolean cond1 = sensors.remove(sensors.stream().filter(s -> s.id.equals(ID)).findFirst().orElse(null));
		boolean cond2 = this.writeSensorsCSV(sensors);
		return cond1 && cond2;
	}
	
	public Sensor getSensorByID(String ID) {
		List<Sensor> sensors = this.readSensorsCSV();
		if (sensors == null) {
			return null;
		}
		return sensors.stream().filter(s -> s.id.equals(ID)).findFirst().orElse(null);
	}
	
	public boolean addoccupancySensorData(OccupancySensorData occupancySensorData) { // should not be null
		List<OccupancySensorData> sensorLogs = this.readOccupancySensorLogsCSV();
		if (sensorLogs == null) {
			return false;
		}
		sensorLogs.add(occupancySensorData);
		return this.writeOccupancySensorLogsCSV(sensorLogs);
	}
	
	public List<OccupancySensorData> getOccupancySensorDataList() {
		return this.readOccupancySensorLogsCSV();
	}
	
	public boolean addScanIDSensorData(ScanIDSensorData scanIDSensorData) { // should not be null
		List<ScanIDSensorData> sensorLogs = this.readScanIDSensorLogsCSV();
		if (sensorLogs == null) {
			return false;
		}
		sensorLogs.add(scanIDSensorData);
		return this.writeScanIDSensorLogsCSV(sensorLogs);
	}
	
	public List<ScanIDSensorData> getScanIDSensorDataList() {
		return this.readScanIDSensorLogsCSV();
	}
}
