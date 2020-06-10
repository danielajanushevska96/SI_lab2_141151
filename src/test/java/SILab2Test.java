import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SILab2Test {
    User validUser;
    User invalidUser;
    User userWithoutUsername;
    User userWithoutEmail;
    User existingUser;
    User userWithShortEmail;
    SILab2 lab = new SILab2();

    List<String> userNames;

    @Before
    public void setUp() throws Exception {
        validUser = new User("Name", "Surname", "name@surname.com");
        invalidUser = new User("Name", "Surname", "3ewdasasdsad");
        userWithoutUsername = new User(null, "Surname", "3ewdas@asdsad");
        userWithoutEmail = new User("Anyone", "Surname", null);
        existingUser = new User("smth", "Surname", "Valid@username.com");
        userWithShortEmail = new User("NonExistingONe", "Surname", "");

        userNames = new ArrayList<String>();
        userNames.add("smth");
        userNames.add("anothersmth");
    }

    @Test
    public void itShouldPassWithValidUserObject() {
        boolean result = lab.function(validUser, userNames);
        assertTrue(result);
    }

    @Test
    public void itShouldReturnFalseForBadEmail() {
        assertFalse(lab.function(invalidUser, userNames));
    }

    @Test(expected =  RuntimeException.class)
    public void itShouldThrowExceptionIfUserIsNull() {
        lab.function(null, userNames);
    }

    @Test(expected =  RuntimeException.class)
    public void itShouldThrowExceptionIfUsernameIsNull() {
        lab.function(userWithoutUsername, userNames);
    }

    @Test
    public void itShouldReturnFalseIfEmailIsNull() {
        assertFalse(lab.function(userWithoutEmail, userNames));
    }

    @Test(expected =  RuntimeException.class)
    public void itShouldThrowExceptionIfUsernameAlreadyExists() {
        assertFalse(lab.function(existingUser, userNames));
    }

    @Test
    public void itShouldReturnFalseIfEmailIsVeryShort() {
        assertFalse(lab.function(userWithShortEmail, userNames));
    }
}