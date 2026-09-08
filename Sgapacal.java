import java.util.Scanner;
class Student {
    String name;
    int subjects;
    double totalGradePoints;
    double cgpa;

    Student(String name, int subjects) {
        this.name = name;
        this.subjects = subjects;
        totalGradePoints = 0;
    }

    void addGradePoint(double gradePoint) {
        totalGradePoints = totalGradePoints + gradePoint;
    }

    void calculateCGPA() {
        cgpa = totalGradePoints / subjects;
    }

    void display() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class CGPACalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        Student st = new Student(name, subjects);

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double gradePoint = sc.nextDouble();

            st.addGradePoint(gradePoint);
        }

        st.calculateCGPA();
        st.display();

        sc.close();
    }
} }
