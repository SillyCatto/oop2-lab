import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private UserServices userService;
    private Scanner scanner;
    private boolean isRunning;
    private IUserReader userReader;
    private IUserReader adminUserReader;
    private String filePath;
    private ArrayList<User> users;
    private ArrayList<User> adminUsers;

    public App(String adminFilePath, String userFilePath) {
        this.userService = new UserServices();
        this.scanner = new Scanner(System.in);
        this.isRunning = true;
        this.filePath = filePath;
        this.userReader = ReaderFactory.createReader(filePath);
        this.adminUserReader = ReaderFactory.createReader(filePath);
    }
    public void start() {
        users = userReader.readUser(filePath);
        adminUsers = adminUserReader.readUser(filePath);
    }
}
