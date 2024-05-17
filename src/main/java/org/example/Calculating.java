package org.example;

import java.util.Scanner;

public class Calculating {
    public void add(Scanner scan) {
        System.out.println("Addition:");
        System.out.println("Select first number:");
        double num1 = scan.nextDouble();
        System.out.println("Select second number:");
        double num2 = scan.nextDouble();
        System.out.println("Your answer is: " + (num1+num2));
        System.out.println("\nSelect next option.");
    }
    public void subtract(Scanner scan) {
        System.out.println("Subtraction:");
        System.out.println("Select first number:");
        double num1 = scan.nextDouble();
        System.out.println("Select second number:");
        double num2 = scan.nextDouble();
        System.out.println("Your answer is: " + (num1-num2));
        System.out.println("\nSelect next option.");
    }
    public void multiply(Scanner scan) {
        System.out.println("Multiplication:");
        System.out.println("Select first number:");
        double num1 = scan.nextDouble();
        System.out.println("Select second number:");
        double num2 = scan.nextDouble();
        System.out.println("Your answer is: " + (num1*num2));
        System.out.println("\nSelect next option.");
    }
    public void divide(Scanner scan) {
        System.out.println("Division:");
        System.out.println("Select first number:");
        double num1 = scan.nextDouble();
        System.out.println("Select second number:");
        double num2 = scan.nextDouble();
        System.out.println("Your answer is: " + (num1/num2));
        System.out.println("\nSelect next option.");
    }
    public void exponent(Scanner scan) {
        System.out.println("Division:");
        System.out.println("Select first number:");
        double num1 = scan.nextDouble();
        System.out.println("Select second number:");
        double num2 = scan.nextDouble();
        System.out.println("Your answer is: " + (Math.pow(num1, num2)));
        System.out.println("\nSelect next option.");
    }

}
