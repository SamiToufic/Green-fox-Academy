package com.company;

public class DrawDiamond {
    public static void main(String[] args) {
        int lineCount = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (i*2)-1; k++) {

                System.out.print("*");

            }
            System.out.println();}
        for (int m = lineCount; m >=0 ; m--) {
            for (int d= m; d < 4 ; d++) {
                System.out.print(" ");}

            for (int c = 0; c <= (m*2)-1; c++){
                System.out.print("*");}
            System.out.println();}
            }
            
        }


            



