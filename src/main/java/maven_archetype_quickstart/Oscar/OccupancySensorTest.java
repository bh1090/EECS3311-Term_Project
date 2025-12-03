package maven_archetype_quickstart.Oscar;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Model.Sensor.OccupancySensor;

public class OccupancySensorTest {
	@Test
	void test0() {
		OccupancySensor sensor = new OccupancySensor("TID0", "TTYPE0", "TSTATUS0", "TRID0", false);
		assertTrue(sensor instanceof OccupancySensor);
	}
	@Test
	void test1() {
		OccupancySensor sensor = new OccupancySensor("TID0", "TTYPE0", "TSTATUS0", "TRID0", false);
		assertEquals("TID0", sensor.getID());
	}
	@Test
	void test2() {
		OccupancySensor sensor = new OccupancySensor("TID0", "TTYPE0", "TSTATUS0", "TRID0", false);
		assertEquals("TTYPE0", sensor.getType());
	}
	@Test
	void test3() {
		OccupancySensor sensor = new OccupancySensor("TID0", "TTYPE0", "TSTATUS0", "TRID0", false);
		assertEquals("TSTATUS0", sensor.getStatus());
	}
	@Test
	void test4() {
		OccupancySensor sensor = new OccupancySensor("TID0", "TTYPE0", "TSTATUS0", "TRID0", false);
		assertEquals("TRID0", sensor.getRoomID());
	}
	@Test
	void test5() {
		OccupancySensor sensor = new OccupancySensor("TID0", "TTYPE0", "TSTATUS0", "TRID0", false);
		assertEquals(false, sensor.getOccupied());
	}
	@Test
	void test6() {
		OccupancySensor sensor = new OccupancySensor("TID0", "TTYPE0", "TSTATUS0", "TRID0", false);
		sensor.setStatus("TSTATUS1");
		assertEquals("TSTATUS1", sensor.getStatus());
	}
	@Test
	void test7() {
		OccupancySensor sensor = new OccupancySensor("TID0", "TTYPE0", "TSTATUS0", "TRID0", false);
		sensor.setRoomID("TRID1");
		assertEquals("TRID1", sensor.getRoomID());
	}
	@Test
	void test8() {
		OccupancySensor sensor = new OccupancySensor("TID0", "TTYPE0", "TSTATUS0", "TRID0", false);
		sensor.setOccupied(true);
		assertEquals(true, sensor.getOccupied());
	}
	@Test
	void test9() {
		OccupancySensor sensor = new OccupancySensor("TID0", "TTYPE0", "TSTATUS0", "TRID0", false);
		OccupancySensor sensor2 = new OccupancySensor("TID0", "TTYPE1", "TSTATUS1", "TRID1", true);
		assertTrue(sensor.equals(sensor2));
	}
}
