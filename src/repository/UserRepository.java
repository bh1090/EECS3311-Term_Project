package repository;

import model.*;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static UserRepository singletonInstance= new UserRepository();

    private final Map<String, User> usersByEmail= new HashMap<>();

    private UserRepository() { 
    	
    }

    public static UserRepository getInstance() {
        return singletonInstance;
    }

    
    public void save(User user) {
        if (user== null || user.getEmail()== null) {
        	
            return;
        }
        
        usersByEmail.put(user.getEmail().toLowerCase(), user);
    }

   
    //returns the email of the user
    public User findByEmail(String email) {
    	
        if (email==null) {
        	
        	return null;
        }
        
        return usersByEmail.get(email.toLowerCase());
        
    }
}
