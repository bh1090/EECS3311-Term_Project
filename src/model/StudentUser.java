package model;

public class StudentUser extends User {

	//when using gui
    public StudentUser(String name,String email, String password) {
        super(name,email,password,AccountType.STUDENT);
    }
    
    //when CSV loading
    public StudentUser(String id, String name,String email,String password,boolean verified) {
        super(id,name, email, password,AccountType.STUDENT,verified);
    }
}
