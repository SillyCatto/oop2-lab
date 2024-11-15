import java.util.ArrayList;
import java.util.Scanner;

public class UserServices {
    private User loggedInUser;
    private final IUserReader userReader;
    private final IUserReader adminUserReader;
    private final IUserWriter userWriter;
    private ArrayList<User> users;
    private ArrayList<User> adminUsers;

    private static UserServices instance = null;

    private UserServices(String adminFilePath, String userFilePath) {
        this.userReader = ReaderFactory.createReader(userFilePath);
        this.adminUserReader = ReaderFactory.createReader(adminFilePath);
        this.userWriter = WriterFactory.createWriter(userFilePath);
    }

    public static UserServices createInstance(String adminFilePath, String userFilePath) {
        if (instance == null) {
            instance = new UserServices(userFilePath, adminFilePath);
        }
        return instance;
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        while (loggedInUser == null) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            loggedInUser = authUser(username, password);

            if (loggedInUser != null) {
                System.out.println("Welcome " + loggedInUser.getUsername() + "!");
            } else {
                System.out.println("Invalid credentials");
            }
        }
    }

    private User authUser(String username, String password) {
        var usersData = userReader.readUser();
        var adminData = adminUserReader.readUser();

        for (String[] userData : adminData) {
            String storedUsername = userData[1];
            String storedPassword = userData[3];
            if (storedUsername.equals(username) && storedPassword.equals(password)) {
                System.out.println("Admin privileges granted.");
            }
            return new AdminUser(userData[0], storedUsername, userData[2], storedPassword, User.UserType.ADMIN);
        }

        for (String[] userData: usersData){
            String storedUsername = userData[1];
            String storedPassword = userData[3];
            String userType = userData[4];

            if (storedUsername.equals(username) && storedPassword.equals(password)) {
                return switch (userType.toLowerCase()) {
                    case "admin" -> {
                        System.out.println("Admin privileges granted.");
                        yield new AdminUser(userData[0], storedUsername, userData[2], storedPassword, User.UserType.ADMIN);
                    }
                    case "power" ->
                            new PowerUser(userData[0], storedUsername, userData[2], storedPassword, User.UserType.POWER);
                    case "regular" ->
                            new RegularUser(userData[0], storedUsername, userData[2], storedPassword, User.UserType.REGULAR);
                    default -> {
                        System.out.println("Unknown User Type");
                        yield null;
                    }
                };
            }
        }
        return null;
    }

    public void readUser() {
        if (loggedInUser instanceof User) {
            loggedInUser.readUserData(userReader);
        } else {
            System.out.println("Permission denied");
        }
    }

    public void writeUser() {
        if (loggedInUser instanceof NonRegularUser nonRegularUser) {
            nonRegularUser.writeUserData(userWriter);
        } else {
            System.out.println("Permission denied");
        }
    }

    public void updateUser() {
        if (loggedInUser instanceof AdminUser adminUser) {
            adminUser.updateUser(userWriter);
        } else {
            System.out.println("Permission denied");
        }
    }

    public void modifySettings() {
        if (loggedInUser instanceof AdminUser adminUser) {
            adminUser.modifySettings();
        } else {
            System.out.println("Permission denied");
        }
    }

    public void updatePrivileges() {
        if (loggedInUser instanceof AdminUser adminUser) {
            adminUser.updatePrivileges(userWriter);
        } else {
            System.out.println("Permission denied");
        }
    }

}
