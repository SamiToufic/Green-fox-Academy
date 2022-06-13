package com.company;

public class fizzBuzz {
    // Write a program that prints the numbers from 1 to 100
// but for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

    public static void main(String[] args) {

        // write your code here for Gradescope testing
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}


