public class User {
    private String name;
    private int age;
    private String[] roles;

    public User(String name, int age, String[] roles) {
        this.name = name;
        this.age = age;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public String[] getRoles() {
        return roles;
    }

    public static User getNullUser() {
        return null;
    }

    public static Object getSharedInstance() {
        Object obj = new Object();
        return obj;
    }
}
