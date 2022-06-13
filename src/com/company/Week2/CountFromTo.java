package com.company;

import java.util.Scanner;

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
public class CountFromTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number_one ");
        int num = sc.nextInt();
        System.out.print("number_two ");
        int num2 = sc.nextInt();
        if (num2 < num){
            System.out.println("The second number should be bigger");
        }
        if (num2 > num)
            for (int i = num; i < num2; i++) {

            System.out.println(i);
        }

    }
}
