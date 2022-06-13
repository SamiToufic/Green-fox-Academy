package com.company;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Integer1:    " + "Integer2:    " + "Integer3:    " + "Integer4:    " + "Integer5:    ");
        int Integer1 = scanner.nextInt();
        int Integer2 = scanner.nextInt();
        int Integer3 = scanner.nextInt();
        int Integer4 = scanner.nextInt();
        int Integer5 = scanner.nextInt();
        System.out.println("Sum:  "+ Integer1 + Integer2 + Integer3 + Integer4 + Integer5 +  "   Average: " + (Integer1 + Integer2 + Integer3 + Integer4 + Integer5)/2);

    }
}
