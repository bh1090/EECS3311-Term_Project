package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Oscar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Database.Database;
import Model.Sensor.OccupancySensor;
import Model.Sensor.Sensor;
import Repository.SensorRepository;

public class SensorRepositoryTest {
	private SensorRepository repo = new SensorRepository(); // this may as well be static, doesnt hold vars
	private String prevData1 = null;
	private String prevData2 = null;
	private String prevData3 = null;
	@BeforeClass
	void setUpClass() throws IOException {
		Database db = Database.getInstance();
		this.prevData1 = Files.readString(Paths.get(db.getSensorsCsvPath()));
		this.prevData2 = Files.readString(Paths.get(db.getOccupancySensorLogsPath()));
		this.prevData3 = Files.readString(Paths.get(db.getScanIDSensorLogsPath()));
	}
	@AfterClass
	void setDownClass() throws IOException {
		Database db = Database.getInstance();
		Files.writeString(Paths.get(db.getSensorsCsvPath()), this.prevData1);
		Files.writeString(Paths.get(db.getOccupancySensorLogsPath()), this.prevData2);
		Files.writeString(Paths.get(db.getScanIDSensorLogsPath()), this.prevData3);
	}
	@Test
	void test0() {
		new OccupancySensor(prevData1, prevData3, prevData2, prevData1, false);
//		repo.writeSensor();
	}
	@Test
	void test1() {
		
	}
	@Test
	void test2() {
		
	}
	@Test
	void test3() {
		
	}
	@Test
	void test4() {
		
	}
	@Test
	void test5() {
		
	}
	@Test
	void test6() {
		
	}
	@Test
	void test7() {
		
	}
	@Test
	void test8() {
		
	}
	@Test
	void test9() {
		
	}
}
