package com.company;
//  Create the usual class wrapper and main method on your own

// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendA()` that gets a string as an input,
//   appends an 'a' character to its end and returns the modified string
//
// - Print the result of `appendA(typo)`

public class Append {
    public static void main(String[] args) {
        String typo = "Chinchill";
        appendA(typo);
        System.out.println(appendA(typo));
    }

    public static String appendA(String typo) {
        String letter = "a";
        typo= typo + letter;
        return typo;


    }

}
