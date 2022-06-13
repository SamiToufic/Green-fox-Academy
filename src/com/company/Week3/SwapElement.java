package com.company;

import java.util.Arrays;

// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`
public class SwapElement {
    public static void main(String[] args) {


    String[] orders = {"first", "second", "third"};
    orders[0] = "third";
    orders[2] = "first";
    System.out.println(Arrays.toString(orders));
}}
