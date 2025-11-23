
package core.models.room;
// Room class.

// This is the main object being passed around.

public class Room {
    private String roomCapacity;
    private String location;
    private double price;
    private String roomId;
    private RoomState state; // The current state object

    public Room(String roomId, String location, double price, String roomCapacity) {
        this.roomCapacity = roomCapacity;
        this.location = location;
        this.price = price;
        this.state = new RoomDisabledState(); // Default
        this.roomId = roomId;
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
    
    public String getRoomCapacity() { 
    	return roomCapacity; }
    
    public String getRoomId() {
    	return roomId;
    }
    
    public String getLocation() { 
    	return location; }
    
    public double getPrice() { 
    	return price; }
    
}

