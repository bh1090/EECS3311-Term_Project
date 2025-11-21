package model;

import java.util.UUID;

public abstract class User {

    private String id;
    private String email;
    private String password; 
    private String name;
    private AccountType  accountType;
    private boolean verified;

    protected User(String name, String email, String password, AccountType accountType) {
    	 this.name = name;
        this.email= email;
        this.password= password;
        this.accountType= accountType;
    	this.id= UUID.randomUUID().toString();
        this.verified= true; 
    }

    
    //getters
    
    public String getId() { 
    	return id; 
    }
    
    public String getName() { 
    	return name; 
    	
    }
    
    public String getEmail() { 
    	return email; 
    }
    
    public AccountType getAccountType() { 
    	return accountType; 
    }

    public double getHourlyRate() {
        return accountType.getHourlyRate();
    }

    public boolean isVerified() {
    	
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified= verified;
    }

  
    public boolean checkPassword(String password) {
        return password!= null&& password.equals(password);
    }
    
}
