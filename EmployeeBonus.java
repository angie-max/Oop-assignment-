// Admission Number: CT101/G/19983/23
// Name: MUMO ANGELA
// This program is for calculating the  the bonus for employees based on their salary and years of service.

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of years in service: ");
        int numberOfYears = scanner.nextInt(); 

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        double bonusPercentage;
        if (numberOfYears < 0) {
            System.out.println("Invalid number of years");
            bonusPercentage = 0; 
        } else if (numberOfYears > 10) {
            bonusPercentage = 0.12;
        } else if (numberOfYears >= 6) {
            bonusPercentage = 0.1;
        } else {
            bonusPercentage = 0.08;
        }

        double bonusAmount = salary * bonusPercentage;

        System.out.println("Net bonus amount: " + bonusAmount);

        scanner.close();
    }
}
