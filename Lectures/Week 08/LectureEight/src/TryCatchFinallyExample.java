import java.util.Scanner;
public class TryCatchFinallyExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Open the Scanner resource
        try {
            System.out.println("Enter the first number:");
            int num1 = input.nextInt();
            System.out.println("Enter the second number:");
            int num2 = input.nextInt();
            int result = num1 / num2; // Potential ArithmeticException if num2 is 0
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {            // This block executes if a division by zero occurs
            System.out.println("Cannot divide by zero. Please try again.");
        }
        finally {
            // This block always executes, useful for cleanup
            input.close(); // Close the resource
            System.out.println("Scanner closed. End of the program.");
        }
    }
}