package com.company;




// Write a program that draws a pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
public class DrawPyramideTest {


    public static void main(String[] args) {
        int lineCount = 4;

        // write your code here for Gradescope testing
        for (int i = 0; i <= 4; i++) {

            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < (i * 2) - 1; k++){
                System.out.print("*");
        }
        System.out.println();
    }
        }
        }









