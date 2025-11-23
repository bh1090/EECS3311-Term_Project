package Model;

public class FacultyUser extends User {

	//when using gui
    public FacultyUser(String name, String email, String password) {
        super(name, email, password,AccountType.FACULTY);
    }
    
    //when CSV loading
    public FacultyUser(String id, String name,String email,String password,boolean verified,String role) {
        super(id,name, email, password,AccountType.FACULTY,verified, role);
    }
}
