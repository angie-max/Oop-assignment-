import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
 // The constructor to initialize the attributes
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
// it calculates a bonus of 10% of the salary.
class SalaryCalculator {
    public static double calculateBonus(double salary) {
        return salary * 0.10;
    }
}
// Main method of the program
public class MainApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect employee details from user
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

 // Create Employee instance and calculate bonus
        Employee employee = new Employee(name, salary);
        double bonus = SalaryCalculator.calculateBonus(salary);

 // Display the calculated bonus and employee details
        employee.displayDetails();
        System.out.println("Bonus: " + bonus);

        scanner.close();
    }
}