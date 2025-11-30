package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Oscar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Database.Database;
import Model.Sensor.OccupancySensorData;
import Model.Sensor.ScanIDSensorData;
import Model.Sensor.Sensor;
import Repository.SensorRepository;

public class SensorRepositoryTest {
	private SensorRepository repo = new SensorRepository(); // this may as well be static, doesnt hold vars
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
//		Files.writeString(Paths.get(db.getScanIDSensorLogsPath()), this.prevData3);
	}
	@Test
	void test0() {
		this.repo.writeSensor(new Sensor("TEST0", "Badge Scanner", "Enabled", "TESTROOM0", false));
		Sensor ss = this.repo.getSensorsList().stream().filter(s -> s.getID().equals("TEST0") && s.getType().equals("Badge Scanner") && s.getStatus().equals("Enabled") && s.getRoomID().equals("TESTROOM0") && s.getOccupied() == false).findFirst().orElse(null);
		assertNotNull(ss);
//		"Entry Sensor"
//		"Badge Scanner"
	}
	@Test
	void test1() {
		this.repo.writeSensor(new Sensor("TEST0", "Badge Scanner", "Enabled", "TESTROOM0", false));
		this.repo.writeSensor(new Sensor("TEST0", "Entry Sensor", "Enabled", "TESTROOM0", false));
		List<Sensor> ss = this.repo.getSensorsList().stream().filter(s -> s.getID().equals("TEST0")).toList();
		assertEquals(ss.size(), 1);
	}
	@Test
	void test2() {
		this.repo.writeSensor(new Sensor("TEST0", "Badge Scanner", "Enabled", "TESTROOM0", false));
		this.repo.writeSensor(new Sensor("TEST1", "Entry Sensor", "Enabled", "TESTROOM0", false));
		List<Sensor> ss1 = this.repo.getSensorsList().stream().filter(s -> s.getID().equals("TEST0")).toList();
		List<Sensor> ss2 = this.repo.getSensorsList().stream().filter(s -> s.getID().equals("TEST1")).toList();
		assertEquals(ss1.size(), 1);
		assertEquals(ss2.size(), 1);
	}
	@Test
	void test3() {
		this.repo.writeSensor(new Sensor("TEST0", "Badge Scanner", "Enabled", "TESTROOM0", false));
		assertNotNull(this.repo.getSensorByID("TEST0"));
	}
	@Test
	void test4() {
		this.repo.writeSensor(new Sensor("TEST0", "Badge Scanner", "Enabled", "TESTROOM0", false));
		assertNull(this.repo.getSensorByID("TESt0"));
	}
	@Test
	void test5() {
		this.repo.writeSensor(new Sensor("TEST0", "Badge Scanner", "Enabled", "TESTROOM0", false));
		this.repo.deleteSensorByID("TEST0");
		assertNull(this.repo.getSensorByID("TEST0"));
	}
	@Test
	void test6() {
		this.repo.writeSensor(new Sensor("TEST0", "Badge Scanner", "Enabled", "TESTROOM0", false));
		this.repo.writeSensor(new Sensor("TEST1", "Entry Sensor", "Enabled", "TESTROOM0", false));
		assertEquals(this.repo.getSensorByRoomIDType("TESTROOM0", null).size(), 2);
		assertEquals(this.repo.getSensorByRoomIDType("TESTROOM0", "Badge Scanner").size(), 1);
		assertEquals(this.repo.getSensorByRoomIDType("TESTROOM0", "Entry Sensor").size(), 1);
	}
	@Test
	void test7() {
		this.repo.writeOccupancySensorLog(new OccupancySensorData("TESTLOG0", "TEST1", LocalDateTime.now()));
		assertTrue(this.repo.getOccupancySensorLogsList().stream().anyMatch(l -> l.logID.equals("TESTLOG0")));
	}
	@Test
	void test8() {
		this.repo.writeScanIDSensorLog(new ScanIDSensorData("TESTLOG0", "SID0", "TESTUID0", "Accepted", LocalDateTime.now()));
		assertEquals(1, this.repo.getScanIDSensorLogsList().size());
		assertTrue(this.repo.getScanIDSensorLogsList().stream().anyMatch(l -> l.logID.equals("TESTLOG0")));
	}
	@Test
	void test9() {
		this.repo.writeScanIDSensorLog(new ScanIDSensorData("TESTLOG0", "TEST1", "TESTUID0", "Accepted", LocalDateTime.now()));
		assertFalse(this.repo.getOccupancySensorLogsList().stream().anyMatch(l -> l.logID.equals("TESTLOG0")));
	}
}
