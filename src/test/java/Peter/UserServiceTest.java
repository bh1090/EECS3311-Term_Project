package Peter;


import Model.User.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Repository.*;
import Service.UserService;

import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private UserService userService;

    @BeforeEach
    public void setUp() {
        userService= new UserService();
    }

    //helper for emails
    private String uniqueEmail(String prefix, String domain) {
        return prefix+"_"+UUID.randomUUID().toString()+ "@"+domain;
    }

    @Test
    public void createStudentUser() {
        String email= uniqueEmail("student","yorku.ca");
        User user= userService.createUser(AccountType.STUDENT,"user", email,"Password123!");
        assertNotNull(user);
        assertEquals("user",user.getName());
        assertEquals(email,user.getEmail());
        assertEquals(AccountType.STUDENT, user.getAccountType());
    }

    @Test
    public void createFacultyUser() {
        String email= uniqueEmail("faculty","yorku.ca");
        User user= userService.createUser(AccountType.FACULTY,"user", email, "Password123!");
        assertEquals(AccountType.FACULTY,user.getAccountType());
    }

    @Test
    public void createStaffUser() {
        String email =uniqueEmail("staff","yorku.ca");
        User user= userService.createUser(AccountType.STAFF, "user",email,"Password123!");
        assertEquals(AccountType.STAFF,user.getAccountType());
    }

    @Test
    public void createPartnerUser() {
        String email= uniqueEmail("partner","gmail.com");
        User user= userService.createUser(AccountType.PARTNER,"user",email,"Password123!");
        assertEquals(AccountType.PARTNER,user.getAccountType());
    }

    @Test
    public void createdUserRepository() {
        String email= uniqueEmail("user","yorku.ca");
        userService.createUser(AccountType.STUDENT, "user", email, "Password123!");

        UserRepository repo= UserRepository.getInstance();
        User found= repo.findByEmail(email);
        assertNotNull(found);
        assertEquals("user",found.getName());
    }

    @Test
    public void usersHaveDifferentIds() {
        String email1= uniqueEmail("email1", "yorku.ca");
        String email2= uniqueEmail("email2", "yorku.ca");

        User user1 = userService.createUser(AccountType.STUDENT,"user",email1,"Password123!");
        User user2 = userService.createUser(AccountType.STUDENT,"user",email2,"Password123!");
        assertNotEquals(user1.getId(),user2.getId());
    }

    
    @Test
    public void neverReturnsNull() {
        String email= uniqueEmail("user","yorku.ca");
        User user= userService.createUser(AccountType.STAFF, "user", email, "Password123!");
        assertNotNull(user);
    }

    
    @Test
    public void  usersPreserveEmail() {
        String email= uniqueEmail("user", "gmail.com");
        User user= userService.createUser(AccountType.PARTNER,"user",email,"Password123!");
        assertEquals(email, user.getEmail());
    }

    
    @Test
    public void  usersHaveCorrectAccountType() {
        String email = uniqueEmail("checkType", "yorku.ca");
        User user= userService.createUser(AccountType.FACULTY,"user",email,"Password123!");
        assertEquals(AccountType.FACULTY,user.getAccountType());
    }

    
    @Test
    public void createManyUsers() {
        for (int i = 0;i<5; i++) {
            String email= uniqueEmail("user" + i, "yorku.ca");
            User user= userService.createUser(AccountType.STUDENT,"user",email,"Password123!");
            assertNotNull(user.getId());
        }
        
    }
    
}

