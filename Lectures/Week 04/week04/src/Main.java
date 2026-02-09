import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of novels: ");
        try {
            int novels = input.nextInt();
            if (novels > 20) {
                System.out.println("Wow!");
            } else if (novels == 0) {
                System.out.println("Buy One Now!!");
            } else {
                System.out.println("Not Bad");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid data type, please enter only numbers");
        }
    }
}