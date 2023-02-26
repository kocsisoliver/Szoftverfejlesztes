package org.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void mathematics(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        int subtraction = num1 - num2;
        System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + subtraction);

        int multiplication = num1 * num2;
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + multiplication);

        int division = num1 / num2;
        System.out.println("The division of " + num1 + " and " + num2 + " is " + division);


    }
}
