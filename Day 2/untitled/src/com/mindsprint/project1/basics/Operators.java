package com.mindsprint.project1.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Arithmetic

        System.out.println("Addition : " + (num1 + num2));
        System.out.println("Subtraction : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        System.out.println("Division : " + ((float)num1 / num2));

        // Assignment

        int num3 = 10;
        System.out.println("Number is : " + num3);
        num3 += 2;
        System.out.println("After Increment Number is : " + num3);
        num3 -= 2;
        System.out.println("After Decrement Number is : " + num3);
    }
}
