public class Faculty extends Person {
    private static int idCounter = 1; // Static counter for unique faculty IDs
    private final String facultyId; // Final faculty ID to make it immutable
    private String department;
    private String position;

    // Constructor that includes password
    public Faculty(String name, String address, String phoneNumber, String password, String department, String position) {
        super(name, address, phoneNumber, password); // Pass the password to Person
        this.facultyId = "F" + idCounter++; // Prefix 'F' for faculty IDs and increment counter
        this.department = department;
        this.position = position;
    }

    // Getters and Setters
    public String getFacultyId() { 
        return facultyId; 
    }

    public String getDepartment() { 
        return department; 
    }

    public String getPosition() { 
        return position; 
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Methods specific to faculty
    public void assignCourse(String course) {
        System.out.println("Assigned " + course + " to " + getName());
    }

    @Override
    public void showInfo() {
        super.showInfo(); // Call Person's showInfo
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
    }
}
