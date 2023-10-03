package Task3;

import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private String password;
    private boolean isAdmin;

    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    // геттеры и сеттеры для полей класса

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}

class UserRepository {
    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    // метод для добавления пользователей в репозиторий

    public void addUser(User user) {
        users.add(user);
    }

    // метод для разлогинивания всех пользователей, кроме администраторов

    public void logoutAllUsersExceptAdmins() {
        for (User user : users) {
            if (!user.isAdmin()) {
                System.out.println("Logging out user: " + user.getUsername());
                // выполнить действия по разлогиниванию пользователя
            }
        }
    }
}

