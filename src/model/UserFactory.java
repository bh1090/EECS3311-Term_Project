package model;

public class UserFactory {

    private UserFactory() { 
    	
    }

    //creates a user
    public static User createUser(AccountType accountType,String name,String email,String password) {

    		if (accountType== AccountType.STUDENT) {
    			
    			return new StudentUser(name,email,password);
    	    }
    		
    	    else if (accountType== AccountType.FACULTY) {
    	    	
    	        return new FacultyUser(name,email,password);
    	    }
    		
    	    else if (accountType== AccountType.STAFF) {
    	    	
    	        return new StaffUser(name,email, password);
    	    }
    		
    	    else if (accountType== AccountType.PARTNER) {
    	    	
    	        return new PartnerUser(name, email,password);
    	    }

    	    throw new IllegalArgumentException("wrong account type: " + accountType);
    	}
}
