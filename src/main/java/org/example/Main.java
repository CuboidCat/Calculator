package org.example;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to calc!");
        System.out.println("Enter your number for which option you want:");
        System.out.println("1: Addition" +
                "\n2: Subtraction" +
                "\n3: Multiply" +
                "\n4: Divide" +
                "\n5: Exponent" +
                "\n6: Factorial" +
                "\n7: End");
        int seleciton = 0;
        while (seleciton != 7) {
            try {
                seleciton = scan.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Please select a number.");
                scan.nextLine();
                seleciton = 0;
                continue;
            }
            Calculating calc = new Calculating();
            switch (seleciton) {
                case 1:
                    calc.add(scan);
                    break;
                case 2:
                    calc.subtract(scan);
                    break;
                case 3:
                    calc.multiply(scan);
                    break;
                case 4:
                    calc.divide(scan);
                    break;
                case 5:
                    calc.exponent(scan);
                    break;
                case 6:
                    System.out.println("Select your number:");
                    long num = scan.nextLong();
                    int rand = (int) Math.floor(Math.random() * (2-1) + 1);
                    if (rand == 1) {
                        System.out.println("Your answer is: " + Factorial.factorialRun(num));
                    }
                    else {
                        System.out.println("Your answer is: " + Factorial.recursiveFactorialRun(num));
                    }
                    System.out.println("Select next option.");
                case 7:
                    break;
                default:
                    System.out.println("Please enter a valid number.");
            }
        }

    }

}