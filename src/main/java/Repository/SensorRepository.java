package Repository;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.stream.Collectors;

import Database.Database;

import Model.Sensor.Sensor;
import Model.Sensor.OccupancySensorData;
import Model.Sensor.ScanIDSensorData;

public class SensorRepository {
	private Database db = Database.getInstance();
	public SensorRepository() {
		// TODO Auto-generated constructor stub
	}

	public List<Sensor> getSensorsList() {
		try (FileReader reader = new FileReader(db.getSensorsCsvPath())) {
			return new CsvToBeanBuilder<Sensor>(reader)
					.withType(Sensor.class)
					.build()
					.parse();
		} catch (Exception e) {
			return null;
		}
	}

	private boolean writeSensorsList(List<Sensor> sensors) {
		try (FileWriter writer = new FileWriter(db.getSensorsCsvPath())) {
			StatefulBeanToCsv<Sensor> beanToCsv = new StatefulBeanToCsvBuilder<Sensor>(writer).build();
            beanToCsv.write(sensors);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean writeSensor(Sensor sensor) {
		if (sensor == null) {
			return false;
		}
		List<Sensor> newList = this.getSensorsList().stream().filter(s -> !s.equals(sensor)).collect(Collectors.toList());
		newList.add(sensor);
		try (FileWriter writer = new FileWriter(db.getSensorsCsvPath())) {
			StatefulBeanToCsv<Sensor> beanToCsv = new StatefulBeanToCsvBuilder<Sensor>(writer).build();
            beanToCsv.write(newList);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Sensor getSensorByID(String id) {
		return this.getSensorsList().stream().filter(s -> s.getID().equals(id)).findFirst().orElse(null);
	}

	public void deleteSensorByID(String id) {
		this.writeSensorsList(this.getSensorsList().stream().filter(s -> !s.getID().equals(id)).collect(Collectors.toList()));
	}

	public List<Sensor> getSensorByRoomIDType(String roomID, String type) {
		List<Sensor> list = this.getSensorsList();
		if (roomID != null) {
			list = list.stream().filter(s -> s.getRoomID().equals(roomID)).collect(Collectors.toList());
		}
		if (type != null) {
			list = list.stream().filter(s -> s.getType().equals(type)).collect(Collectors.toList());
		}
		return list;
	}

	// Occupancy sensor logs
	public List<OccupancySensorData> getOccupancySensorLogsList() {
		try {
			return new CsvToBeanBuilder<OccupancySensorData>(new FileReader(db.getOccupancySensorLogsPath()))
					.withType(OccupancySensorData.class)
					.build()
					.parse();
		} catch (Exception e) {
			return null;
		}
	}

	public boolean writeOccupancySensorLog(OccupancySensorData occupancySensorLog) {
		if (occupancySensorLog == null) {
			return false;
		}
		List<OccupancySensorData> logs = this.getOccupancySensorLogsList().stream().filter(l -> !l.equals(occupancySensorLog)).collect(Collectors.toList());
		logs.add(occupancySensorLog);
		try (FileWriter writer = new FileWriter(db.getOccupancySensorLogsPath())) {
			StatefulBeanToCsv<OccupancySensorData> beanToCsv = new StatefulBeanToCsvBuilder<OccupancySensorData>(writer).build();
            beanToCsv.write(logs);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// Scanid sensor logs
	public List<ScanIDSensorData> getScanIDSensorLogsList() {
		try {
			return new CsvToBeanBuilder<ScanIDSensorData>(new FileReader(db.getScanIDSensorLogsPath()))
					.withType(ScanIDSensorData.class)
					.build()
					.parse();
		} catch (Exception e) {
			return null;
		}
	}

	public boolean writeScanIDSensorLog(ScanIDSensorData scanIDSensorLog) {
		if (scanIDSensorLog == null) {
			return false;
		}
		List<ScanIDSensorData> logs = this.getScanIDSensorLogsList().stream().filter(l -> !l.equals(scanIDSensorLog)).collect(Collectors.toList());
		logs.add(scanIDSensorLog);
		try (FileWriter writer = new FileWriter(db.getScanIDSensorLogsPath())) {
			StatefulBeanToCsv<ScanIDSensorData> beanToCsv = new StatefulBeanToCsvBuilder<ScanIDSensorData>(writer).build();
            beanToCsv.write(logs);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
