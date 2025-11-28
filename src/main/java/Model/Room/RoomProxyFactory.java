package Model.Room;

import Model.Room.AdminRoomProxy;
import Model.Room.GuestRoomProxy;

public class RoomProxyFactory {
    public static RoomProxy getProxy(String userType, Room room) {
        if (userType.equalsIgnoreCase("ADMIN")) {
            return new AdminRoomProxy(room);
        } else {
            return new GuestRoomProxy(room);
        }
    }
}
