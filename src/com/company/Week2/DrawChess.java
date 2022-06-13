package com.company;
// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
public class DrawChess {
  public static void main(String[] args) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {

        if (i % 2 == 0) {
          if (j % 2 == 0)
            System.out.print(" %");
          else
            System.out.print(" ");
        }
        else {
          if (j % 2 == 0)
            System.out.print(" ");
          else
            System.out.print(" %");
        }}

        System.out.println();
      }
    }}




