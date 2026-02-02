/**
 * Author: M. Cassim Farook
 * Program: Calculator
 * Version: 1.25.1.2025
 */

import java.util.Scanner;

public class Calculator {

    //main entry point to the software.
    //in the entire project, at least one main method must exist in a class.
    //there can be main methods with different arguments, no duplicates.
    public static void main(String[] args) {
        String greeting = "Welcome to Cassim's Calculator";
        String instructions = "Please enter your equation.\nExample: 100 + 100";
        String pleaseWait = "Wow that is hard!...Please wait...";
        String yourAreaCow = "I did not understand. Sorry.";
        int frameSize = greeting.length();

        // Print header and instructions
        Calculator.printFrame(frameSize);
        System.out.println(greeting);
        Calculator.printFrame(frameSize);
        System.out.println(instructions);

        // Read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Equation: ");
        String equation = scanner.nextLine();
        String[] tokens = equation.split(" ");

        // Calculate the result
        System.out.println(pleaseWait);
        try {
            //There are no global functions in java to convert data.
            //functions need to be defined part of some class.
            int operand1 = Integer.parseInt(tokens[0]);
            int operand2 = Integer.parseInt(tokens[2]);
            String operator = tokens[1];

            if (operator.equals("+")) {
                System.out.println(equation + " = " + (operand1 + operand2));
            } else if (operator.equals("-")) {
                System.out.println(equation + " = " + (operand1 - operand2));
            } else if (operator.equals("*")) {
                System.out.println(equation + " = " + (operand1 * operand2));
            } else if (operator.equals("/")) {
                System.out.println(equation + " = " + (operand1 / operand2));
            } else {
                System.out.println(yourAreaCow);
            }
        } catch (Exception e) {
            System.out.println(yourAreaCow);
        }

        Calculator.printFrame(frameSize);
        scanner.close();
    }

    //static keyword allows us to use the function without creating an object.
    // Calculator.printFrame  instead of  o = new Calculator(); o.printFrame;
    private static void printFrame(int frameSize) {
        for (int i = 0; i < frameSize; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}