package model;

public class StudentUser extends User {

    public StudentUser(String name,String email, String password) {
        super(name,email,password,AccountType.STUDENT);
    }
    
}
