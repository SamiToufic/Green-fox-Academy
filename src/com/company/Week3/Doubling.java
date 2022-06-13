package com.company;


// - Create an integer variable named `baseNumber` and assign the value `123` to it
// - Create a function called `doubleNumber()` that doubles its integer input parameter
//   and returns the doubled value
// - Print the result of `doubleNumber(baseNumber)`



public class Doubling {
    public static void main(String[] args) {
       int basedNumber = 123;
       DoubleNumber(basedNumber);
       System.out.println(DoubleNumber(basedNumber));
    }
    public static int DoubleNumber(int baseNumber) {
        baseNumber = baseNumber * 2;
        return baseNumber;
    }
}
