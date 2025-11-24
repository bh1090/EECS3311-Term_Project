package Model;


//This class (Admin) can see everything (Maintenance status, full ID, etc)

class AdminRoomProxy implements RoomProxy {
 private Room realRoom;

 public AdminRoomProxy(Room room) {
     this.realRoom = room;
 }

 @Override
 public void showRoomDetails() {
     System.out.println("ADMIN VIEW: ID=" + realRoom.getRoomId() + 
                        ", State=" + realRoom.getState().getStateName() + 
                        ", Price=" + realRoom.getPrice());
 }

 @Override
 public String getRoomId() { return realRoom.getRoomId(); }
}
