package Model.State;

import Model.Room.Booking;

public interface BookingState {
    void cancel(Booking context);
    void checkIn(Booking context);
    void checkOut(Booking context);
    String getStatus();
}
