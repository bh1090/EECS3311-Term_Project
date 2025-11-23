package Model;

import java.util.UUID;

public abstract class User {

    private String id;
    private String email;
    private String password; 
    private String name;
    private AccountType  accountType;
    private boolean verified;
    //original role/accountype from CSV
    private String role;

    //normal signup
    protected User(String name, String email, String password, AccountType accountType) {
    	 this.name = name;
        this.email= email;
        this.password= password;
        this.accountType= accountType;
    	this.id= UUID.randomUUID().toString();
        this.verified= true; 
        this.role= accountType.name();
    }

    //used when using CSV, (include verified)
    protected User(String id,String name,String email, String password, AccountType accountType, boolean verified, String role) {
    	this.id= id;
    	this.name= name;
    	this.email= email;
    	this.password= password;
    	this.accountType= accountType;
    	this.verified= verified;
    	this.role= role;
    }
    
    //getters / setters
    
    public String getId() { 
    	return id; 
    }
    
    public String getName() { 
    	return name; 
    	
    }
    
    public void setName(String name) {
        this.name= name;
    }
    
    public String getEmail() { 
    	return email; 
    }
    
    public void setEmail(String email) {
        this.email= email;
        
    }
    
    public String getPassword() {
    	
        return password;
    }
    
    public void setPassword(String password) {
        this.password= password;
    }
    
    public AccountType getAccountType() { 
    	return accountType; 
    }

    public void setAccountType(AccountType  accountType) {
    	
        this.accountType= accountType;
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
        return password!= null&& this.password.equals(password);
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role= role;
    }
    
}
