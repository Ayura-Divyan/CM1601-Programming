import java.util.Scanner;

public class Tutorial04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Question 01
        int num;
        System.out.println("Please enter a number");
        num = input.nextInt();

        if (num > 0) {
            int i = 1;
            while (i <= num) {
                System.out.print(i + " ");
                i++;
            }
        }
        input.close();
    }
    class QuestionFour {
        public void questionFour() {
            Scanner input = new Scanner(System.in);

            //Input number
            int num;
            System.out.println("Please enter a number");
            num = input.nextInt();

            int num_length = numberLength(num);
            
        }
        public static Integer numberLength(int number) {
            Integer length;

            if (number == 0) {
                number = Math.abs(number);
                length = (int) (Math.log10(number) + 1);
            } else {
                length = (int)  (Math.log10(number) + 1);
            }
            return length;
        }
    }
}
