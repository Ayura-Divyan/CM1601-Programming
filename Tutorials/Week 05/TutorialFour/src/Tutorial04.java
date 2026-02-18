import java.util.Scanner;

public class Tutorial04 {
    public static void main(String[] args) {
        //Question 01
        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Enter the number");
        n = input.nextInt();

        if (n > 0) {
            int i = 1;
            while (i <= n) {
                System.out.print(i + " ");
                i++;
            }
        }
        System.out.println();
        Scanner.close()
    }

    public void questionFour() {
        
    }
}
