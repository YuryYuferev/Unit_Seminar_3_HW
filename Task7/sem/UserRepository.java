package Task7.sem;

import java.util.ArrayList;
import java.util.List;

class UserRepository {
    private List<String> authenticatedUsers;

    public UserRepository() {
        authenticatedUsers = new ArrayList<>();
    }

    public void addUser(String username, String password) {
        if (authenticateUser(username, password)) {
            authenticatedUsers.add(username);
            System.out.println("User " + username + " has been added to the system.");
        } else {
            System.out.println("Authentication failed. User " + username + " cannot be added to the system.");
        }
    }

    private boolean authenticateUser(String username, String password) {
        // Perform authentication logic here
        // For simplicity, let's assume authentication is successful if username and password are not empty
        return !username.isEmpty() && !password.isEmpty();
    }

    public List<String> getAuthenticatedUsers() {
        return authenticatedUsers;
    }
}