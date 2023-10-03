package Task7.sem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UserRepositoryTest {
    private UserRepository userRepository;

    @Before
    public void setUp() {
        userRepository = new UserRepository();
    }

    @Test
    public void testAddUser_SuccessfulAuthentication() {
        userRepository.addUser("user1", "password1");
        List<String> authenticatedUsers = userRepository.getAuthenticatedUsers();

        Assert.assertEquals(1, authenticatedUsers.size());
        Assert.assertTrue(authenticatedUsers.contains("user1"));
    }

    @Test
    public void testAddUser_FailedAuthentication() {
        userRepository.addUser("user2", "");
        userRepository.addUser("", "password2");
        userRepository.addUser("", "");

        List<String> authenticatedUsers = userRepository.getAuthenticatedUsers();

        Assert.assertEquals(0, authenticatedUsers.size());
    }
}