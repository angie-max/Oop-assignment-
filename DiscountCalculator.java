import java.util.Scanner;  

public class DiscountCalculator {
    
    public static double getDiscount(double amount) {
        double discount = 0.0;
        
        if (amount > 5000) {
            discount = amount * 0.10;
        } else if (amount >= 1000 && amount <= 5000) {
            discount = amount * 0.05;
        } else {
            discount = 0.0;
        }
        
        return discount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();  

        
        double discount = getDiscount(amount);
        System.out.println("Discount: " + discount);

        scanner.close();
    }
}
