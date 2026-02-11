import java.util.Scanner;

public class TicketCalculator {
    void main() {
        Scanner input = new Scanner(System.in);
        int ticketType;
        System.out.println("Enter the type of ticket: ");
        ticketType = input.nextInt();

        switch (ticketType) {
            case 1:
                System.out.println("Child ticket price: 500 LKR");
                break;
            case 2:
                System.out.println("Student ticket price: 800 LKR");
                break;
            case 3:
                System.out.println("Adult ticket price: 1000 LKR");
                break;
            case 4:
                System.out.println("Senior ticket price: 600 LKR");
                break;
            default:
                System.out.println("Invalid ticket type");
                break;
        }
    }
}
