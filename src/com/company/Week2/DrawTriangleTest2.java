package com.company;

import java.util.Scanner;

public class DrawTriangleTest2 {
    public static void main(String[] args) {
        System.out.println("write a numba: ");
        Scanner x = new Scanner(System.in);
        int numba = x.nextInt();
        for (int i = 0; i <numba; i++) {
            for (int j = i; j <numba ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

            }

        }

    }

