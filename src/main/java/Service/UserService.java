package Service;

import Model.AccountType;
import Model.User;
import Model.UserFactory;
import Repository.UserRepository;


public class UserService {

    private final UserRepository userRepository;

    public UserService() {
        this.userRepository= UserRepository.getInstance();
    }
    
    public User createUser(AccountType accountType,String name,String email,String password) {
    	User user= UserFactory.createUser(accountType,name,email, password);
    	
        userRepository.save(user);
        
        return user;
    }

   
}
