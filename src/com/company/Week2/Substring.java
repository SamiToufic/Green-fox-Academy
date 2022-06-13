package com.company;
// Create a function that takes two strings as a parameter
// Returns the starting index where
// the second one is starting in the first one
// Returns `-1` if the second string is not in the first one

public class Substring {
    public static void main(String[] args) {
        String string1 = "value1";
        String string2 = "value2";
        function(string1, string2);
    }

    public static void function(String string1, String string2) {
        int index1 = 17;
        int index2 = -1;
        char a = string1.charAt(0);
        char b = string2.charAt(0);
        if (a == b){
        System.out.println(index1);
        }
        else {
            System.out.println(index2);
        }

    }
}
