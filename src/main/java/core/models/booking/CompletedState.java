package core.models.booking;

//This class is the completed state. Represents state when the full booking process is done. 

class CompletedState implements BookingState {
    @Override
    public void cancel(Booking context) { 
    }
    @Override
    public void checkIn(Booking context) { 
    	System.out.println("Booking already finished."); }
    @Override
    public void checkOut(Booking context) {
    	
    }
    @Override
    public String getStatus() { 
    	return "COMPLETED"; 
    	}
}
