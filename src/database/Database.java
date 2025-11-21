package database;

import repository.*;

public class Database {

    private static Database singletonInstance= new Database();

    private  UserRepository userRepository= UserRepository.getInstance();

    private Database() { 
    	
    }

    public static Database getInstance() {
    	
        return singletonInstance;
    }

    public UserRepository getUserRepository() {
        return  userRepository;
    }
    
}
