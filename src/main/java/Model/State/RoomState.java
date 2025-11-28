package Model.State;

// INTERFACE -- ROOM STATE

import Model.Room.Room;

public interface RoomState {
    void enable(Room context);
    void disable(Room context);
    boolean isBookable();
    String getStateName();
	void maintain(Room context);
}