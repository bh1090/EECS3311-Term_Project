package test.java.org.apache.maven.archetypes.maven_archetype_quickstart.Peter;

import Model.User.AccountType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTypeTest {

    @Test
    public void studentHourlyRate() {
        assertEquals(20.0,AccountType.STUDENT.getHourlyRate(), 0.001);
    }

    @Test
    public void facultyHourlyRate() {
        assertEquals(30.0,AccountType.FACULTY.getHourlyRate(), 0.001);
    }

    @Test
    public void staffHourlyRate() {
        assertEquals(40.0,AccountType.STAFF.getHourlyRate(), 0.001);
    }

    @Test
    public void partnerHourlyRate() {
        assertEquals(50.0,AccountType.PARTNER.getHourlyRate(), 0.001);
    }

    @Test
    public void valuesLengthIsFour() {
        assertEquals(4,AccountType.values().length);
    }

    @Test
    public void valueOfStudent() {
        assertEquals(AccountType.STUDENT,AccountType.valueOf("STUDENT"));
    }

    @Test
    public void valueOfPartner() {
        assertEquals(AccountType.PARTNER,AccountType.valueOf("PARTNER"));
    }

    @Test
    public void allAccountTypesHavePositiveHourlyRate() {
    	
        for (AccountType type:AccountType.values()) {
            assertTrue(type.getHourlyRate()> 0.0);
        }
        
    }
    
    
    @Test
    public void testEnumStringConversion() {
    	
        for (AccountType type:AccountType.values()) {
            assertEquals(type,AccountType.valueOf(type.name()));
        }
        
    }

    @Test
    public void sumOfHourlyRatesIsCorrect() {
        double sum= 0;
        
        for(AccountType t:AccountType.values()) {
            sum+= t.getHourlyRate();
        }
        
        assertEquals(20.0+30.0+40.0+50.0,sum,0.001);
    }
}
