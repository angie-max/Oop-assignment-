import java.util.Scanner;

// Student Class
class Student {
    private String name;
    private double marks;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Method to display student details
    public void displayDetails(String grade) {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

// GradeCalculator Class
class GradeCalculator {
    // Method to calculate grade
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

// MainApp Class
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        // Create Student object
        Student student = new Student(name, marks);

        // Create GradeCalculator object and calculate grade
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student.getMarks());

        // Display student details with calculated grade
        student.displayDetails(grade);

        // Close scanner
        scanner.close();
    }
}
