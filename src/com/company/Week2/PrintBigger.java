package com.company;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        int num = sc.nextInt();
        System.out.print("Enter a number1: ");
        int num2 = sc.nextInt();
        if (num >num2) {
            System.out.println(num);
        }
        else {
                System.out.println(num2);
            }
            }


    }

