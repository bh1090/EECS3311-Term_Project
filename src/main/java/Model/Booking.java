package Model;

import java.time.LocalDate;
import java.time.LocalTime;


public class Booking {
    private String bookingId;
    private String roomId;
    private String userId; 
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private BookingState state;
    private String paymentId; 

    public Booking(String bookingId, String roomId, String userId, 
            LocalDate startDate, LocalDate endDate, 
            LocalTime startTime, LocalTime endTime, String paymentId) {
    		this.bookingId = bookingId;
    		this.roomId = roomId;
    		this.userId = userId;
    		this.startDate = startDate;
    		this.endDate = endDate;
    		this.startTime = startTime;
    		this.endTime = endTime;
    		this.state = new ConfirmedState(); 
    		this.paymentId = paymentId; 
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
    public LocalTime getStartTime() { 
    	return startTime;
    	}
    public LocalTime getEndTime() { 
    	return endTime; 
    	}
    
    public String getPaymentId() { 
    	return paymentId; 
    	}
    
}
