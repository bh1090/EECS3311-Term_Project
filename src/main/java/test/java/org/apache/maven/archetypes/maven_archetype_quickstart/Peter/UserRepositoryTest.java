package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Peter;

import Model.User.*;
import org.junit.jupiter.api.Test;
import Repository.*;

import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    private final UserRepository repo = UserRepository.getInstance();

    private String uniqueEmail(String prefix, String domain) {
        return prefix+"_"+UUID.randomUUID() +"@"+domain;
    }


    @Test
    public void findStudent() {
        String email= uniqueEmail("student", "yorku.ca");
        User user= UserFactory.createUser(AccountType.STUDENT, "user", email, "Password123!");
        repo.save(user);
        assertEquals(AccountType.STUDENT,repo.findByEmail(email).getAccountType());
    }

    
    @Test
    public void findFaculty() {
        String email= uniqueEmail("faculty", "yorku.ca");
        User user= UserFactory.createUser(AccountType.FACULTY,"user", email, "Password123!");
        repo.save(user);
        assertEquals(AccountType.FACULTY,repo.findByEmail(email).getAccountType());
    }

    
    @Test
    public void findStaff() {
        String email= uniqueEmail("staff", "yorku.ca");
        User user= UserFactory.createUser(AccountType.STAFF,"user",email, "Password123!");
        repo.save(user);
        assertEquals(AccountType.STAFF, repo.findByEmail(email).getAccountType());
    }

    @Test
    public void findPartner() {
    	
        String email= uniqueEmail("partner","gmail.com");
        User user= UserFactory.createUser(AccountType.PARTNER, "user",email, "Password123!");
        repo.save(user);
        assertEquals(AccountType.PARTNER,repo.findByEmail(email).getAccountType());
    }

  

    @Test
    public void findUnknown() {
        assertNull(repo.findByEmail(uniqueEmail("unknown", "yorku.ca")));
    }

    
    @Test
    public void findNull() {
        assertNull(repo.findByEmail(null));
    }

   
    //singleton
    @Test
    public void getInstance() {
        assertSame(UserRepository.getInstance(), UserRepository.getInstance());
    }

    

    @Test
    public void multipleUsersSavedAreIndependent() {
        String email1= uniqueEmail("user1","yorku.ca");
        String email2= uniqueEmail("user2","gmail.com");

        User user1= UserFactory.createUser(AccountType.STUDENT,"user1", email1, "Password123!");
        User  user2= UserFactory.createUser(AccountType.PARTNER,"user2", email2, "Password123!1");
        repo.save(user1);
        repo.save(user2);

        assertEquals("user1",repo.findByEmail(email1).getName());
        assertEquals("user2",repo.findByEmail(email2).getName());
        
    }

    @Test
    public void saveSameUser() {
        String email= uniqueEmail("same","yorku.ca");
        User user= UserFactory.createUser(AccountType.STUDENT, "user", email, "Password123!");
        
        repo.save(user);
        repo.save(user);
        
        assertNotNull(repo.findByEmail(email));
    }

    
    @Test
    public void userKeepId() {
        String email= uniqueEmail("id","yorku.ca");
        User user= UserFactory.createUser(AccountType.STUDENT,"user", email,"Password123!");
        String id= user.getId();
        
        repo.save(user);
        assertEquals(id,repo.findByEmail(email).getId());
    }

    @Test
    public void accountTypes() {
        String studentEmail = uniqueEmail("student", "yorku.ca");
        String  partnerEmail= uniqueEmail("partner", "gmail.com");

        User student= UserFactory.createUser(AccountType.STUDENT, "user",studentEmail,"Password123!");
        User partner= UserFactory.createUser(AccountType.PARTNER,"user", partnerEmail,"Password123!");

        repo.save(student);
        repo.save(partner);
        assertEquals(AccountType.STUDENT,repo.findByEmail(studentEmail).getAccountType());
        assertEquals(AccountType.PARTNER,repo.findByEmail(partnerEmail).getAccountType());
    }

    

    @Test
    public void mapCSVNull() {
        assertThrows(IllegalArgumentException.class,()->repo.mapCsvTypeToAccountType(null));
    }

    
    @Test
    public void mapCSVType() {
        assertEquals(AccountType.STAFF,repo.mapCsvTypeToAccountType("maintenance"));
        assertEquals(AccountType.STAFF,repo.mapCsvTypeToAccountType("chief"));
        assertEquals(AccountType.STAFF,repo.mapCsvTypeToAccountType("admin"));
    }

    @Test
    public void mapCSVUnknown() {
        assertThrows(IllegalArgumentException.class,()->repo.mapCsvTypeToAccountType("random"));
    }
}
