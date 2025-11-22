
package core.models.room;
// Room class.

// This is the main object being passed around.

public class Room {
    private String roomId;
    private String location;
    private double price;
    private RoomState state; // The current state object

    public Room(String roomId, String location, double price) {
        this.roomId = roomId;
        this.location = location;
        this.price = price;
        this.state = new RoomDisabledState(); // Default
    }

    // State Delegation Methods
    public void requestEnable() { 
    	state.enable(this); 
    	}
    
    public void requestDisable() { 
    	state.disable(this); 
    	}
    
    public boolean isAvailable() { 
    	return state.isBookable(); 
    	}

    // Standard Getters/Setters
    public void setState(RoomState state) { 
    	this.state = state; }
    
    public RoomState getState() { 
    	return state; }
    
    public String getRoomId() { 
    	return roomId; }
    
    public String getLocation() { 
    	return location; }
    
    public double getPrice() { 
    	return price; }
}