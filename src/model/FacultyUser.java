package model;

public class FacultyUser extends User {

    public FacultyUser(String name, String email, String password) {
        super(name, email, password,AccountType.FACULTY);
    }
    
}
