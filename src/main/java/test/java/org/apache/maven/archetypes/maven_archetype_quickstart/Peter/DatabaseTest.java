package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Peter;

import Database.Database;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseTest {


    @Test
    public void testSingletonInstance() {
        Database db1= Database.getInstance();
        Database db2= Database.getInstance();
        assertNotNull(db1);
        assertSame(db1, db2);
    }

    @Test
    public void testUserCSVPath() {
        String path= Database.getUserCsvPath();
        assertNotNull(path);
        assertFalse(path.trim().isEmpty());
    }

    @Test
    public void testUserCSV2() {
        String path= Database.getUserCsvPath();
        assertTrue(path.endsWith("users.csv"));
    }

    @Test
    public void testMaintenanceRequestsCSVPath() {
        Database db= Database.getInstance();
        String path= db.getMaintenanceRequestsCsvPath();
        assertNotNull(path);
        assertFalse(path.trim().isEmpty());
    }

    @Test
    public void testRoomCSVPath() {
        Database db =  Database.getInstance();
        String path= db.getRoomCsvPath();
        assertNotNull(path);
        assertFalse(path.trim().isEmpty());
    }

    @Test
    public void testBookingCSVPath() {
        Database db= Database.getInstance();
        String path= db.getBookingCsvPath();
        assertNotNull(path);
        assertFalse(path.trim().isEmpty());
    }

    @Test
    public void testPaymentCSVPath() {
        Database db= Database.getInstance();
        String path=  db.getPaymentCsvPath();
        assertNotNull(path);
        assertFalse(path.trim().isEmpty());
    }

    @Test
    public void testSensorsCSVPath() {
        Database db= Database.getInstance();
        String path= db.getSensorsCsvPath();
        assertNotNull(path);
        assertFalse(path.trim().isEmpty());
    }

    @Test
    public void testSensorsCSVPath2() {
        Database db = Database.getInstance();
        String path = db.getSensorsCsvPath();
        assertTrue(path.endsWith("sensors.csv"));
    }

    @Test
    public void testOccupancySensorPath() {
        Database db= Database.getInstance();
        String path=db.getOccupancySensorLogsPath();
        assertNotNull(path);
        assertFalse(path.trim().isEmpty());
    }

    @Test
    public void testScanIDSensorLogsPath() {
        Database db= Database.getInstance();
        String path= db.getScanIDSensorLogsPath();
        assertNotNull(path);
        assertFalse(path.trim().isEmpty());
    }
}
