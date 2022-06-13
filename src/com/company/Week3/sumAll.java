package com.company;
// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements of `numbers`

import java.util.Arrays;

public class sumAll {
    public static void main(String[] args) {
        int number[] = {3, 4, 5, 6, 7};
        int sum = Arrays.stream(number).sum();
        System.out.println(sum);

        }
    }

