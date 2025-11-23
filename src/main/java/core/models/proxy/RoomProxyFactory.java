package core.models.proxy;

import core.models.room.Room;

public class RoomProxyFactory {
    public static RoomProxy getProxy(String userType, Room room) {
        if (userType.equalsIgnoreCase("ADMIN")) {
            return new AdminRoomProxy(room);
        } else {
            return new GuestRoomProxy(room);
        }
    }
}
