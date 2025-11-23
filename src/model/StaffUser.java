package model;

public class StaffUser extends User {

	
	//when using gui
    public StaffUser(String name, String email, String password) {
        super(name,email, password, AccountType.STAFF);
    }
    
    
  //when CSV loading
    public StaffUser(String id, String name,String email,String password,boolean verified,String role) {
        super(id,name, email, password,AccountType.STAFF,verified, role);
    }
    
}
