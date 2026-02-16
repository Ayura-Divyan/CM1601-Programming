import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        String[] students_id = {"w1234567", "w1234568", "w1234569"};

        String output = sout(students_id);
        System.out.println(output);
    }
    static String sout(String[] num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num.length; i += 1) {
            result.append(num[i]).append(" "); // Add the ID to a growing string
        }
        return result.toString(); // Return the finished string AFTER the loop
    }
}
