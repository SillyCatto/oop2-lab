import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private final UserServices userService;
    private boolean isRunning;
    private final Scanner scanner;


    public App(String adminFilePath, String userFilePath) {
        this.userService = UserServices.createInstance(adminFilePath, userFilePath);
        this.isRunning = true;
        this.scanner = new Scanner(System.in);
    }
    public void start() {
        userService.login();
        runMenuLoop();
    }

    private void runMenuLoop() {
        while (isRunning) {
            clearScreen();
            displayMenu();
            int choice = getUserChoice();
            executeChoice(choice);
        }
    }

    public void displayMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Read User Data");
        System.out.println("2. Write User Data");
        System.out.println("3. Modify User Data");
        System.out.println("4. Modify System Settings (Admin)");
        System.out.println("5. Update User Privileges (Admin)");
        System.out.println("6. Exit");
        System.out.println();
        System.out.println(">");
    }

    private int getUserChoice() {
        int choice = -1;
        try {
            choice = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
        }
        return choice;
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void executeChoice(int choice) {
        switch (choice) {
            case 1 -> userService.readUser();
            case 2 -> userService.writeUser();
            case 3 -> userService.updateUser();
            case 4 -> userService.modifySettings();
            case 5 -> userService.updatePrivileges();
            case 6 -> exit();
            default -> System.out.println("Invalid choice.");
        }
    }

    private void pause() {
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }

    private void exit() {
        System.out.println("Exiting...");
        isRunning = false;
    }
}
