package Model.State;

import Model.Room.Room;

// DISABLED STATE
// Scenario 2: Room is offline/renovating.
public class RoomDisabledState implements RoomState {
    @Override
    public void enable(Room context) {
        System.out.println("Cannot enable directly from Disabled. Must be prepped first.");
    }

    @Override
    public void disable(Room context) {
        System.out.println("Room is already disabled.");
    }

    @Override
    public boolean isBookable() {
        return false;
    }
    
    @Override
    public String getStateName() { return "DISABLED"; }

	@Override
	public void maintain(Room context) {
		// TODO Auto-generated method stub
		context.setState(new RoomReadyForEnableState());
	}
}