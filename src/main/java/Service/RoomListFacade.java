package Service;

import Model.Room.Room;
import Model.Room.RoomProxy;
import Model.Room.RoomProxyFactory;
import Repository.RoomRepository; 

import java.util.List;
import java.util.stream.Collectors;

// Simplified Interface for Frontend 
public class RoomListFacade {
    private RoomService roomService;
    private RoomRepository repo;

    public RoomListFacade() {
        this.roomService = new RoomService();
        this.repo = new RoomRepository();
    }

    // For Guests: Only show bookable rooms wrapped in GuestProxy
    public List<RoomProxy> getAvailableRoomsForGuest() {
        return repo.findAll().stream()
                .filter(Room::isAvailable)
                .map(r -> RoomProxyFactory.getProxy("GUEST", r))
                .collect(Collectors.toList());
    }

    // For Admins: Show all rooms (even disabled ones) wrapped in AdminProxy
    public List<RoomProxy> getAllRoomsForAdmin() {
        return repo.findAll().stream()
                .map(r -> RoomProxyFactory.getProxy("ADMIN", r))
                .collect(Collectors.toList());
    }
}