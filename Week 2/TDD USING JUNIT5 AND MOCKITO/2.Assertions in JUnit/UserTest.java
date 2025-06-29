import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testUserAssertions() {
        String[] expectedRoles = {"admin", "editor"};
        User user = new User("Alice", 25, expectedRoles);

        System.out.println("Testing user name...");
        assertEquals("Alice", user.getName());
        System.out.println("Name test passed!");

        System.out.println("Checking if user is adult...");
        assertTrue(user.isAdult());
        System.out.println("Adult test passed!");

        System.out.println("Verifying user is not a child...");
        assertFalse(user.isAdult() == false);
        System.out.println("False condition test passed!");

        System.out.println("Checking user roles...");
        assertArrayEquals(expectedRoles, user.getRoles());
        System.out.println("Roles test passed!");

        System.out.println("Validating user is not null...");
        assertNotNull(user);
        System.out.println("NotNull test passed!");

        System.out.println("Validating getNullUser returns null...");
        assertNull(User.getNullUser());
        System.out.println("Null test passed!");

        Object instance = User.getSharedInstance();
        Object sameRef = instance;

        System.out.println("Checking if two references point to the same object...");
        assertSame(instance, sameRef);
        System.out.println("Same reference test passed!");

        Object newObj = new Object();
        System.out.println("Checking if two references are different...");
        assertNotSame(instance, newObj);
        System.out.println("NotSame reference test passed!");

        System.out.println("✅ All assertions completed successfully.");
    }
}

