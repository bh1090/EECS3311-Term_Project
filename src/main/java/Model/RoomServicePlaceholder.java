package Model;

public class RoomServicePlaceholder implements Observer {

    private static RoomServicePlaceholder instance = null;

    private RoomServicePlaceholder() {
    }

    public static RoomServicePlaceholder getInstance() {
        if (instance == null) {
            instance = new RoomServicePlaceholder();
        }
        return instance;
    }   

    @Override
    public void update(boolean isAnyEssentialMaintenanceRequestPending, int currentRoomID) {
    }   

    
}
