package maven_archetype_quickstart.Peter;


import Model.User.*;
import org.junit.jupiter.api.Test;

import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class UserFactoryAndUserTest {

    //make a unique email
    private String uniqueEmail(String prefix, String domain) {
        return prefix+ "_"+UUID.randomUUID().toString() + "@"+domain;
    }



    @Test
    public void createStudent() {
        String email= "student@yorku.ca";
        User user= UserFactory.createUser(AccountType.STUDENT,"student",email,"Password123!");

        assertEquals("student",user.getName());
        assertEquals(email,user.getEmail());
        assertEquals(AccountType.STUDENT, user.getAccountType());
        assertTrue(user instanceof StudentUser);
    }

    
    @Test
    public void createFaculty() {
        User user =UserFactory.createUser(AccountType.FACULTY,"faculty","faculty@yorku.ca","Password123!");
        assertEquals(AccountType.FACULTY, user.getAccountType());
        assertTrue(user instanceof  FacultyUser);
    }

    
    @Test
    public void createStaff() {
        User user = UserFactory.createUser( AccountType.STAFF,"staff","staff@yorku.ca","Password123!");
        assertEquals(AccountType.STAFF,user.getAccountType());
        assertTrue(user instanceof StaffUser);
    }

    
    @Test
    public void createPartner() {
        User user= UserFactory.createUser(AccountType.PARTNER, "partner","partner@gmail.com","Password123!");
        assertEquals(AccountType.PARTNER,user.getAccountType());
        assertTrue( user instanceof PartnerUser);
    }

    @Test
    public void differentIds() {
        User user1= UserFactory.createUser(AccountType.STUDENT,"user1",uniqueEmail("user1","yorku.ca"),"Password123!");
        User user2= UserFactory.createUser(AccountType.STUDENT,"user2 ",uniqueEmail("user2","yorku.ca"), "Password123!");

        assertNotNull(user1.getId());
        assertNotNull(user2.getId());
        assertNotEquals(user1.getId(),user2.getId());
    }

    
    @Test
    public void checkPassword() {
        User user=UserFactory.createUser(AccountType.PARTNER,"user","user@gmail.com","Password123!");

        assertTrue(user.checkPassword("Password123!"));
        assertFalse(user.checkPassword("Password!"));
        assertFalse(user.checkPassword(null));
        
    }

    
    @Test
    public void setRole() {
        User user= UserFactory.createUser(AccountType.STAFF,"user","user@yorku.ca", "Password123!");
        user.setRole("STAFF");
        assertEquals("STAFF", user.getRole());
    }
    

    @Test
    public void nullAccountType() {
        assertThrows(IllegalArgumentException.class,()->UserFactory.createUser(null, "no accounttype", "email@yorku.ca", "Password123!"));
    }

 

    @Test
    public void userSetter() {
        User user= UserFactory.createUser(AccountType.STUDENT,"user","user@yorku.ca","Password123!");

        //new values
        user.setName("new");
        user.setEmail("new@yorku.ca");
        user.setPassword("Password12!");
        user.setAccountType(AccountType.FACULTY);
        user.setRole("faculty");
        user.setVerified(true);
        //check
        assertEquals("new",user.getName());
        assertEquals("new@yorku.ca",user.getEmail());
        assertEquals("Password12!",user.getPassword());
        assertTrue(user.checkPassword("Password12!"));
        assertEquals(AccountType.FACULTY,user.getAccountType());
        assertEquals(AccountType.FACULTY.getHourlyRate(),user.getHourlyRate(),0.001);
        assertEquals("faculty",user.getRole());
        assertTrue(user.isVerified());
    }

    
    @Test
    public void createStudentCSV() {
        User user= UserFactory.createUserFromCsv("id","user","user@yorku.ca","Password123!",AccountType.STUDENT, true, "STUDENT");

        assertTrue(user instanceof  StudentUser);
        assertEquals(AccountType.STUDENT,user.getAccountType());
        assertEquals("id",user.getId());
    }

    @Test
    public void createFacultyCSV() {
        User user= UserFactory.createUserFromCsv("id", "user", "user@yorku.ca","Password123!", AccountType.FACULTY,false, "FACULTY");

        assertTrue(user instanceof  FacultyUser);
        assertEquals(AccountType.FACULTY,user.getAccountType());
        assertEquals("id", user.getId());
    }

    @Test
    public void createStaffCSV() {
        User user= UserFactory.createUserFromCsv("id", "user", "user@yorku.ca","Password123!",AccountType.STAFF,true, "STAFF");

        assertTrue(user instanceof  StaffUser);
        assertEquals(AccountType.STAFF,user.getAccountType());
        assertEquals("id",user.getId());
    }

    @Test
    public void createPartnerCSV() {
        User user= UserFactory.createUserFromCsv("id","user","user@yorku.ca","Password123!", AccountType.PARTNER,false, "PARTNER");
        assertTrue(user instanceof  PartnerUser);
        assertEquals(AccountType.PARTNER,user.getAccountType());
        assertEquals("id",user.getId());
    }

    @Test
    public void nullCSV() {
        assertThrows(IllegalArgumentException.class,()->UserFactory.createUserFromCsv("id","user","user@yorku.ca","Password123!",null,true,"empty") );
    }

}

