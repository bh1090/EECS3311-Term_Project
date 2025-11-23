package Service;

import application.*;
import database.*;
import model.*;
import repository.*;

public class AuthenticationService {

    private final UserRepository userRepository;

    public AuthenticationService() {
    	this.userRepository= UserRepository.getInstance();
    }


    public User register(String name,String email,String password,AccountType accountType) throws AuthenticationException {

        if (name== null||name.isBlank()|| email== null|| email.isBlank()|| password== null||password.isBlank() ||accountType== null) {
            throw new AuthenticationException("Missing  field.");
        }

        emailFormat(email);
        passwordStrength(password);

        //check if same user/email
        User existing = userRepository.findByEmail(email);
        if (existing != null) {
            throw new AuthenticationException("A user with this email already exists.");
        }

        boolean isYork = isYorkEmail(email);

        //based on account needs specific email
        switch (accountType) {
            case STUDENT:
            case FACULTY:
            case STAFF:
                if (!isYork) {
                    throw new AuthenticationException("Students, faculty, and staff must use a YorkU email, which is @yorku.ca or @my.yorku.ca");
                }
                
                break;

            case PARTNER:
                if (!isYork && !properEmail(email)) {
                    throw new AuthenticationException("Partner accounts must use a popular email provider " +"(Gmail, Outlook, Hotmail, Yahoo, Live, iCloud) or a YorkU email."
                    );
                }
                break;

            default:
                throw new AuthenticationException("Wrong account type.");
        }

        //create the user
        User user = UserFactory.createUser(accountType, name, email, password);

     
        user.setVerified(true);

        userRepository.save(user);
        return user;
    }

    public User login(String email, String password) throws AuthenticationException {

        if (email== null ||email.isBlank() ||password== null || password.isBlank()) {
            throw new AuthenticationException("Email and password are  required.");
        }

        
        User user= userRepository.findByEmail(email);
        if (user== null) {
            throw new AuthenticationException("No user found for this email.");
        }

        if (!user.checkPassword(password)) {
            throw new AuthenticationException("Incorrect password.");
        }

        SessionData.setCurrentUser(user);
        return user;
    }

    public void logout() {
        SessionData.clear();
    }

    //email  format
    private void emailFormat(String email) throws AuthenticationException {
        if (!email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            throw new AuthenticationException("Please enter a valid email address.");
        }
    }

    //strong password
    private void passwordStrength(String password) throws AuthenticationException {
    	
        if (password.length()< 8) {
            throw new AuthenticationException("Password must be at least 8 characters.");
        }
        
        if (!password.matches(".*[A-Z].*")) {
            throw new AuthenticationException("Password must contain an uppercase letter.");
        }
        
        if (!password.matches(".*[a-z].*")) {
            throw new AuthenticationException("Password must contain a lowercase letter.");
        }
        
        if (!password.matches(".*\\d.*")) {
            throw new AuthenticationException("Password must contain a digit.");
        }
        
        if (!password.matches(".*[^A-Za-z0-9].*")) {
            throw new AuthenticationException("Password must contain a symbol.");
        }
        
    }

    private boolean isYorkEmail(String email) {
        String lower= email.toLowerCase();
        return lower.endsWith("@yorku.ca")||lower.endsWith("@my.yorku.ca");
    }

  
    private boolean properEmail(String email) {
    	
        String lower= email.toLowerCase();
        int atIndex= lower.lastIndexOf('@');
        
        if (atIndex< 0|| atIndex== lower.length()-1) {
        	
            return false;
        }
        
        String domain = lower.substring(atIndex+1);

        return domain.equals("gmail.com") || domain.equals("outlook.com")||domain.equals("hotmail.com")||domain.equals("yahoo.com")||domain.equals("yahoo.ca")||domain.equals("icloud.com");
    }
}
