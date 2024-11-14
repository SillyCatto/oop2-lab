import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private UserServices userService;
    private Scanner scanner;
    private boolean isRunning;
    private IUserReader userReader;
    private String filePath;
    private ArrayList<User> users;

    public App(String filePath) {
        this.userService = new UserServices();
        this.scanner = new Scanner(System.in);
        this.isRunning = true;
        this.filePath = filePath;
        this.userReader = ReaderFactory.createReader(filePath);
    }
    public void start() {
        users = userReader.readUser(filePath);
    }
}
