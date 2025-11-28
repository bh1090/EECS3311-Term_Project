package Repository;


import java.io.FileWriter;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import Database.Database;
import Model.AccountType;
import Model.User;
import Model.UserFactory;



public class UserRepository {

    private static final UserRepository singletonInstance = new UserRepository();

    private ArrayList<User> users= new ArrayList<User>();

    private UserRepository() {
        load();
    }

    public static UserRepository getInstance() {
        return singletonInstance;
    }

    //load, but from database
    private void load() {
        String path= Database.getUserCsvPath();

        try {
        	
            CsvReader reader= new CsvReader(path);
            reader.readHeaders();

            users.clear();

            while (reader.readRecord()) {
                String name= reader.get("name");
                String id= reader.get("id");
                String email= reader.get("email");
                String password= reader.get("password");
                String accountstr= reader.get("accountType");
                String verifiedstr= reader.get("verified");

              
                AccountType accountType= mapCsvTypeToAccountType(accountstr);
             
                boolean verified= Boolean.parseBoolean(verifiedstr);

                //factory to create
                User user = UserFactory.createUserFromCsv(id,name,email,password,accountType,verified,accountstr);
                users.add(user);
                
            }

            reader.close();

        } 
        
        catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        
    }

   
    
    private AccountType mapCsvTypeToAccountType(String typeText) {
        if (typeText == null) {
            throw new IllegalArgumentException("Missing user type in CSV.");
        }
        String t= typeText.trim().toUpperCase();

        //4 main account types
        try {
            return AccountType.valueOf(t);
        } 
        
        catch (IllegalArgumentException ignored) {
            
        }

        //extra types
        if (t.startsWith("MAINTENANCE")) {  
        	
            return  AccountType.STAFF;
        }
        
        if (t.startsWith("CHIEF")) {   
            return  AccountType.STAFF;
        }
        
        if (t.startsWith("ADMIN")) {  
            return  AccountType.STAFF;
        }

        throw new IllegalArgumentException("Unknown account type in users.csv: " + typeText);
    }

    
    
   
    private void update() {
    	
        String path= Database.getUserCsvPath();

        try {
        	
            CsvWriter csvOutput= new CsvWriter(new FileWriter(path, false), ',');

    
            csvOutput.write("name");
            csvOutput.write("id");
            csvOutput.write("email");
            csvOutput.write("password");
            csvOutput.write("accountType");
            csvOutput.write("verified");
            csvOutput.endRecord();

            for (User u: users) {
                csvOutput.write(u.getName());
                csvOutput.write(u.getId());
                csvOutput.write(u.getEmail());
                csvOutput.write(u.getPassword());
                csvOutput.write(u.getRole());
                csvOutput.write(String.valueOf(u.isVerified()));
                csvOutput.endRecord();
            }
            
            csvOutput.close();

        } 
        
        catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        
    }

    
    

    public User findByEmail(String  email) {
        if (email== null) {
        	return null;
        }

        for (User u: users) {
        	
            if (u.getEmail().equalsIgnoreCase(email)) {
                return u;
            }
            
        }
        
        return null;
    }

    
    
    public void save(User user) {
    	
        users.add(user);
        update();
    }
    
}
