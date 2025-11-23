package core.models.booking;

//Initial state after payment.

class ConfirmedState implements BookingState {
 @Override
 public void cancel(Booking context) {
     System.out.println("Booking cancelled.");
     context.setState(new CancelledState());
 }

 @Override
 public void checkIn(Booking context) {
     System.out.println("Guest checked in.");
     context.setState(new CheckInState());
 }

 @Override
 public void checkOut(Booking context) {
     System.out.println("Cannot check out. Guest hasn't checked in yet.");
 }
 
 @Override
 public String getStatus() { return "CONFIRMED"; }
}
