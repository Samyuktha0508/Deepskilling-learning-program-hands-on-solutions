public class App {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser("sam@example.com");
        userService.registerUser(null); // This will log an error
    }
}
