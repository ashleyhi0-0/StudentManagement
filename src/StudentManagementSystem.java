import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Faculty> facultyMembers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public boolean login() {
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        for(Student student: students){
            if(student.getEmail().equals(email)||student.getPassword().equals(password)){
                System.out.println("Welcome, " + student.getName());
                return true;
            }
        }
        for(Faculty faculty: facultyMembers){
            if(faculty.getEmail().equals(email)||faculty.getPassword().equals(password)){
                System.out.println("Welcome, " + faculty.getName());
                return true;
            }
        }
        return false;
    }

    public void registerStudent() {
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        String password;
        while (true) {
            System.out.print("Enter Password: ");
            password = scanner.nextLine();
            System.out.print("Re-enter Password: ");
            String confirmedPassword = scanner.nextLine();
            if (password.equals(confirmedPassword)) {
                System.out.println("Password Confirmed!");
                break;
            } else {
                System.out.println("Password does not match! Please try again.");
            }
        }

        Student newStudent = new Student(name, address, phoneNumber, email, password);
        students.add(newStudent);

        saveStudentToFile(newStudent);
        System.out.println("Student registered successfully!");

        StudentView sv = new StudentView(newStudent);
        sv.studentView();
    }

    private void saveStudentToFile(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt", true))) {
            writer.write("Student ID: " + student.getStudentId() + "\n");
            writer.write("Name: " + student.getName() + "\n");
            writer.write("Address: " + student.getAddress() + "\n");
            writer.write("Phone: " + student.getPhoneNumber() + "\n");
            writer.write("Email: " + student.getEmail() + "\n");
            writer.write("Courses Enrolled: " + student.getCourses() + "\n\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving student data.");
            e.printStackTrace();
        }
    }

    public void registerFaculty() {
        System.out.print("Enter Faculty Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
    
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        String password;
        while (true) {
            System.out.print("Enter Password: ");
            password = scanner.nextLine();
            System.out.print("Re-enter Password: ");
            String confirmedPassword = scanner.nextLine();
            if (password.equals(confirmedPassword)) {
                System.out.println("Password Confirmed!");
                break;
            } else {
                System.out.println("Password does not match! Please try again.");
            }
        }
    
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
    
        System.out.print("Enter Position: ");
        String position = scanner.nextLine();
    
        Faculty newFaculty = new Faculty(name, address, phone, email, password, department, position);
        facultyMembers.add(newFaculty);

        saveFacultyToFile(newFaculty);
        System.out.println("Faculty registered successfully!");
    }
    
    private void saveFacultyToFile(Faculty faculty) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("faculty.txt", true))) {
            writer.write("Faculty ID: " + faculty.getFacultyId() + "\n");
            writer.write("Name: " + faculty.getName() + "\n");
            writer.write("Address: " + faculty.getAddress() + "\n");
            writer.write("Phone: " + faculty.getPhoneNumber() + "\n");
            writer.write("Email: " + faculty.getEmail() + "\n");
            writer.write("Department: " + faculty.getDepartment() + "\n");
            writer.write("Position: " + faculty.getPosition() + "\n\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving faculty data.");
            e.printStackTrace();
        }
    }

    public void close() {
        scanner.close(); 
    }
}
