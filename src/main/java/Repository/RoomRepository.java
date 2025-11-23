package Repository;

import java.util.List;

import Database.Database;
import Model.Booking;
import Model.Payment;
import Model.Room;

class RoomRepository {
    private Database db = Database.getInstance();

    public void save(Room room) { db.saveRoom(room); }
    
    public Room findById(String id) {
        return db.rooms.stream()
            .filter(r -> r.getRoomId().equals(id))
            .findFirst().orElse(null);
    }

    public List<Room> findAll() { return db.rooms; }

    public void saveBooking(Booking booking) { db.saveBooking(booking); }
    
    public List<Booking> findAllBookings() { return db.bookings; }

    public void savePayment(Payment payment) {
        db.savePayment(payment);
    }
    
    // HELPER METHOD: Calculates the next available ID
    public String generateNextId() {
        int maxId = 0;
        for (Room r : db.rooms) {
            try {
                // We assumed IDs are numbers like "1", "2", "100", etc
                int currentId = Integer.parseInt(r.getRoomId());
                if (currentId > maxId) {
                    maxId = currentId;
                }
            } catch (NumberFormatException e) {
                // Ignore weird IDs that aren't numbers (just in case)
            }
        }
        return String.valueOf(maxId + 1);
    }
}