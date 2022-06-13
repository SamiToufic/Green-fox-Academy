package com.company;



// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
public class test {
  public static void main(String[] args) {
    int lineCount = 6;
    for (int i = 0; i <= 5; i++) {
      for (int k = 0; k <= 5; k++) {
        if (i ==0 || k==0 || i==5 ||k==5)
          System.out.print("%");

        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }}}
