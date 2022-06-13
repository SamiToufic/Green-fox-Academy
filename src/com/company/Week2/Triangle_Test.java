package com.company;
import java.util.Scanner;
public class Triangle_Test {
    public static void main(String[] args) {
        System.out.println("write a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = i; j < number; j++){
            System.out.print("*");
            }
            System.out.println("");

            }

        }}

