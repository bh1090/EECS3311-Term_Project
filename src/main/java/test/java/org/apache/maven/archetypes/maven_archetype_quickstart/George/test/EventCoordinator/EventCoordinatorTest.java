package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.George.test.EventCoordinator;

import Model.User.EventCoordinator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EventCoordinatorTest {

     private EventCoordinator chiefEventCoordinator;

     @BeforeEach
     public void setUp(){
          chiefEventCoordinator = EventCoordinator.getInstance();
     }
     @Test
     public void getChiefEventCoordinatorNameNullTest(){
          String chiefEventCoordinatorName = this.chiefEventCoordinator.getChiefEventCoordinatorName();

          Assertions.assertNotNull(chiefEventCoordinatorName, "The chief event coordinator's name is null.  ");
     }
     @Test
     public void getChiefEventCoordinatorEmailNullTest(){
          String chiefEventCoordinatorEmail = this.chiefEventCoordinator.getChiefEventCoordinatorEmail();

          Assertions.assertNotNull(chiefEventCoordinatorEmail, "The chief event coordinator's email is null.  ");
     }
     @Test
     public void getChiefEventCoordinatorPasswordNullTest(){
          String chiefEventCoordinatorPassword = this.chiefEventCoordinator.getChiefEventCoordinatorPassword();

          Assertions.assertNotNull(chiefEventCoordinatorPassword, "The chief event coordinator's password is null.  ");
     }
     @Test
     public void modelEventCoordinatorConstructorTest(){
          Assertions.assertEquals("John Smith", this.chiefEventCoordinator.getChiefEventCoordinatorName(), "Names don't match.  ");
          Assertions.assertEquals("jsmith@yorku.ca", this.chiefEventCoordinator.getChiefEventCoordinatorEmail(), "Emails don't match.  ");
          Assertions.assertEquals("!Password123", this.chiefEventCoordinator.getChiefEventCoordinatorPassword(), "Passwords don't match.  ");
     }
     @Test
     public void getChiefEventCoordinatorNameTest(){
          String expectedName = this.chiefEventCoordinator.getChiefEventCoordinatorName();
          String actualName = "John Smith";

          Assertions.assertEquals(actualName, expectedName, "Names do not match.\n");
     }
     @Test
     public void getChiefEventCoordinatorEmailTest(){
          String expectedEmail = this.chiefEventCoordinator.getChiefEventCoordinatorEmail();
          String actualEmail = "jsmith@yorku.ca";

          Assertions.assertEquals(actualEmail, expectedEmail, "Emails do not match.\n");
     }
     @Test
     public void getChiefEventCoordinatorPasswordTest(){
          String expectedPassword = this.chiefEventCoordinator.getChiefEventCoordinatorPassword();
          String actualPassword = "!Password123";

          Assertions.assertEquals(actualPassword, expectedPassword, "Passwords do not match.\n");
     }
     @Test
     public void singletonEventCoordinatorNotNullTest() {
          EventCoordinator instance = EventCoordinator.getInstance();
          Assertions.assertNotNull(instance, "Singleton instance of event coordinator is null.  ");
     }
     @Test
     public void singletonEventCoordinatorSameInstanceTest() {
          EventCoordinator instance1 = EventCoordinator.getInstance();
          EventCoordinator instance2 = EventCoordinator.getInstance();
          Assertions.assertSame(instance1, instance2, "Singleton instances of event coordinator are not the same.  ");
     }
     @Test
     public void singletonEventCoordinatorCorrectDefaultValuesTest() {
          EventCoordinator instance = EventCoordinator.getInstance();
          Assertions.assertEquals("John Smith", instance.getChiefEventCoordinatorName());
          Assertions.assertEquals("jsmith@yorku.ca", instance.getChiefEventCoordinatorEmail());
          Assertions.assertEquals("!Password123", instance.getChiefEventCoordinatorPassword());
     }
}
