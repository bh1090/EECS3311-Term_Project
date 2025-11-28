package Database;

import java.io.File;

/**
 * Configuration class that holds the paths to the CSV storage files.
 * Responsibilities:
 * 1. Maintain Singleton instance (if needed for older code compatibility).
 * 2. Provide centralized file paths for all repositories.
 */
public class Database {
    private static Database instance;

    // FILE PATH CONSTANTS
    // Core Booking System Paths
    private static final String ROOM_FILE = "EECS3311 Course Project Database - Rooms.csv";
    private static final String BOOKING_FILE = "EECS3311 Course Project Database - Bookings.csv";
    private static final String PAYMENT_FILE = "EECS3311 Course Project Database - payments.csv";
    
    // User & Maintenance Paths (Adjusted to match the existing structure)
    // Note: Ensure the "src/main/data" folder exists in the designated filepath.
    private static final String USER_CSV_FILE = "src/main/data/users.csv";
    private static final String MAINTENANCE_REQUESTS_FILE = "src/main/data/MaintenanceRequests.csv";

    // Sensor Paths
    private final String sensorsPath = "sensors.csv";
    private final String occupancySensorLogsPath = "occupancy_sensor_logs.csv";
    private final String scanIDSensorLogsPath = "scanid_sensor_logs.csv";

    private Database() {
        // No lists to initialize here anymore - Repositories handle their own data.
        System.out.println("Database Configuration Loaded.");
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    // PATH GETTERS (For compatibility with existing code)

    public static String getUserCsvPath() {
        return USER_CSV_FILE;
    }

    public String getMaintenanceRequestsCsvPath() {
        return MAINTENANCE_REQUESTS_FILE;
    }

    public String getSensorsCsvPath() {
        return this.sensorsPath;
    }

    public String getOccupancySensorLogsPath() {
        return this.occupancySensorLogsPath;
    }

    public String getScanIDSensorLogsPath() {
        return this.scanIDSensorLogsPath;
    }
}