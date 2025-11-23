package core.models.room;

// INTERFACE -- ROOM STATE

public interface RoomState {
    void enable(Room context);
    void disable(Room context);
    boolean isBookable();
    String getStateName();
	void maintain(Room context);
}