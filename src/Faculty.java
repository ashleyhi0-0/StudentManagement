public class Faculty extends Person {
    private static int idCounter = 1; 
    private final String facultyId; 
    private String department;
    private String position;

    public Faculty(String name, String address, String phoneNumber, String email, String password, String department, String position) {
        super(name, address, phoneNumber, email, password); 
        this.facultyId = "F" + idCounter++; 
        this.department = department;
        this.position = position;
    }

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

    public void assignCourse(String course) {
        System.out.println("Assigned " + course + " to " + getName());
    }

    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
    }
}
