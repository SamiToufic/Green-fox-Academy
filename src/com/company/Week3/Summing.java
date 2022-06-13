package com.company;
// Create the usual class wrapper and main method on your own

// Write a function called `sum()` that returns the sum of numbers from zero to the given parameter

public class Summing {
    public static void main(String[] args) {

        int parameter = 5;
        sum(parameter);
        System.out.println(sum(parameter));


    }

    public static int sum(int parameter) {
        int k = 0;
        for (int i = 0; i <= parameter; i++) {
            k = k + i;
        }

        return k;
    }
}





