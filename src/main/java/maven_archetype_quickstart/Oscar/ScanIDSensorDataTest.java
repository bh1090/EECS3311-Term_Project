package maven_archetype_quickstart.Oscar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import Model.Sensor.ScanIDSensorData;

public class ScanIDSensorDataTest {
	@Test
	void test0() {
		LocalDateTime dt = LocalDateTime.now();
		ScanIDSensorData data = new ScanIDSensorData("LID0", "SID0", "UID0", "SOut0", dt);
		assertEquals("LID0", data.getLogID());
	}
	@Test
	void test1() {
		LocalDateTime dt = LocalDateTime.now();
		ScanIDSensorData data = new ScanIDSensorData("LID0", "SID0", "UID0", "SOut0", dt);
		assertEquals("SID0", data.getSensorID());
	}
	@Test
	void test2() {
		LocalDateTime dt = LocalDateTime.now();
		ScanIDSensorData data = new ScanIDSensorData("LID0", "SID0", "UID0", "SOut0", dt);
		assertEquals("UID0", data.getUserID());
	}
	@Test
	void test3() {
		LocalDateTime dt = LocalDateTime.now();
		ScanIDSensorData data = new ScanIDSensorData("LID0", "SID0", "UID0", "SOut0", dt);
		assertEquals("SOut0", data.getScanOutcome());
	}
	@Test
	void test4() {
		LocalDateTime dt = LocalDateTime.now();
		ScanIDSensorData data = new ScanIDSensorData("LID0", "SID0", "UID0", "SOut0", dt);
		assertEquals(dt, data.getLocalDateTime());
	}
	@Test
	void test5() {
		LocalDateTime dt = LocalDateTime.now();
		ScanIDSensorData data1 = new ScanIDSensorData("LID0", "SID0", "UID0", "SOut0", dt);
		ScanIDSensorData data2 = new ScanIDSensorData("LID0", "SID1", "UID0", "SOut0", dt);
		assertEquals(data1, data2);
	}
	@Test
	void test6() {
		LocalDateTime dt = LocalDateTime.now();
		ScanIDSensorData data1 = new ScanIDSensorData("LID0", "SID0", "UID0", "SOut0", dt);
		ScanIDSensorData data2 = new ScanIDSensorData("LID0", "SID1", "UID1", "SOut0", dt);
		assertEquals(data1, data2);
	}
	@Test
	void test7() {
		LocalDateTime dt = LocalDateTime.now();
		ScanIDSensorData data1 = new ScanIDSensorData("LID0", "SID0", "UID0", "SOut0", dt);
		ScanIDSensorData data2 = new ScanIDSensorData("LID0", "SID1", "UID1", "SOut1", dt);
		assertEquals(data1, data2);
	}
	@Test
	void test8() {
		LocalDateTime dt1 = LocalDateTime.now();
		LocalDateTime dt2 = dt1.plusHours(1);
		ScanIDSensorData data1 = new ScanIDSensorData("LID0", "SID0", "UID0", "SOut0", dt1);
		ScanIDSensorData data2 = new ScanIDSensorData("LID0", "SID1", "UID1", "SOut1", dt2);
		assertEquals(data1, data2);
	}
	@Test
	void test9() {
		LocalDateTime dt = LocalDateTime.now();
		ScanIDSensorData data1 = new ScanIDSensorData("LID0", "SID0", "UID0", "SOut0", dt);
		ScanIDSensorData data2 = new ScanIDSensorData("LID1", "SID0", "UID0", "SOut0", dt);
		assertNotEquals(data1, data2);
	}
}
