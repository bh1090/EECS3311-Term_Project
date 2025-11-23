package core.service;

import core.models.room.Room;
import core.models.booking.Booking;
import java.time.LocalDate;
import java.time.LocalTime; // Used for specific time slots (e.g., 14:00)
import java.time.LocalDateTime; // Used for comparing Date + Time together

/**
 * Service Layer for handling Room and Booking logic.
 * This class acts as the bridge between the Controllers (UI) and the Repository (Data).
 */
public class RoomService {
    private RoomRepository roomRepo = new RoomRepository();

    /**
     * Creates a new room in the system.
     * * @param loc The physical location of the room (e.g., "Library 2nd Floor")
     * @param price The cost per time unit
     * @param capacity The maximum number of people allowed in the room
     */
    public void createRoom(String loc, double price, String capacity) {
        // 1. Auto-generate the next available ID to prevent duplicates
        String nextId = roomRepo.generateNextId();
        
        // 2. Instantiate the Room model with the new ID and details
        Room newRoom = new Room(nextId, loc, price, capacity);
        
        // 3. Persist (save) the new room to the database via the repository
        roomRepo.save(newRoom);
        System.out.println("Room created successfully with ID: " + nextId + ", Capacity: " + capacity);
    }

    /**
     * Attempts to create a booking for a specific user and room.
     * This method validates availability, checks for time overlaps, and ensures the room is active.
     * * @param userId The ID of the user making the booking
     * @param roomId The ID of the room to book
     * @param startDate The day the booking starts
     * @param endDate The day the booking ends
     * @param startTime The specific time the booking starts (e.g., 09:00)
     * @param endTime The specific time the booking ends (e.g., 17:00)
     * @return true if booking was successful, false if room is occupied or unavailable
     */
    public boolean createBooking(String userId, String roomId, 
                                 LocalDate startDate, LocalDate endDate, 
                                 LocalTime startTime, LocalTime endTime) {
        
        // Fetch the room object to check its current state (Enabled/Disabled/Maintenance)
        Room room = roomRepo.findById(roomId);
        
        // 1. Validate Room Availability
        // If the room doesn't exist OR if the State Pattern says it's not bookable (e.g. disabled), fail.
        if (room == null || !room.isAvailable()) {
            System.out.println("Room not available (Offline or does not exist).");
            return false;
        }

        // 2. Prepare Date-Time Objects for Math
        // We combine Date + Time into a single LocalDateTime object.
        // This allows us to handle overnight bookings or complex date ranges linearly.
        // e.g. "2025-11-22" + "14:00" becomes "2025-11-22T14:00"
        LocalDateTime requestStart = LocalDateTime.of(startDate, startTime);
        LocalDateTime requestEnd = LocalDateTime.of(endDate, endTime);

        // 3. Check for Scheduling Conflicts
        // We look through ALL bookings to find a "conflict".
        boolean isOccupied = roomRepo.findAllBookings().stream()
            // Filter A: Only look at bookings for THIS specific room ID.
            .filter(b -> b.getRoomId().equals(roomId)) 
            
            // Filter B: Ignore bookings that were previously cancelled (they don't block the slot).
            .filter(b -> !b.getStatus().equals("CANCELLED")) 
            
            // Filter C: The Overlap Check
            // We check if our requested time overlaps with this existing booking 'b'.
            .anyMatch(b -> {
                // Convert the existing booking's Date/Time to LocalDateTime for comparison
                LocalDateTime existingStart = LocalDateTime.of(b.getStartDate(), b.getStartTime());
                LocalDateTime existingEnd = LocalDateTime.of(b.getEndDate(), b.getEndTime());

                // LOGIC EXPLAINED:
                // A conflict exists if the requested start is BEFORE the existing end
                // AND the requested end is AFTER the existing start.
                // This formula covers all types of overlap (partial, full containment, or exact match).
                return requestStart.isBefore(existingEnd) && requestEnd.isAfter(existingStart);
            });

        // If 'anyMatch' returned true, it means we found a conflict.
        if (isOccupied) {
            System.out.println("Room is occupied on these dates/times.");
            return false;
        }

        // 4. Finalize Booking
        // Generate a unique Booking ID using the current system time in milliseconds.
        Booking booking = new Booking(
            "B-" + System.currentTimeMillis(), 
            roomId, 
            userId, 
            startDate, 
            endDate,
            startTime, 
            endTime    
        );
        
        // Save the new booking to the repository
        roomRepo.saveBooking(booking);
        return true;
    }

    /**
     * Disables a room so it cannot be booked (e.g. for maintenance or renovations).
     * Uses the Room's State Pattern to handle the transition.
     */
    public void disableRoom(String roomId) {
        Room r = roomRepo.findById(roomId);
        if (r != null) {
            // This delegates to the current state (e.g. RoomEnabledState -> RoomDisabledState)
            r.requestDisable(); 
        }
    }
}