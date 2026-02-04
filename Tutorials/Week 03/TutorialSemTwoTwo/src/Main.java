import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        //Question a
        //There is an assumption that it is currently a common year
        /*
        int leap_year_constant = 2;

        System.out.println("Enter the date:");
        int date = input.nextInt();

        System.out.println("Enter the month:");
        int month = input.nextInt();

        int days = (((275 * month)/9) - (leap_year_constant * ((month + 9)/12)) + date - 31);

        System.out.println("You have to wait " + days + " days this year from 1st January for your birthday!");
        input.close();*/

        //Quesiton b
        /*
        System.out.println("Enter your number:");
        int number = input.nextInt();
        number++;
        number++;
        number++;
        number--;
        System.out.println("Your number is: " + number);*/

        //Question c
        /*
        System.out.println("Enter the average number of steps");
        double average = input.nextInt();
        System.out.println("Enter time spent in hours");
        double hours = input.nextInt();
        System.out.println("Enter time spent in minutes");
        double minutes = input.nextInt();
        double distance = ((average * 2.5) * ((hours * 60) + minutes));
        double distance_miles = distance / 5280;
        System.out.println("The distance in miles is " + distance_miles);*/

        //Question d
        /*
        System.out.println("Please enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = input.nextLine();
        System.out.println(lastName + " " + firstName);*/

        //Question 4
        int a = 2;
        int b = 5;
            //a
            //int c = (a > b) ? a: b;
            //b
            int c = a-- + --b * 10;
        System.out.println(c);
    }
}