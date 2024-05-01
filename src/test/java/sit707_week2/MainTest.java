package sit707_week2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testLoginWithValidCredentials() {
        String username = "deepak12"; //valid user
        String password = "abc1234"; //valid password
        boolean result = SeleniumOperations.bunnings_login(username, password);
        assertTrue("Successful login expected", result);
    }

    @Test
    public void testInvalidUsername() {
        String username = "invalid_deepak";
        String password = "valid_password123";
        boolean result = SeleniumOperations.bunnings_login(username, password);
        assertFalse("Failed login expected", result);
    }

    @Test
    public void testInvalidPassword() {
        String username = "valid_u212";
        String password = "invalid_password1212";
        boolean result = SeleniumOperations.bunnings_login(username, password);
        assertFalse("Failed login expected", result);
    }

    @Test
    public void testEmptyUsername() {
        String username = "";
        String password = "valid_password1cds";
        boolean result = SeleniumOperations.bunnings_login(username, password);
        assertFalse("Failed login expected", result);
    }

    @Test
    public void testEmptyPassword() {
        String username = "valid_usernamewd31";
        String password = "";
        boolean result = SeleniumOperations.bunnings_login(username, password);
        assertFalse("Failed login expected", result);
    }

    @Test
    public void testEmptyUsernameAndPassword() {
        String username = "";
        String password = "";
        boolean result = SeleniumOperations.bunnings_login(username, password);
        assertFalse("Failed login expected", result);
    }
}
