package Model.Room;

public interface Observer {
    void update(boolean isAnyEssentialMaintenanceRequestPending, int currentRoomID);
}