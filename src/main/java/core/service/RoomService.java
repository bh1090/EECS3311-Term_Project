// Contains business logic (Checking overlap, handling state changes)
package core.service;

import core.models.room.Room;
import core.models.booking.Booking;
import java.time.LocalDate;

public class RoomService {
    private RoomRepository roomRepo = new RoomRepository();

    public void createRoom(String id, String loc, double price) {
        Room newRoom = new Room(id, loc, price);
        roomRepo.save(newRoom);
    }

    // Called by Booking Flow logic. 
    public boolean createBooking(String userId, String roomId, LocalDate start, LocalDate end) {
        Room room = roomRepo.findById(roomId);
        
        // 1. Check if room exists and is enabled
        if (room == null || !room.isAvailable()) {
            System.out.println("Room not available.");
            return false;
        }

        // 2. Check date overlap (Simple logic)
        boolean isOccupied = roomRepo.findAllBookings().stream()
            .anyMatch(b -> b.getRoomId().equals(roomId) && 
                           !b.getStatus().equals("CANCELLED") &&
                           (start.isBefore(b.getEndDate()) && end.isAfter(b.getStartDate())));

        if (isOccupied) {
            System.out.println("Room is occupied on these dates.");
            return false;
        }

        // 3. Create Booking
        Booking booking = new Booking("B-" + System.currentTimeMillis(), roomId, userId, start, end);
        roomRepo.saveBooking(booking);
        return true;
    }

    public void disableRoom(String roomId) {
        Room r = roomRepo.findById(roomId);
        if (r != null) r.requestDisable();
    }
}