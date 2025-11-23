package core.models.room;

// An intermediate state (e.g., cleaned after renovation).
public class RoomReadyForEnableState implements RoomState {
    @Override
    public void enable(Room context) {
        System.out.println("Room passed checks. Enabling.");
        context.setState(new RoomEnabledState());
    }

    @Override
    public void disable(Room context) {
        context.setState(new RoomDisabledState());
    }

    @Override
    public void maintain(Room context) {
         System.out.println("Already ready.");
    }

    @Override
    public boolean isBookable() {
        return false; // Not quite ready yet
    }

    @Override
    public String getStateName() { return "READY_FOR_ENABLE"; }
}