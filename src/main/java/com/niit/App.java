package com.niit;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber = scanner.nextInt();
        System.out.println("Select option number to perform task");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        System.out.println("5 for Modulo");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Addition of numbers is = " + calculator.add(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println("Subtraction of numbers is = " + calculator.subtract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println("Multiplication of numbers is = " + calculator.multiply(firstNumber, secondNumber));
                break;
            case 4:
                System.out.println("Division of numbers is = " + calculator.division(firstNumber, secondNumber));
                break;
            case 5:
                System.out.println("Remainder is = " + calculator.modulo(firstNumber, secondNumber));
                break;
        }
    }
}
