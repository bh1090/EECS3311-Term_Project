package core.models.booking;

class CancelledState implements BookingState {
    @Override
    public void cancel(Booking context) { 
    	System.out.println("Error: Booking was cancelled.");
    }
    @Override
    public void checkIn(Booking context) { 
    	System.out.println("Error: Booking was cancelled."); }
    @Override
    public void checkOut(Booking context) { 
    	System.out.println("Error: Booking was cancelled.");
    }
    @Override
    public String getStatus() { 
    	return "CANCELLED"; }
}