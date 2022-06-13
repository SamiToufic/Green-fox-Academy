package com.company;
//  Create the usual class wrapper and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input

public class Factorial {
    public static void main(String[] args) {
        int input = 5;
        int f = 1;
        CalculateFactorial(input, f);
    }

    public static void CalculateFactorial(int input, int f) {
        for (int i = 1; i <=5 ; i++) {
             f = f * i;
        }
            System.out.println(f);

        }

    }
