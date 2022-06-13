package com.company;
import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        System.out.println("the number of chicken the farmer has:");

        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        System.out.println("the number of pigs owned by the farmer:");
        Scanner scanner2 = new Scanner(System.in);
        int userInput2 = scanner.nextInt();
        System.out.println((userInput1+userInput2)*2);
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}
