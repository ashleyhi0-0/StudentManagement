import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Faculty> facultyMembers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in); // Single scanner instance

    // Register a new student and save details to students.txt
    public void registerStudent() {
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        String confirmedPassword;
        while (true) {
            System.out.print("Re-enter Password: ");
            confirmedPassword = scanner.nextLine();
            if (password.equals(confirmedPassword)) {
                System.out.println("Password Confirmed!");
                break;
            } else {
                System.out.println("Password does not match! Please try again.");
            }
        }
        Student newStudent = new Student(name, address, phone, email);
        students.add(newStudent);

        saveStudentToFile(newStudent);
    }

    private void saveStudentToFile(Student student) {
        // Save student information to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt", true))) {
            writer.write("Student ID: " + student.getStudentId() + "\n");
            writer.write("Name: " + student.getName() + "\n");
            writer.write("Address: " + student.getAddress() + "\n");
            writer.write("Phone: " + student.getPhoneNumber() + "\n");
            writer.write("Email: " + student.getEmail() + "\n");
            writer.write("Courses Enrolled: " + student.getCourses() + "\n\n");
            System.out.println("Student registered successfully and saved to file!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving student data.");
            e.printStackTrace();
        }
    }

    // Register a new faculty and save details to faculty.txt
    public void registerFaculty() {
        System.out.print("Enter Faculty Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
    
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();
    
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
    
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
    
        System.out.print("Enter Position: ");
        String position = scanner.nextLine();
    
        // Pass the password to the Faculty constructor
        Faculty newFaculty = new Faculty(name, address, phone, password, department, position);
        facultyMembers.add(newFaculty);
    
        saveFacultyToFile(newFaculty);
    }
    

    private void saveFacultyToFile(Faculty faculty) {
        // Save faculty information to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("faculty.txt", true))) {
            writer.write("Faculty ID: " + faculty.getFacultyId() + "\n");
            writer.write("Name: " + faculty.getName() + "\n");
            writer.write("Address: " + faculty.getAddress() + "\n");
            writer.write("Phone: " + faculty.getPhoneNumber() + "\n");
            writer.write("Department: " + faculty.getDepartment() + "\n");
            writer.write("Position: " + faculty.getPosition() + "\n\n");
            System.out.println("Faculty registered successfully and saved to file!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving faculty data.");
            e.printStackTrace();
        }
    }

    public void close() {
        scanner.close(); // Close the scanner at the end
    }
}
