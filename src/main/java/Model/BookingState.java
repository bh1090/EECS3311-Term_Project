package Model;

interface BookingState {
    void cancel(Booking context);
    void checkIn(Booking context);
    void checkOut(Booking context);
    String getStatus();
}
