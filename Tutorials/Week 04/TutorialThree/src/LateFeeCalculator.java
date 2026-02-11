import java.util.Scanner;

public class LateFeeCalculator {
    void main() {
        Scanner input = new Scanner(System.in);
        int daysLate;
        System.out.println("Enter the number of days late:");
        daysLate = input.nextInt();
        double totalFee = 0.0;

        if (daysLate > 0) {
            totalFee += (daysLate * 20);
        }

        System.out.println("Days late: " + daysLate);
        System.out.println("Total fee: " + totalFee);

        input.close();
    }
}


