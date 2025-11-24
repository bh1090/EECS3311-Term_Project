package Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import Model.Booking;
import Model.CancelledState;
import Model.CheckInState;
import Model.CompletedState;
import core.infrastructure.Database;

/**
 * Repository for managing Booking data persistence via CSV.
 */
public class BookingRepository {
    private static BookingRepository instance = null;
    private List<Booking> bookings = new ArrayList<>();

    private BookingRepository() {
        loadBookingsFromCSV();
    }

    public static synchronized BookingRepository getInstance() {
        if (instance == null) {
            instance = new BookingRepository();
        }
        return instance;
    }

    // === PUBLIC METHODS ===

    public void save(Booking booking) {
        bookings.removeIf(b -> b.getBookingId().equals(booking.getBookingId()));
        bookings.add(booking);
        saveBookingsToCSV();
    }

    public Booking findById(String id) {
        return bookings.stream()
            .filter(b -> b.getBookingId().equals(id))
            .findFirst().orElse(null);
    }

    public List<Booking> findAll() { return new ArrayList<>(bookings); }

    // === CSV IO METHODS ===

    private void loadBookingsFromCSV() {
        bookings.clear();
        File file = new File(Database.BOOKING_FILE);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine(); // Skip Header
            while ((line = br.readLine()) != null) {
                String[] val = line.split(",");
                // CSV Format: Booking ID,Room ID,Date,Time,User ID,Payment Information,Status
                if (val.length < 7) continue; 

                String bId = val[0].trim();
                String rId = val[1].trim();
                
                // Parsing Date (Using the single 'Date' column for both Start and End for now)
                LocalDate startDate = LocalDate.parse(val[2].trim());
                LocalDate endDate = startDate; 
                
                // Parsing Time (Using 'Time' column for Start, adding 1hr default for End)
                LocalTime startTime = LocalTime.parse(val[3].trim());
                LocalTime endTime = startTime.plusHours(1); 
                
                String uId = val[4].trim();
                String pId = val[5].trim();
                String status = val[6].trim();

                Booking b = new Booking(bId, rId, uId, startDate, endDate, startTime, endTime, pId);
                
                // Restore State logic
                if (status.equalsIgnoreCase("CANCELLED")) {
                    b.setState(new CancelledState());
                } else if (status.equalsIgnoreCase("CHECKED_IN")) {
                    b.setState(new CheckInState());
                } else if (status.equalsIgnoreCase("COMPLETED")) {
                    b.setState(new CompletedState());
                }

                bookings.add(b);
            }
        } catch (Exception e) {
            System.out.println("Error parsing booking row: " + e.getMessage());
        }
    }

    private void saveBookingsToCSV() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(Database.BOOKING_FILE))) {
            pw.println("Booking ID,Room ID,Date,Time,User ID,Payment Information,Status");

            for (Booking b : bookings) {
                pw.println(
                    b.getBookingId() + "," +
                    b.getRoomId() + "," +
                    b.getStartDate() + "," + 
                    b.getStartTime() + "," +
                    b.getUserId() + "," + 
                    b.getPaymentId() + "," +
                    b.getStatus()
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}