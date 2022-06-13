package com.company;
// Write a program that stores a number and the user has to figure it out
// The user can input guesses
// After each guess the program would tell one of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args) {
        for (int number = 1; number <1000 ; number++) {
        System.out.println("put the number: ");
        Scanner sc = new Scanner(System.in);
         int userInput1 = sc.nextInt();

            if ( userInput1<8) {
                System.out.println("The stored number is lower");
            }

            else if (userInput1==8) {
                    System.out.println("You found the number: 8");
                }
            else{
                System.out.println("The stored number is higher");
            }


            }
        }}


