package model;

public class PartnerUser extends User {

    public PartnerUser(String name, String email, String password) {
        super(name, email,password, AccountType.PARTNER);
    }
    
}
