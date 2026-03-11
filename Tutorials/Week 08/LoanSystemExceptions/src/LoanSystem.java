import java.util.InputMismatchException;
import java.util.Scanner;

public class LoanSystem extends Exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Test customer input (will crash on bad data)
        double salary = 0;
        int years = 0;
        int age = 0;
        try {
            System.out.print("Enter salary: ");
            salary = sc.nextDouble();
            System.out.print("Enter years experience: ");
            years = sc.nextInt();
            System.out.print("Enter age: ");
            age = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input needs to be an integer");
        }
        // crashes on non-int
        // Loan logic (will crash before reaching here)
        String decision = calculateLoanEligibility(salary, years, age);
        if (!decision.equals("error")) {
            System.out.println("Error: Please enter positive numbers");
        } else {
            System.out.println("Decision: " + decision);
            sc.close();
        }
    }
    public static String calculateLoanEligibility(double salary, int years, int age) {
        try {
            if (salary < 0 || years < 0 || age < 18) {
                // Logic error - should throw custom exception (Q2)
                throw new IllegalArgumentException("Invalid data!");
            }
            if (salary >= 100000 && years >= 5) {
                if (age > 55) {
                    return "Eligible for Premium Loan - Risk Check";
                }
                return "Eligible for Premium Loan";
            } else if (salary >= 50000) {
                return "Eligible for Standard/Small Loan";
            }
            return "Not Eligible";
        } catch (IllegalArgumentException e) {
            return "e";
        }
    }
}