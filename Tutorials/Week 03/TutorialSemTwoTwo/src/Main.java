import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Question a
        //There is an assumption that it is currently a common year
        Scanner input = new  Scanner(System.in);
        int leap_year_constant = 2;

        System.out.println("Enter the date:");
        int date = input.nextInt();

        System.out.println("Enter the month:");
        int month = input.nextInt();

        int days = (((275 * month)/9) - (leap_year_constant * ((month + 9)/12)) + date - 31);

        System.out.println("You have to wait " + days + " days this year from 1st January for your birthday!");
        input.close();
    }
}