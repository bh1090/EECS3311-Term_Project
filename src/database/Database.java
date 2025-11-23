package database;

public class Database {

    private  static Database singletonInstance= new Database();

    //depends on where csv is
    private final String userCsvPath= "data/users.csv";

    private Database() { 
    	
    }

    public static Database getInstance() {
        return singletonInstance;
    }

    public String getUserCsvPath() {
        return  userCsvPath;
    }
}