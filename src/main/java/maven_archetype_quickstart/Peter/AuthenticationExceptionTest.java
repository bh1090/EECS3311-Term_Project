package maven_archetype_quickstart.Peter;

import org.junit.jupiter.api.Test;
import Service.AuthenticationException;
import static org.junit.jupiter.api.Assertions.*;

public class AuthenticationExceptionTest {

	
    @Test
    public void storesMessage() {
        AuthenticationException ex= new AuthenticationException("error");
        assertEquals("error",ex.getMessage());
    }

    @Test
    public void allowsNull() {
        AuthenticationException ex= new AuthenticationException(null);
        assertNull(ex.getMessage());
    }

    @Test
    public void containsClassName() {
        AuthenticationException ex= new AuthenticationException("message");
        assertTrue(ex.toString().contains("AuthenticationException"));
    }

    @Test
    public void containsMessage() {
        AuthenticationException ex= new AuthenticationException("messsage");
        assertTrue(ex.toString().contains("messsage"));
    }


    @Test
    public void canBeThrown() {
        assertThrows(AuthenticationException.class,()->{throw new AuthenticationException("expection");});
    }

    @Test
    public void differentInstances() {
        AuthenticationException ex1= new AuthenticationException("ex1");
        AuthenticationException ex2= new AuthenticationException("ex2");
        
        assertNotSame(ex1,ex2);
        assertNotEquals(ex1,ex2);
        
    }

    @Test
    public void nullDefault() {
        AuthenticationException  ex= new AuthenticationException("msg");
        assertNull(ex.getCause());
    }

    @Test
    public void sameMessage() {
        AuthenticationException ex= new AuthenticationException("msg");
        assertSame(ex.getMessage(),ex.getMessage());
    }

    @Test
    public void subclassException() {
        AuthenticationException ex= new AuthenticationException("msg");
        assertTrue(ex instanceof  Exception);
    }
}

