public class Lecture05 {
    static void main(String[] args) {
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
    }
}
