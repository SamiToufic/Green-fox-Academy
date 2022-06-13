package com.company;
import java.util.Scanner;

// Write a program that draws a pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("put the number: ");
        int userInput1 = sc.nextInt();
        for (int i = 1; i <= userInput1; i++) {
            for (int b = userInput1 - 1; b >= i; b--) {

                System.out.print(" ");
            }

            for (int c = 1; c < (i * 2)-1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
                    
                }



        }

