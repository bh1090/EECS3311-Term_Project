package core.infrastructure;


import java.util.ArrayList;
import java.util.List;
import core.models.room.*;
import core.models.booking.*;

// DATABASE (SINGLETON)
//This acts as the CSV file manager.

//In a real app, the "load" methods would read from text files, 
//and "save" methods would write to them.
public class Database {
 private static Database instance;
 
 // In-memory storage simulating CSV rows
 public List<Room> rooms; 
 public List<Booking> bookings; 

 private Database() {
     rooms = new ArrayList<>();
     bookings = new ArrayList<>();
     // simulate loading data
     System.out.println("Database initialized - CSVs loaded.");
 }

 public static synchronized Database getInstance() {
     if (instance == null) {
         instance = new Database();
     }
     return instance;
 }

 // Simulating CSV Write
 public void saveRoom(Room room) {
     if(!rooms.contains(room)) {
         rooms.add(room);
     }
     System.out.println("Saved Room: " + room.getRoomId() + " to CSV.");
 }

 public void saveBooking(Booking booking) {
     if(!bookings.contains(booking)) {
         bookings.add(booking);
     }
     System.out.println("Saved Booking: " + booking.getBookingId() + " to CSV.");
 }
}