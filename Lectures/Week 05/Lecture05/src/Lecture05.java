public class Lecture05 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        int w = 0;
        while (w < 5) {
            System.out.println(w);
            w++;

            if (w == 3) {
                break;
            }
        }
        Integer result = exerciseSum();
        System.out.println(result);

        Integer result2 = exerciseSum2();
        System.out.println(result2);
    }

    static Integer exerciseSum() {
        int sum = 0;
        int counter = 0;
        while (counter <= 10) {
            sum += counter;
            counter++;
        }
        return sum;
    }
    static Integer exerciseSum2() {
        int sum = 0;
        int counter = 1;
        do {
            sum += (counter*counter);
            counter++;
        }
        while (counter <= 10);
        return sum;
    }

}
