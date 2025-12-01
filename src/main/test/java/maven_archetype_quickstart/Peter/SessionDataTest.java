package maven_archetype_quickstart.Peter;

import Application.SessionData;
import Model.User.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SessionDataTest {

	
    @AfterEach
    public void clear() {
    	
        SessionData.clear();
    }

    //new student
    private User newStudent(String name) {
        return UserFactory.createUser(AccountType.STUDENT,name,name.toLowerCase().replace(" ", "") + "@yorku.ca","Password123!");
    }

    //null
    @Test
    public void currentNull() {
        SessionData.clear();
        assertNull(SessionData.getCurrentUser());
    }

    //get the current user
    @Test
    public void getCurrentUser() {
        User user= newStudent("user");
        SessionData.setCurrentUser(user);
        assertSame(user,SessionData.getCurrentUser());
    }

    //clear 
    @Test
    public void clearCurrentUser() {
        User user= newStudent("user");
        SessionData.setCurrentUser(user);
        SessionData.clear();
        assertNull(SessionData.getCurrentUser());
    }

    @Test
    public void overwriteUser() {
    	
        User user1= newStudent("user1");
        User user2= newStudent("user2");

        SessionData.setCurrentUser(user1);
        SessionData.setCurrentUser(user2);
        assertSame(user2,SessionData.getCurrentUser());
    }

    @Test
    public void currentUserNull() {
        User user= newStudent("user");
        SessionData.setCurrentUser(user);
        SessionData.setCurrentUser(null);
        assertNull(SessionData.getCurrentUser());
    }


    @Test
    public void studentUser() {
    	
        User user= newStudent("student");
        SessionData.setCurrentUser(user);
        assertEquals(AccountType.STUDENT,SessionData.getCurrentUser().getAccountType());
    }

    @Test
    public void worksWithFacultyUser() {
    	
        User user= UserFactory.createUser(AccountType.FACULTY,"faculty","faculty@yorku.ca","Password123!");
        SessionData.setCurrentUser(user);
        assertEquals(AccountType.FACULTY, SessionData.getCurrentUser().getAccountType());
    }

    @Test
    public void worksWithPartnerUser() {
    	
    	User user = UserFactory.createUser(AccountType.PARTNER,"partner","partner@gmail.com","Password123!!");
    	
        SessionData.setCurrentUser(user);
        assertEquals(AccountType.PARTNER,SessionData.getCurrentUser().getAccountType());
    }

    @Test
    public void storedUserKeepsOriginalEmail() {
        User user= newStudent("email");
        SessionData.setCurrentUser(user);
        assertEquals(user.getEmail(), SessionData.getCurrentUser().getEmail());
    }
    
    @Test
    public void setGetCurrentUser() {
        User user= new StudentUser("user", "user@yorku.ca", "Password123!!");
        SessionData.setCurrentUser(user);
        assertEquals(user,SessionData.getCurrentUser());
    }

    @Test
    public void testClear() {
    	 User user= new StudentUser("user", "user@yorku.ca", "Password123!!");
        SessionData.setCurrentUser(user);
        SessionData.clear();
        assertNull(SessionData.getCurrentUser());
    }
}


