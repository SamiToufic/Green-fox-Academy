package com.company;
// - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
//   elements than `firstArrayOfNumbers`
// - Otherwise print: "firstArrayOfNumbers is the longer one"
public class CompareLenght {
    public static void main(String[] args) {
        int[] firstArrayOfNumber = {1, 2, 3};
        int[] secondArrayOfNumber = {4, 5};
        if (secondArrayOfNumber.length > firstArrayOfNumber.length) {
            System.out.println("secondArrayOfNumber is longer");
        }
         else {
            System.out.println("firstArrayOfNumbers is the longer one");

        }
    }
}


