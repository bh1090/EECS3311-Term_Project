package core.service;

import core.models.room.Room;
import core.models.proxy.RoomProxy;
import core.models.proxy.RoomProxyFactory;
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