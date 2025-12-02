package maven_archetype_quickstart.Peter;

import static org.junit.jupiter.api.Assertions.*;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Application.SessionData;
import Model.User.*;
import Service.*;

public class AuthenticationServiceTest {

	
    private AuthenticationService auth;

    
    @BeforeEach
    public void setUp() {
    	
        auth= new AuthenticationService();
      
        SessionData.clear();
    }

   
    //helpermethod
    private String uniqueEmail(String prefix, String domain) {
        return prefix+ "_"+UUID.randomUUID().toString()+ "@"+domain;
    }

    @Test
    public void testRegister() throws Exception{
        //student with yorku  email
        String email= uniqueEmail("student","yorku.ca");
        User student= auth.register("Student",email,"Password123!",AccountType.STUDENT);

        String email1 = uniqueEmail("student1","my.yorku.ca");
        User student1= auth.register("Student1",email1,"Password123!", AccountType.STUDENT);

        // faculty
        String email2= uniqueEmail("faculty","yorku.ca");
        User faculty= auth.register("Faculty",email2, "Password123!", AccountType.FACULTY);

        // staff
        String email3= uniqueEmail("staff","yorku.ca");
        User staff= auth.register("Staff",email3, "Password123!", AccountType.STAFF);

        //partner 
        String email4= uniqueEmail("partner","gmail.com");
        User partner= auth.register("Partner",email4,"Password123!",AccountType.PARTNER);

        assertEquals(AccountType.STUDENT,student.getAccountType());
        assertEquals(AccountType.STUDENT,student1.getAccountType());
        assertEquals(AccountType.FACULTY,faculty.getAccountType());
        assertEquals(AccountType.STAFF,staff.getAccountType());
        assertEquals(AccountType.PARTNER,partner.getAccountType());
        
    }

    
    @Test
    public void testRegisterPartner()throws Exception {
        //partner  with yorku
        String email= uniqueEmail("partnerYork", "yorku.ca");

        User partner= auth.register("York Partner",email,"Password123!",AccountType.PARTNER);

        assertNotNull(partner);
        assertEquals(AccountType.PARTNER,partner.getAccountType());
    }

   

    @Test
    public void testPassword() {
        String email= uniqueEmail("password", "yorku.ca");
        //no lower
        assertThrows(AuthenticationException.class,()->auth.register("no lower",email,"PASSWORD123!", AccountType.STUDENT));
        //no upper
        assertThrows(AuthenticationException.class,()->auth.register("no upper",email,"password123!", AccountType.STUDENT));
        //no number
        assertThrows(AuthenticationException.class,()->auth.register("no number", email,"Password!", AccountType.STUDENT));
        // missing symbol
        assertThrows(AuthenticationException.class, ()->auth.register("no symbol", email,"Password123", AccountType.STUDENT));
        // too short
        assertThrows(AuthenticationException.class,()->auth.register("short passowrd", email,"Pass1!", AccountType.STUDENT));
    }

    @Test
    public void testEmail() {
        AuthenticationException ex= assertThrows(AuthenticationException.class,()->auth.register("email error", "not-email", "Password123!", AccountType.STUDENT));
        assertTrue(ex.getMessage().toLowerCase().contains("email"));
    }

    @Test
    public void testMissingField() {
        String email= uniqueEmail("email","yorku.ca");

        //no name
        assertThrows(AuthenticationException.class,()->auth.register("",email, "Password123!", AccountType.STUDENT));
        //name null
        assertThrows(AuthenticationException.class,()->auth.register(null,email,"Password123!", AccountType.STUDENT));
        //email null
        assertThrows(AuthenticationException.class,()->auth.register("email null",null, "Password123!",AccountType.STUDENT));
        //email blank
        assertThrows(AuthenticationException.class,()->auth.register("email blank"," ","Password123!",AccountType.STUDENT));
        //password  null
        assertThrows(AuthenticationException.class,()->auth.register("password  null",email, null,AccountType.STUDENT));
        //password blank
        assertThrows(AuthenticationException.class,()->auth.register("password blank",email, " ",AccountType.STUDENT));
        //accounttype null
        assertThrows(AuthenticationException.class,()->auth.register("accounttype null",email,"Password123!", null));
    }

    
    @Test
    public void testNoYork() {
        AuthenticationException ex= assertThrows(AuthenticationException.class,()->auth.register("student no yorku","student@gmail.com","Password123!",AccountType.STUDENT));
        assertTrue(ex.getMessage().toLowerCase().contains("york"));
    }

    @Test
    public void testRegisterPartner2() {
    	//partner bad email
        AuthenticationException ex= assertThrows(AuthenticationException.class,()->auth.register("partner bad email","partner@random.com","Password123!", AccountType.PARTNER));
        assertTrue(ex.getMessage().toLowerCase().contains("email"));
    }

    @Test
    public void testSameEmail() throws Exception {
        String email= uniqueEmail("same", "yorku.ca");

        auth.register("User1", email,"Password123!",AccountType.STUDENT);
        AuthenticationException ex= assertThrows(AuthenticationException.class,()->auth.register("User2", email, "Password123!", AccountType.STUDENT));
        assertTrue(ex.getMessage().toLowerCase().contains("already exists"));
    }

   

    @Test
    public void testYorkEmail() {
        assertTrue(auth.isYorkEmail("user@yorku.ca"));     
        assertTrue(auth.isYorkEmail("user@my.yorku.ca")); 
        assertFalse(auth.isYorkEmail("user@gmail.com"));   
    }

    @Test
    public void testProperEmail() {
        //test emails
        assertTrue(auth.properEmail("user@gmail.com"));
        assertTrue(auth.properEmail("user@outlook.com"));
        assertTrue(auth.properEmail("user@hotmail.com"));
        assertTrue(auth.properEmail("user@yahoo.com"));
        assertTrue(auth.properEmail("user@yahoo.ca"));
        assertTrue(auth.properEmail("user@icloud.com"));
        //bad email
        assertFalse(auth.properEmail("user@random.com"));
        assertFalse(auth.properEmail("user"));
        assertFalse(auth.properEmail("user@"));
    }

    

    @Test
    public void testLogin()throws Exception {
        String email= uniqueEmail("login","yorku.ca");
        User user= auth.register("Login User",email, "Password123!",AccountType.STUDENT);
        User loggedIn= auth.login(email,"Password123!");

        assertNotNull(loggedIn);
        assertEquals(user.getEmail(),loggedIn.getEmail());
        assertEquals(user.getId(),loggedIn.getId());
    }

    @Test
    public void testMissingFieldLogin() {
        //email  null
        assertThrows(AuthenticationException.class,()->auth.login(null, "Password123!"));
        //email blank
        assertThrows(AuthenticationException.class,()->auth.login(" ","Password123!"));
        //password null
        assertThrows(AuthenticationException.class,() ->auth.login("user@yorku.ca",null));
        //password blank
        assertThrows(AuthenticationException.class, ()->auth.login("user@yorku.ca"," "));
        
    }

    @Test
    public void testLoginEmail() {
        AuthenticationException ex = assertThrows(AuthenticationException.class, ()->auth.login("unknownuser@yorku.ca", "Password123!"));
        assertTrue(ex.getMessage().toLowerCase().contains("no user"));
    }

    @Test
    public void testLoginWrongPassword() throws Exception {
        String email= uniqueEmail("user", "yorku.ca");
        auth.register("user",email, "Password123!",AccountType.STUDENT);
        AuthenticationException ex= assertThrows(AuthenticationException.class,()->auth.login(email,"Password"));
        assertTrue(ex.getMessage().toLowerCase().contains("incorrect"));
    }

   
    @Test
    public void testLogout() throws Exception {
        String email= uniqueEmail("user", "yorku.ca");
        auth.register("Logout User", email,"Password123!",AccountType.STUDENT);
        auth.login(email,"Password123!");
        assertNotNull(SessionData.getCurrentUser());

        auth.logout();
        assertNull(SessionData.getCurrentUser());
        
    }
}
