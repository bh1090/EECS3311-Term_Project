package core.models.room;

public class RoomEnabledState implements RoomState {
    @Override
    public void enable(Room context) {
        System.out.println("Room is already enabled.");
    }

    @Override
    public void disable(Room context) {
        System.out.println("Disabling room...");
        context.setState(new RoomDisabledState());
    }

    @Override
    public void maintain(Room context) {
        System.out.println("Room sent to maintenance check.");
        context.setState(new RoomReadyForEnableState()); 
    }

    @Override
    public boolean isBookable() {
        return true;
    }
    
    @Override
    public String getStateName() { return "ENABLED"; }
}