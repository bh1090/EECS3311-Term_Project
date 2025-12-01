package Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import Model.Room.Booking;
import Model.Room.Observer;
import Model.Payment.Payment;
import Model.Room.Room;
import Repository.BookingRepository;
import Repository.PaymentRepository;
import Repository.RoomRepository;

/**
 * Service Layer for handling Room and Booking logic.
 * Now connects to Singleton Repositories for persistence.
 */
public class RoomService implements Observer{
    // 1. Get Singleton instances of the repositories
    private static RoomService instance = null;
    private RoomRepository roomRepo = RoomRepository.getInstance();
    private BookingRepository bookingRepo = BookingRepository.getInstance();
    private PaymentRepository paymentRepo = PaymentRepository.getInstance();

    public void createRoom(String loc, double price, String capacity) {
        String nextId = roomRepo.generateNextId();
        Room newRoom = new Room(nextId, loc, price, capacity);
        roomRepo.save(newRoom); // Saves to rooms.csv
        System.out.println("Room created: " + nextId);
    }

    public String createBooking(String userId, String roomId, 
                                 LocalDate startDate, LocalDate endDate, 
                                 LocalTime startTime, LocalTime endTime,
                                 String paymentId) {
        // Use RoomRepo to find room
        Room room = roomRepo.findById(roomId);
        if (room == null || !room.isAvailable()) return null;

        LocalDateTime requestStart = LocalDateTime.of(startDate, startTime);
        LocalDateTime requestEnd = LocalDateTime.of(endDate, endTime);

        // Use BookingRepo to find conflicts
        boolean isOccupied = bookingRepo.findAll().stream() 
            .filter(b -> b.getRoomId().equals(roomId)) 
            .filter(b -> !b.getStatus().equals("CANCELLED")) 
            .anyMatch(b -> {
                LocalDateTime existingStart = LocalDateTime.of(b.getStartDate(), b.getStartTime());
                LocalDateTime existingEnd = LocalDateTime.of(b.getEndDate(), b.getEndTime());
                return requestStart.isBefore(existingEnd) && requestEnd.isAfter(existingStart);
            });

        if (isOccupied) {
            System.out.println("Room is occupied.");
            return null;
        }

        Booking booking = new Booking("B-" + System.currentTimeMillis(), roomId, userId, startDate, endDate, startTime, endTime, paymentId);
        
        // Use BookingRepo to save
        bookingRepo.save(booking); // Saves to bookings.csv
        return booking.getBookingId();
    }

    public void savePayment(String paymentId, double amount) {
        Payment p = new Payment(paymentId, amount);
        p.completePayment();
        // Use PaymentRepo to save
        paymentRepo.save(p); // Saves to payments.csv
    }
    
    public void disableRoom(String roomId) {
        Room r = roomRepo.findById(roomId);
        if (r != null) {
            r.requestDisable();
            roomRepo.save(r); // Persist state change
        }
    }

    public void maintenanceCompleted(String roomId) {
        Room r = roomRepo.findById(roomId);
        if (r != null) {
            r.performMaintenance();
            roomRepo.save(r); // Persist state change
        }
    }

    public RoomService getInstance(){
        if(instance == null){
            instance = new RoomService();
            EvaluateRoomMaintenanceRelationshipService.getInstance().registerObserver(instance);
        }
        return instance;
    }

    public void enableRoom(String roomId) {
        Room r = roomRepo.findById(roomId);
        if (r != null) {
            if (r.isAvailable()) return;
            r.requestEnable();
            roomRepo.save(r); // Persist state change
        }
    }

    public boolean cancelBooking(String bookingId) {
        Booking b = bookingRepo.findById(bookingId);
        if (b != null) {
            b.performCancel();
            bookingRepo.save(b); // Persist state change
            return true;
        }
        return false;
    }
    
    public boolean performCheckIn(String bookingId) {
        Booking b = bookingRepo.findById(bookingId);
        if (b != null) {
            b.performCheckIn();
            bookingRepo.save(b); // Persist state change
            return true;
        }
        return false;
    }

    public Booking getBookingDetails(String bookingId) {
        return bookingRepo.findById(bookingId);
    }
    
    // Perform Checkout
    public boolean performCheckOut(String bookingId) {
        Booking b = bookingRepo.findById(bookingId);
        if (b != null) {
            b.performCheckOut();
            bookingRepo.save(b); // Persist state change (CONFIRMED/CHECKED_IN -> COMPLETED)
            return true;
        }
        return false;
    }

    @Override
    public void update(boolean isAnyEssentialMaintenanceRequestPending, int currentRoomID) {
        Room r = roomRepo.findById(String.valueOf(currentRoomID));
        if (r != null) {
            if (isAnyEssentialMaintenanceRequestPending) {
                r.requestDisable();
            } else {
                r.requestEnable();
            }
            roomRepo.save(r); // Persist state change
        }
    }
}