import java.util.*;
public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Register Student");
            System.out.println("2. Register Faculty");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    sms.registerStudent();
                    break;
                case 2:
                    sms.registerFaculty();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.out.println("Program Stopped.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
