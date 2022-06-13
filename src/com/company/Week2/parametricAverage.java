package com.company;
// Write a program that asks for a number
// It would ask this many times to enter an integer
// If all the integers are entered it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class parametricAverage {
    public static void main(String[] args) {
        for (int number = 1; number <=5 ; number++) {
            System.out.println("put the number: ");
            Scanner sc = new Scanner(System.in);
            int userInput1 = sc.nextInt();
        if (number==5) {
            System.out.println("Sum: "+ userInput1*5 + " "+ "Average: " + (userInput1*5)/2);
        }

        }}}


