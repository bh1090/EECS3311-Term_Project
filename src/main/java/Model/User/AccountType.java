package Model.User;

public enum AccountType {
    STUDENT(20.0),
    FACULTY(30.0),
    STAFF(40.0),
    PARTNER(50.0);

    private  double hourlyRate;

    AccountType(double hourlyRate) {
        this.hourlyRate= hourlyRate;
        
    }

    public double getHourlyRate() {
        return  hourlyRate;
    }
    
}
