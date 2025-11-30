package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Oscar;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import Model.Sensor.OccupancySensorData;
import Model.Sensor.ScanIDSensorData;

public class OccupancySensorDataTest {
	@Test
	void test0() {
		LocalDateTime dt = LocalDateTime.now();
		OccupancySensorData data = new OccupancySensorData("LID0", "SID0", dt);
		assertTrue(data instanceof OccupancySensorData);
	}
	@Test
	void test1() {
		LocalDateTime dt = LocalDateTime.now();
		OccupancySensorData data = new OccupancySensorData("LID0", "SID0", dt);
		assertFalse(data instanceof ScanIDSensorData);
	}
	@Test
	void test2() {
		LocalDateTime dt = LocalDateTime.now();
		OccupancySensorData data = new OccupancySensorData("LID0", "SID0", dt);
		assertEquals("LID0", data.getLogID());
	}
	@Test
	void test3() {
		LocalDateTime dt = LocalDateTime.now();
		OccupancySensorData data = new OccupancySensorData("LID0", "SID0", dt);
		assertEquals("SID0", data.getSensorID());
	}
	@Test
	void test4() {
		LocalDateTime dt = LocalDateTime.now();
		OccupancySensorData data1 = new OccupancySensorData("LID0", "SID0", dt);
		OccupancySensorData data2 = new OccupancySensorData("LID0", "SID1", dt);
		assertEquals(data1, data2);
	}
	@Test
	void test5() {
		LocalDateTime dt = LocalDateTime.now();
		OccupancySensorData data1 = new OccupancySensorData("LID0", "SID0", dt);
		OccupancySensorData data2 = new OccupancySensorData("LID1", "SID0", dt);
		assertNotEquals(data1, data2);
	}
	@Test
	void test6() {
		LocalDateTime dt1 = LocalDateTime.now();
		LocalDateTime dt2 = dt1.plusHours(1);
		OccupancySensorData data1 = new OccupancySensorData("LID0", "SID0", dt1);
		OccupancySensorData data2 = new OccupancySensorData("LID0", "SID1", dt2);
		assertEquals(data1, data2);
	}
	@Test
	void test7() {
		LocalDateTime dt1 = LocalDateTime.now();
		LocalDateTime dt2 = dt1.plusHours(1);
		OccupancySensorData data1 = new OccupancySensorData("LID0", "SID0", dt1);
		OccupancySensorData data2 = new OccupancySensorData("LID0", "SID0", dt2);
		assertEquals(data1, data2);
	}
	@Test
	void test8() {
		LocalDateTime dt1 = LocalDateTime.now();
		LocalDateTime dt2 = dt1.plusHours(1);
		OccupancySensorData data1 = new OccupancySensorData("LID0", "SID0", dt1);
		OccupancySensorData data2 = new OccupancySensorData("LID1", "SID0", dt2);
		assertNotEquals(data1, data2);
	}
	@Test
	void test9() {
		LocalDateTime dt1 = LocalDateTime.now();
		LocalDateTime dt2 = dt1.plusHours(1);
		OccupancySensorData data1 = new OccupancySensorData("LID0", "SID0", dt1);
		OccupancySensorData data2 = new OccupancySensorData("LID1", "SID1", dt2);
		assertNotEquals(data1, data2);
	}
}
