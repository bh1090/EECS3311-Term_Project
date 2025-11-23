package Model;

public class PartnerUser extends User {

	//when using gui
    public PartnerUser(String name, String email, String password) {
        super(name, email,password, AccountType.PARTNER);
    }
    
    
    //when CSV loading
    public PartnerUser(String id, String name,String email,String password,boolean verified,String role) {
        super(id,name, email, password,AccountType.PARTNER,verified, role);
    }
}
