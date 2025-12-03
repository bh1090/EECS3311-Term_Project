package maven_archetype_quickstart.Oscar;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Model.Sensor.ScanIDSensor;

public class ScanIDSensorTest {
	@Test
	void test0() {
		ScanIDSensor sensor = new ScanIDSensor("TID0", "TTYPE0", "TSTATUS0", "TRID0");
		assertTrue(sensor instanceof ScanIDSensor);
	}
	@Test
	void test1() {
		ScanIDSensor sensor = new ScanIDSensor("TID0", "TTYPE0", "TSTATUS0", "TRID0");
		assertEquals("TID0", sensor.getID());
	}
	@Test
	void test2() {
		ScanIDSensor sensor = new ScanIDSensor("TID0", "TTYPE0", "TSTATUS0", "TRID0");
		assertEquals("TTYPE0", sensor.getType());
	}
	@Test
	void test3() {
		ScanIDSensor sensor = new ScanIDSensor("TID0", "TTYPE0", "TSTATUS0", "TRID0");
		assertEquals("TSTATUS0", sensor.getStatus());
	}
	@Test
	void test4() {
		ScanIDSensor sensor = new ScanIDSensor("TID0", "TTYPE0", "TSTATUS0", "TRID0");
		assertEquals("TRID0", sensor.getRoomID());
	}
	@Test
	void test5() {
		ScanIDSensor sensor = new ScanIDSensor("TID0", "TTYPE0", "TSTATUS0", "TRID0");
		assertEquals(false, sensor.getOccupied());
	}
	@Test
	void test6() {
		ScanIDSensor sensor = new ScanIDSensor("TID0", "TTYPE0", "TSTATUS0", "TRID0");
		sensor.setStatus("TSTATUS1");
		assertEquals("TSTATUS1", sensor.getStatus());
	}
	@Test
	void test7() {
		ScanIDSensor sensor = new ScanIDSensor("TID0", "TTYPE0", "TSTATUS0", "TRID0");
		sensor.setRoomID("TRID1");
		assertEquals("TRID1", sensor.getRoomID());
	}
	@Test
	void test8() {
		ScanIDSensor sensor = new ScanIDSensor("TID0", "TTYPE0", "TSTATUS0", "TRID0");
		sensor.setOccupied(true);
		assertEquals(false, sensor.getOccupied());
	}
	@Test
	void test9() {
		ScanIDSensor sensor = new ScanIDSensor("TID0", "TTYPE0", "TSTATUS0", "TRID0");
		ScanIDSensor sensor2 = new ScanIDSensor("TID0", "TTYPE1", "TSTATUS1", "TRID1");
		assertTrue(sensor.equals(sensor2));
	}
}
