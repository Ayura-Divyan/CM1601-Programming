import java.util.Scanner;

public class ScholarshipChecker {
    void main() {
        Scanner input = new Scanner(System.in);
        int overallMark;
        int familyIncome;

        System.out.println("Enter your overall marks:");
        overallMark = input.nextInt();

        System.out.println("Enter your montlhy family income:");
        familyIncome = input.nextInt();

        if (overallMark >= 75) {
            if(familyIncome >= 100000) {
                System.out.println("Full Scholarship");
            } else {
                System.out.println("Half Scholarship");
            }
        } else if ( overallMark >= 60) {
            System.out.println("Consider for partial support");
        } else {
            System.out.println("Not eligible");
        }
    }
}
