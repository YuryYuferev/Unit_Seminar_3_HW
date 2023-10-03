package Task6.sem;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public static void main(String[] args) {
        User user = new User("admin", "password");

        System.out.println(user.authenticate("admin", "password")); // true
        System.out.println(user.authenticate("admin", "wrongpassword")); // false
        System.out.println(user.authenticate("wrongusername", "password")); // false
    }
}

