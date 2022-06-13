package com.company;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        System.out.println("enter your Name:");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();
        System.out.println("Hello," +  userInput1);
    }
}
