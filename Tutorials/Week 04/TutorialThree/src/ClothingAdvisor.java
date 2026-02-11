import  java.util.Scanner;

public class ClothingAdvisor {
    void main() {
        Scanner input = new Scanner(System.in);

        int temperature;
        System.out.println("Enter the temperature in Celcius: ");
        temperature = input.nextInt();

        if (temperature >= 30) {
            System.out.println("It is hot. Wear light clothes.");
        } else if (temperature >= 20 && temperature <= 29) {
            System.out.println("Weather is warm. T-shirt is fine.");
        } else if (temperature >= 10 && temperature <= 19) {
            System.out.println("It is cool. Wear a jacket.");
        } else {
            System.out.println("It is cold. Wear a coat.");
        }

        input.close();
    }
}
