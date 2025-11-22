package core.models.booking;

import java.time.LocalDate;

public class Booking {
    private String bookingId;
    private String roomId;
    private String userId; 
    private LocalDate startDate;
    private LocalDate endDate;
    private BookingState state;

    public Booking(String bookingId, String roomId, String userId, LocalDate start, LocalDate end) {
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.userId = userId;
        this.startDate = start;
        this.endDate = end;
        this.state = new ConfirmedState(); // Default start state
    }

    // State Transitions
    public void performCheckIn() { 
    	state.checkIn(this); 
    	}
    
    public void performCheckOut() { 
    	state.checkOut(this); 
    	}
    
    public void performCancel() { 
    	state.cancel(this); 
    	}

    public void setState(BookingState state) {
    	this.state = state; 
    	}
    
    public String getStatus() { 
    	return state.getStatus(); 
    	}
    
    public String getBookingId() { 
    	return bookingId;
    	}
    
    public String getRoomId() { 
    	return roomId; 
    	}
    
    public LocalDate getStartDate() {
    	return startDate; 
    	}
    
    public LocalDate getEndDate() { 
    	return endDate;
    	}
    
}
