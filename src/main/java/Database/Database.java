package Database;

import java.util.ArrayList;
import java.util.List;
import Model.Room;
import Model.Booking;
import Model.Payment;

public class Database {
    private static Database instance;
    
    public List<Room> rooms; 
    public List<Booking> bookings; 
    public List<Payment> payments; // <--- List to store payments

    private Database() {
    	//  Initializing the lists
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
        payments = new ArrayList<>(); 
        System.out.println("Database initialized - CSVs loaded.");
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void saveRoom(Room room) {
        if(!rooms.contains(room)) rooms.add(room);
        System.out.println("Saved Room: " + room.getRoomId());
    }

    public void saveBooking(Booking booking) {
        if(!bookings.contains(booking)) bookings.add(booking);
        System.out.println("Saved Booking: " + booking.getBookingId());
    }

    // Save method to store payments made by user when booking rooms.
    public void savePayment(Payment payment) {
        if(!payments.contains(payment)) payments.add(payment);
        System.out.println("Saved Payment: " + payment.getPaymentId());
    }
     //depends on where csv is
     private final String userCsvPath= "src/main/data/users.csv";

     public String getUserCsvPath() {
          return  userCsvPath;
     }

     public String getMaintenanceRequestsCsvPath() {
          return "src/main/data/MaintenanceRequests.csv";
     }

    private final String sensorsPath = "sensors.csv";
	private final String occupancySensorLogsPath = "occupancy_sensor_logs.csv";
	private final String scanIDSensorLogsPath = "scanid_sensor_logs.csv";
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