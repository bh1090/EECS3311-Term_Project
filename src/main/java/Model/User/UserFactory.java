package Model.User;

public class UserFactory {


    //creates a user (manual)
    public static User createUser(AccountType accountType, String name, String email, String password) {

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

    	    throw new IllegalArgumentException("wrong account type: " +accountType);
    	}
    
    //creating  from csv
    public static User createUserFromCsv(String id, String name,String email, String password, AccountType accountType, boolean verified, String role) {

    	if (accountType== AccountType.STUDENT) {
    		return new StudentUser(id,name,email,password,verified, role);
    	}
    	else if (accountType==AccountType.FACULTY) {
    		return new FacultyUser(id,name,email,password,verified, role);
    	}
    	else if (accountType==AccountType.STAFF) {
    		return new StaffUser(id,name,email,password,verified, role);
    	}
    	else if (accountType==AccountType.PARTNER) {
    		return new PartnerUser(id,name,email,password,verified, role);
    	}

    	throw new IllegalArgumentException("wrong account type: " +accountType);
    }

    
}
