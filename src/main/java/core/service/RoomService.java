// Contains business logic (Checking overlap, handling state changes)
package core.service;

import core.models.room.Room;
import core.models.booking.Booking;
import java.time.LocalDate;

//Contains business logic
public class RoomService {
 private RoomRepository roomRepo = new RoomRepository();

 // createRoom method accepts 'loc', 'price', 'capacity' and generates ID automatically
 public void createRoom(String loc, double price, String capacity) {
     // 1. Generate the ID
     String nextId = roomRepo.generateNextId();
     
     // 2. Create the room with the new capacity field
     Room newRoom = new Room(nextId, loc, price, capacity);
     
     // 3. Save
     roomRepo.save(newRoom);
     System.out.println("Room created successfully with ID: " + nextId + ", Capacity: " + capacity);
 }

 // Called by Booking Flow
 public boolean createBooking(String userId, String roomId, LocalDate start, LocalDate end) {
     Room room = roomRepo.findById(roomId);
     
     // Check availability
     if (room == null || !room.isAvailable()) {
         System.out.println("Room not available.");
         return false;
     }

     // Check for date overlaps
     boolean isOccupied = roomRepo.findAllBookings().stream()
         .anyMatch(b -> b.getRoomId().equals(roomId) && 
                        !b.getStatus().equals("CANCELLED") &&
                        (start.isBefore(b.getEndDate()) && end.isAfter(b.getStartDate())));

     if (isOccupied) {
         System.out.println("Room is occupied on these dates.");
         return false;
     }

     // Create the booking
     Booking booking = new Booking("B-" + System.currentTimeMillis(), roomId, userId, start, end);
     roomRepo.saveBooking(booking);
     return true;
 }

 public void disableRoom(String roomId) {
     Room r = roomRepo.findById(roomId);
     if (r != null) r.requestDisable();
 }
}