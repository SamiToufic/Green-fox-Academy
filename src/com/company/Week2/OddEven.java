package com.company;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number: " + num);
        }
        else {
            System.out.println("Odd number: " + num);
        }

    }
}
