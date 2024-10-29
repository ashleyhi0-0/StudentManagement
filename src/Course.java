public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private Faculty instructor;

    // Constructor
    public Course(String courseCode, String courseName, int credits, Faculty instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
    }

    public void showCourseInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
        System.out.println("Instructor: " + (instructor != null ? instructor.getName() : "TBA"));
    }
}

