package com.mindsprint.project1.conditional;

import java.util.Scanner;

public class LoopsPractice {
    public static void main(String[] args) {
        // Multiplication Table
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }

        // Fibonacci Series
        int numA = 0;
        int numB = 1;
        System.out.println("\nFirst 10 Fibonacci Numbers : ");
        System.out.print("\n" + numA + " " + numB + " ");
        for (int i = 2; i <= 10; i++) {
            int numC = numA + numB;
            System.out.print(numC + " ");
            numA = numB;
            numB = numC;
        }

        //Number is odd or even

        System.out.println("\nEnter any Number : ");
        int number = sc.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("\n" + number + " is a " + result + " Number\n");

        // Largest among two numbers

        int A = 4;
        int B = 7;

        if (A >= B) {
            System.out.println(A + " is larger");
        } else {
            System.out.println(B + " is larger");
        }
    }
}

