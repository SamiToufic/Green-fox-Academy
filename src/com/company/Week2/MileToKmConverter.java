package com.company;
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        System.out.println("enter your distance in miles:");
        Scanner scanner = new Scanner(System.in);
        Double userInput1 = scanner.nextDouble();
        System.out.println(userInput1 * 1.609344);
    }
}
