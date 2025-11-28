package Model;

//Guest is currently in the room.
public class CheckInState implements BookingState {
 @Override
 public void cancel(Booking context) {
     System.out.println("Cannot cancel. Guest is already here.");
 }

 @Override
 public void checkIn(Booking context) {
     System.out.println("Already checked in.");
 }

 @Override
 public void checkOut(Booking context) {
     System.out.println("Guest checking out. Booking complete.");
     context.setState(new CompletedState());
 }
 
 @Override
 public String getStatus() { return "CHECKED_IN"; }
}
