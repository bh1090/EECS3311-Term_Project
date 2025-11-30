package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Oscar;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Database.Database;
import Model.Sensor.Sensor;
import Service.SensorService;

public class SensorServiceTest {
	private SensorService service = new SensorService(); // this also may as well be static, doesnt hold vars
	private String prevData1 = null;
	private String prevData2 = null;
	private String prevData3 = null;
	@BeforeEach
	public void setUpClass() throws IOException {
		Database db = Database.getInstance();
		this.prevData1 = Files.readString(Paths.get(db.getSensorsCsvPath()));
		this.prevData2 = Files.readString(Paths.get(db.getOccupancySensorLogsPath()));
		this.prevData3 = Files.readString(Paths.get(db.getScanIDSensorLogsPath()));
	}
	@AfterEach
	public void setDownClass() throws IOException {
		Database db = Database.getInstance();
		Files.writeString(Paths.get(db.getSensorsCsvPath()), this.prevData1);
		Files.writeString(Paths.get(db.getOccupancySensorLogsPath()), this.prevData2);
		Files.writeString(Paths.get(db.getScanIDSensorLogsPath()), this.prevData3);
	}
	@Test
	void test0() {
		assertTrue(service.addScanIDSensorData("SID0", "UID0", "Accepted"));
	}
	@Test
	void test1() {
		assertTrue(service.addOccupancySensorData("SID0"));
	}
	@Test
	void test2() {
		assertTrue(service.addSensor("Badge Scanner", "Enabled", "RID0"));
	}
	@Test
	void test3() {
		service.addSensor("Badge Scanner", "Enabled", "RID0");
		Sensor sensor = service.getSensorByRoomID("RID0", null);
		assertNotNull(sensor);
	}
	@Test
	void test4() {
		service.addSensor("Badge Scanner", "Enabled", "RID0");
		List<String> sensor = service.getSensorsFormatted().stream().filter(s -> s.get(1).equals("Badge Scanner") && s.get(3).equals("RID0")).findFirst().orElse(null);
		assertNotNull(sensor);
	}
	@Test
	void test5() {
		assertFalse(service.addSensor("invalid", "Enabled", "RID0"));
	}
	@Test
	void test6() {
		assertFalse(service.addSensor("Badge Scanner", "invalid", "RID0"));
	}
	@Test
	void test7() {
		assertFalse(service.addSensor("invalid", "invalid", "RID0"));
	}
	@Test
	void test8() {
		service.addSensor("Badge Scanner", "Enabled", "RID0");
		List<String> sensor = service.getSensorsFormatted().stream().filter(s -> s.get(1).equals("Badge Scanner") && s.get(3).equals("RID0")).findFirst().orElse(null);
		assertNotNull(sensor.get(0));
	}
	@Test
	void test9() {
		assertTrue(service.addSensor("Entry Sensor", "Disabled", "RID0"));
	}
}
