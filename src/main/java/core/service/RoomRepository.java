package core.service;

import core.infrastructure.Database;
import core.models.room.Room;
import core.models.booking.Booking;
import core.models.proxy.RoomProxy;
import core.models.proxy.RoomProxyFactory;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

//
// Handles CRUD operations with the Singleton Database
class RoomRepository {
    private Database db = Database.getInstance();

    public void save(Room room) { 
    	db.saveRoom(room); 
    	}
    
    public Room findById(String id) {
        return db.rooms.stream()
            .filter(r -> r.getRoomId().equals(id))
            .findFirst().orElse(null);
    }

    public List<Room> findAll() { return db.rooms; }

    public void saveBooking(Booking booking) { db.saveBooking(booking); }
    
    public List<Booking> findAllBookings() { return db.bookings; }
    
    
}