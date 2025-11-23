package core.service;

import core.models.room.Room;
import core.infrastructure.Database;
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
    public String createBooking(String userId, String roomId, 
    	LocalDate startDate, LocalDate endDate, 
		LocalTime startTime, LocalTime endTime,
		String paymentId) { // payment parameter
		
		Room room = roomRepo.findById(roomId);
		
		// 1. Availability Check
		if (room == null || !room.isAvailable()) {
		System.out.println("Room not available.");
		return null; // <--- Return null on failure
		}
		
		// 2. Date Math Setup
		LocalDateTime requestStart = LocalDateTime.of(startDate, startTime);
		LocalDateTime requestEnd = LocalDateTime.of(endDate, endTime);
		
		// 3. Overlap Check
		boolean isOccupied = roomRepo.findAllBookings().stream()
		.filter(b -> b.getRoomId().equals(roomId)) 
		.filter(b -> !b.getStatus().equals("CANCELLED")) 
		.anyMatch(b -> {
		LocalDateTime existingStart = LocalDateTime.of(b.getStartDate(), b.getStartTime());
		LocalDateTime existingEnd = LocalDateTime.of(b.getEndDate(), b.getEndTime());
		return requestStart.isBefore(existingEnd) && requestEnd.isAfter(existingStart);
		});
		
		if (isOccupied) {
			System.out.println("Room is occupied on these dates/times.");
			return null; // <--- Return null on failure
		}
		
		// 4. Create Booking with ID and Payment ID
		String newBookingId = "B-" + System.currentTimeMillis(); // Generate ID here to return it
		
		Booking booking = new Booking(
		newBookingId, 
		roomId, 
		userId, 
		startDate, 
		endDate,
		startTime, 
		endTime,
		paymentId // <--- Pass paymentId to model
		);
		
		roomRepo.saveBooking(booking);
		return newBookingId; // <--- Return the ID on success
		}

    // We execute this if the user decides to cancel their booking
    public void cancelBooking(String bookingId) {
        Booking b = roomRepo.findAllBookings().stream()
            .filter(booking -> booking.getBookingId().equals(bookingId))
            .findFirst()
            .orElse(null);
            
        if (b != null) {
            b.performCancel(); // This triggers the State transition
            roomRepo.saveBooking(b); // Saves the update state
        }
    }
    
    
    // This method the PaymentController to save the payment instance to the database without having to talk to the DB directly.
    public void savePayment(String paymentId, double amount) {
        // 1. Create the payment model
        // Assuming you have imported core.models.payment.Payment
        core.models.payment.Payment p = new core.models.payment.Payment(paymentId, amount);
        p.completePayment(); // Mark it as successful
        
        // 2. Save to DB (You need to add this method to Repository first)
        // Ideally, create a PaymentRepository, but for now:
        Database.getInstance().savePayment(p); 
    }
    
    // This class handles the enabling of a room which was previously disabled.
    
    /**
     * Marks a disabled room as having finished maintenance/cleaning.
     * Transition: DISABLED -> READY_FOR_ENABLE
     */
    public void maintenanceCompleted(String roomId) { 
        Room r = roomRepo.findById(roomId);
        if (r != null) {
            r.performMaintenance(); // Calls the model method (keeps original name in Room.java)
            System.out.println("Room " + roomId + " maintenance complete. Ready to enable.");
        }
    }

    /**
     * Enables a room that is ready.
     * Transition: READY_FOR_ENABLE -> ENABLED
     */
    public void enableRoom(String roomId) {
        Room r = roomRepo.findById(roomId);
        if (r != null) {
            // added check for already enabled
            if (r.isAvailable()) { 
                System.out.println("Room is already enabled.");
                return;
            }
            r.requestEnable();
        }
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