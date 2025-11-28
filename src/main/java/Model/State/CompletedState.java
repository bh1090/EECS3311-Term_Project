package Model.State;

//This class is the completed state. Represents state when the full booking process is done. 

import Model.Room.Booking;

public class CompletedState implements BookingState {
    @Override
    public void cancel(Booking context) {
        System.out.println("Cannot cancel a completed booking.");
    }
    @Override
    public void checkIn(Booking context) { 
    	System.out.println("Booking already finished."); }
    @Override
    public void checkOut(Booking context) {
        System.out.println("Cannot check out a completed booking.");}
    @Override
    public String getStatus() { 
    	return "COMPLETED"; 
    	}
}
