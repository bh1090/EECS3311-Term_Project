package model;

public class StaffUser extends User {

    public StaffUser(String name, String email, String password) {
        super(name,email, password, AccountType.STAFF);
    }
    
}
