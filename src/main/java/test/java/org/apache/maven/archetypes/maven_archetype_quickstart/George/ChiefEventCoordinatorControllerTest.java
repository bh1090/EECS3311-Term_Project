package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George;

import Controller.ChiefEventCoordinatorController;
import Model.User.StaffUser;
import Model.User.User;
import Repository.UserRepository;
import Service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ChiefEventCoordinatorControllerTest {
     private ChiefEventCoordinatorController chiefEventCoordinatorController;

     @BeforeEach
     public void setUp(){
          UserService userService = new UserService();
          this.chiefEventCoordinatorController = new ChiefEventCoordinatorController(userService);
          this.chiefEventCoordinatorController.createAdmin("Jerry West", "jwest@email.com", "@Password123");
     }
     @Test
     public void objectChiefEventCoordinatorIsNotNullTest(){
          assertNotNull(this.chiefEventCoordinatorController, "The controller object is null.  ");
     }
     @Test
     public void checkAdminNameNotNullTest(){
          User user = UserRepository.getInstance().findByEmail("jwest@email.com"); // Assuming this method call has already been tested.
          StaffUser staffUser = (StaffUser) user;
          String adminName = staffUser.getName();

          Assertions.assertNotNull(adminName, "The admin's name is null.  ");
     }
     @Test
     public void checkAdminEmailNotNullTest(){
          User user = UserRepository.getInstance().findByEmail("jwest@email.com"); // Assuming this method call has already been tested.
          StaffUser staffUser = (StaffUser) user;
          String adminEmail = staffUser.getEmail();

          Assertions.assertNotNull(adminEmail, "The admin's email is null.  ");
     }
     @Test
     public void checkAdminPasswordNotNullTest(){
          User user = UserRepository.getInstance().findByEmail("jwest@email.com"); // Assuming this method call has already been tested.
          StaffUser staffUser = (StaffUser) user;
          String adminPassword = staffUser.getPassword();

          Assertions.assertNotNull(adminPassword, "The admin's password is null.  ");
     }
     @Test
     public void adminExistsInUserRepositoryTest(){
          User user = UserRepository.getInstance().findByEmail("jwest@email.com"); // Assuming this method call has already been tested.

          Assertions.assertNotNull(user, "The admin's wasn't properly stored in the user repository.  ");
     }
     @Test
     public void adminIsCorrectUserType(){
          User user = UserRepository.getInstance().findByEmail("jwest@email.com"); // Assuming this method call has already been tested.
          String actualUserType = "STAFF";
          String expectedUserType = user.getRole();
          Assertions.assertEquals(actualUserType, expectedUserType,"The admin is not staff member.  ");
     }
     @Test
     public void userTypeIsNotNullTest(){
          User user = UserRepository.getInstance().findByEmail("jwest@email.com"); // Assuming this method call has already been tested.
          StaffUser staffUser = (StaffUser) user;
          Assertions.assertNotNull(staffUser,"The admin account type must not be null.  ");
     }
     @Test
     public void chiefEventCoordinatorCreateAdminNameTest(){
          User user = UserRepository.getInstance().findByEmail("jwest@email.com"); // Assuming this method call has already been tested.
          StaffUser staffUser = (StaffUser) user;
          String actualName = "Jerry West";
          String expectedName = staffUser.getName();

          assertEquals(actualName, expectedName, "Names don't match.  ");
     }
     @Test
     public void chiefEventCoordinatorCreateAdminEmailTest(){
          User user = UserRepository.getInstance().findByEmail("jwest@email.com"); // Assuming this method call has already been tested.
          StaffUser staffUser = (StaffUser) user;
          String actualEmail = "jwest@email.com";
          String expectedEmail = staffUser.getEmail();

          assertEquals(actualEmail, expectedEmail, "Emails don't match.  ");
     }
     @Test
     public void chiefEventCoordinatorCreateAdminPasswordTest(){
          User user = UserRepository.getInstance().findByEmail("jwest@email.com"); // Assuming this method call has already been tested.
          StaffUser staffUser = (StaffUser) user;
          String actualPassword = "@Password123";
          String expectedPassword = staffUser.getPassword();

          assertEquals(actualPassword, expectedPassword, "Emails don't match.  ");
     }
}
