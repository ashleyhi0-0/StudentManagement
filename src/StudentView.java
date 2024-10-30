import java.util.Scanner;

public class StudentView {

    private Student student;

    public StudentView(Student student){
        this.student = student;
    }
    public StudentView(){

    }
    public void studentView(){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("\n------Home Page------");
            System.out.println("1.View Profile");
            System.out.println("2.Grades & Subjects");
            System.out.println("3.Schedule");
            System.out.println("4.Log out");
            System.out.print("Enter Option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    viewProfile();
                    break;
                case 2:
                    viewGradesAndSubjects();
                    break;
                case 3:
                    viewSchedule();
                 break;
                case 4:
                    System.out.println("Logging out...");
                    System.exit(0);
                break;
                default:
                System.out.println("Invalid choice. Please Try Again");
            }
        }
    }
    public void viewProfile(){
        System.out.println();
        student.showInfo();
    }
    public void viewGradesAndSubjects(){

    }
    public void viewSchedule(){

    }
}
