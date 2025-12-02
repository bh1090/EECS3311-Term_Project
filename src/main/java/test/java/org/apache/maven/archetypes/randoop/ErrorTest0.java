package test.java.org.apache.maven.archetypes.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        Model.Sensor.OccupancySensorData occupancySensorData0 = new Model.Sensor.OccupancySensorData();
        org.junit.Assert.assertTrue("Contract failed: occupancySensorData0.equals(occupancySensorData0)", occupancySensorData0.equals(occupancySensorData0));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        Model.Sensor.ScanIDSensorData scanIDSensorData0 = new Model.Sensor.ScanIDSensorData();
        org.junit.Assert.assertTrue("Contract failed: scanIDSensorData0.equals(scanIDSensorData0)", scanIDSensorData0.equals(scanIDSensorData0));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        Model.Sensor.Sensor sensor0 = new Model.Sensor.Sensor();
        org.junit.Assert.assertTrue("Contract failed: sensor0.equals(sensor0)", sensor0.equals(sensor0));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList12 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.Sensor sensor14 = sensorRepository0.getSensorByID("DISABLED");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on occupancySensorDataList1 and occupancySensorDataList12", occupancySensorDataList1.equals(occupancySensorDataList12) ? occupancySensorDataList1.hashCode() == occupancySensorDataList12.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList12 = sensorRepository0.getOccupancySensorLogsList();
        sensorRepository0.deleteSensorByID("EECS3311 Course Project Database - payments.csv");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on occupancySensorDataList1 and occupancySensorDataList12", occupancySensorDataList1.equals(occupancySensorDataList12) ? occupancySensorDataList1.hashCode() == occupancySensorDataList12.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList12 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.OccupancySensor occupancySensor18 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        java.lang.String str19 = occupancySensor18.getType();
        java.lang.String str20 = occupancySensor18.getType();
        boolean boolean21 = sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on occupancySensorDataList1 and occupancySensorDataList12", occupancySensorDataList1.equals(occupancySensorDataList12) ? occupancySensorDataList1.hashCode() == occupancySensorDataList12.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.Sensor sensor13 = sensorRepository0.getSensorByID("EECS3311 Course Project Database - Bookings.csv");
        java.time.LocalDateTime localDateTime16 = null;
        Model.Sensor.OccupancySensorData occupancySensorData17 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        occupancySensorData17.dateTime = localDateTime18;
        boolean boolean20 = sensorRepository0.writeOccupancySensorLog(occupancySensorData17);
        Model.Sensor.Sensor sensor22 = sensorRepository0.getSensorByID("24");
        java.time.LocalDateTime localDateTime25 = null;
        Model.Sensor.OccupancySensorData occupancySensorData26 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime25);
        java.time.LocalDateTime localDateTime27 = occupancySensorData26.getLocalDateTime();
        java.lang.String str28 = occupancySensorData26.getLogID();
        boolean boolean29 = sensorRepository0.writeOccupancySensorLog(occupancySensorData26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on occupancySensorData17 and occupancySensorData26", occupancySensorData17.equals(occupancySensorData26) ? occupancySensorData17.hashCode() == occupancySensorData26.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.Sensor sensor13 = sensorRepository0.getSensorByID("EECS3311 Course Project Database - Bookings.csv");
        java.time.LocalDateTime localDateTime16 = null;
        Model.Sensor.OccupancySensorData occupancySensorData17 = new Model.Sensor.OccupancySensorData("", "hi!", localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        occupancySensorData17.dateTime = localDateTime18;
        boolean boolean20 = sensorRepository0.writeOccupancySensorLog(occupancySensorData17);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList21 = sensorRepository0.getScanIDSensorLogsList();
        sensorRepository0.deleteSensorByID("jsmith@yorku.ca");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on scanIDSensorDataList11 and scanIDSensorDataList21", scanIDSensorDataList11.equals(scanIDSensorDataList21) ? scanIDSensorDataList11.hashCode() == scanIDSensorDataList21.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        Model.Sensor.Sensor sensor12 = sensorRepository0.getSensorByID("src/main/data/users.csv");
        java.util.List<Model.Sensor.Sensor> sensorList15 = sensorRepository0.getSensorByRoomIDType("2", "CHECKED_IN");
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList16 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.Sensor sensor17 = null;
        boolean boolean18 = sensorRepository0.writeSensor(sensor17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on occupancySensorDataList1 and occupancySensorDataList16", occupancySensorDataList1.equals(occupancySensorDataList16) ? occupancySensorDataList1.hashCode() == occupancySensorDataList16.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList12 = sensorRepository0.getOccupancySensorLogsList();
        java.lang.Class<?> wildcardClass13 = sensorRepository0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on occupancySensorDataList1 and occupancySensorDataList12", occupancySensorDataList1.equals(occupancySensorDataList12) ? occupancySensorDataList1.hashCode() == occupancySensorDataList12.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        Model.Sensor.Sensor sensor12 = sensorRepository0.getSensorByID("src/main/data/users.csv");
        java.util.List<Model.Sensor.Sensor> sensorList15 = sensorRepository0.getSensorByRoomIDType("2", "CHECKED_IN");
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList16 = sensorRepository0.getOccupancySensorLogsList();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList17 = sensorRepository0.getOccupancySensorLogsList();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on occupancySensorDataList1 and occupancySensorDataList16", occupancySensorDataList1.equals(occupancySensorDataList16) ? occupancySensorDataList1.hashCode() == occupancySensorDataList16.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        Repository.SensorRepository sensorRepository0 = new Repository.SensorRepository();
        java.util.List<Model.Sensor.OccupancySensorData> occupancySensorDataList1 = sensorRepository0.getOccupancySensorLogsList();
        Model.Sensor.ScanIDSensorData scanIDSensorData2 = null;
        boolean boolean3 = sensorRepository0.writeScanIDSensorLog(scanIDSensorData2);
        Model.Sensor.OccupancySensor occupancySensor9 = new Model.Sensor.OccupancySensor("", "1", "1", "EECS3311 Course Project Database - Rooms.csv", true);
        boolean boolean10 = sensorRepository0.writeSensor((Model.Sensor.Sensor) occupancySensor9);
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList11 = sensorRepository0.getScanIDSensorLogsList();
        Model.Sensor.Sensor sensor13 = sensorRepository0.getSensorByID("EECS3311 Course Project Database - Bookings.csv");
        java.util.List<Model.Sensor.ScanIDSensorData> scanIDSensorDataList14 = sensorRepository0.getScanIDSensorLogsList();
        java.util.List<Model.Sensor.Sensor> sensorList15 = sensorRepository0.getSensorsList();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on scanIDSensorDataList11 and scanIDSensorDataList14", scanIDSensorDataList11.equals(scanIDSensorDataList14) ? scanIDSensorDataList11.hashCode() == scanIDSensorDataList14.hashCode() : true);
    }
}

