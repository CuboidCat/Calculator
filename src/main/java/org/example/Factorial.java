package org.example;

public class Factorial
{
    public static long factorialRun(long number)
    {
        // Initialize the result
        long result = 1;

        // Factorial is not defined with negative numbers, throw exception
        if (number < 0)
        {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        // Integer overflow will be caused for numbers over 25, throw exception
        if (number > 25)
        {
            throw new ArithmeticException("Numbers greater than 25 will cause integer overflow");
        }

        // Factorial of 0 is 1; this also applies to 1
        if (number == 1 || number == 0)
        {
            return result;
        }

        // Multiply and decrement -- use for loop
        for (long i = number; i > 1; i--)
        {
            result *= i;
        }

        // Return the result
        return result;
    }

    public static long recursiveFactorialRun(long number)
    {
        // Added a recursive version... because why not?

        // Base case
        if (number == 1)
        {
            return 1;
        }

        // Factorial is not defined with negative numbers, throw exception
        if (number < 0)
        {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        // Integer overflow will be caused for numbers over 25, throw exception
        if (number > 25)
        {
            throw new ArithmeticException("Numbers greater than 25 will cause integer overflow");
        }

        return number * recursiveFactorialRun(number - 1);
    }

}