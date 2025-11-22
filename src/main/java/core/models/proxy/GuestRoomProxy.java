package core.models.proxy;
import core.models.room.Room;

//This class hides maintenance state.

class GuestRoomProxy implements RoomProxy {
 private Room realRoom;

 public GuestRoomProxy(Room room) {
     this.realRoom = room;
 }

 @Override
 public void showRoomDetails() {
     // Guests don't need to know the internal state if it's enabled
     System.out.println("GUEST VIEW: Location=" + realRoom.getLocation() + 
                        ", Price=$" + realRoom.getPrice() + 
                        "/night");
 }

 @Override
 public String getRoomId() { return realRoom.getRoomId(); }
}
