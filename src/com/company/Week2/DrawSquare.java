package com.company;
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//

public class DrawSquare
{
    public static void main(String[] args) {
        int lineCount = 6;
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= 5; k++) {
                if (i == 0 || k == 0 || i == 6 - 1 || k == 6 - 1) {
                    System.out.print("%");}

                else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }}}

