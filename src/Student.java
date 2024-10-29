import java.util.ArrayList;
import java.util.Random;

public class Student extends Person {
    private final String studentId; // Final student ID to make it immutable
    private String email;
    private ArrayList<String> courses = new ArrayList<>();

    // Constructor
    public Student(String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, ""); // Pass empty string for password if not needed
        this.studentId = createStudentID(); 
        this.email = email;
    }

    private String createStudentID() {
        Random rand = new Random();
        // Generate a random ID and format it to a string
        int randomStudentId = rand.nextInt(100000000); 
        return String.format("S%08d", randomStudentId); 
    }

    // Getters
    public String getStudentId() { 
        return studentId; 
    }

    public String getEmail() {
        return email; 
    }

    public void setEmail(String email) { 
        this.email = email; 
    }

    public ArrayList<String> getCourses() {
        return courses; 
    }

    public void enrollCourse(String course) {
        courses.add(course);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Email: " + email);
        System.out.println("Courses Enrolled: " + courses);
    }
}
