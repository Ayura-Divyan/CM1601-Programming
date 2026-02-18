import java.util.ArrayList;
import java.util.Scanner;

public class Tutorial04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Question 01
        int num;
        System.out.println("Please enter a number");
        num = input.nextInt();

        if (num > 0) {
            int i = 1;
            while (i <= num) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
        }
        Tutorial04 tutorial04 = new Tutorial04();
        tutorial04.questionSix();
        input.close();
    }
    public void questionSix() {
        // Ideally use generics: ArrayList<String> x = new ArrayList<>();
        ArrayList<String> x = new ArrayList<>();
        int n = 10;

        // Added i++ to the outer loop
        for (int i = 1; i < n; i++) {
            String line = "";
            // Added j++ to the inner loop
            for (int j = 1; j <= n; j++) {
                line += String.valueOf(i * j) + " ";
            }
            x.add(line);
        }
        for (int counter = 0; counter < x.size(); counter++) {
            System.out.println(x.get(counter));
        }
    }
}
