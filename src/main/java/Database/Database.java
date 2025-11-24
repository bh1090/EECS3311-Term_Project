package Database;

/**
 * Configuration class that holds the paths to the CSV storage files.
 * This class no longer holds data in memory; the Repositories handle that.
 */
public class Database {
    // Helper method to get the absolute path or relative path effectively
    // For this project, we assume files are in the project root.
    
    public static final String ROOM_FILE = "EECS3311 Course Project Database - Rooms.csv";
    public static final String BOOKING_FILE = "EECS3311 Course Project Database - Bookings.csv";
    // New CSV for payments
    public static final String PAYMENT_FILE = "EECS3311 Course Project Database - payments.csv";
	public static Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	 
}