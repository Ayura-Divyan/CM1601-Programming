import java.util.Arrays;

public class LectureSix {
    public static void modify(String[] target) {
        target[0] = "100"; //This would take the parameter target which is an array from the main method and turn the first value to 100
    }

    public static void main(String[] args) {
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        LectureSix.modify(numbers);
        System.out.println(numbers[0]);

        Car x = new Car();
        x.drive(120);
    }
}
