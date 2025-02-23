package com.mindsprint.project1.basics;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter 2 numbers : ");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        System.out.println("num1 > num2 : " + (num1 > num2));
//        System.out.println("num1 < num2 : " + (num1 < num2));
//        System.out.println("num1 >= num2 : " + (num1 >= num2));
//        System.out.println("num1 <= num2 : " + (num1 <= num2));
//        System.out.println("num1 == num2 : " + (num1 == num2));
//        System.out.println("num1 != num2 : " + (num1 != num2));
//
//        // Practice of Unary Operator : ++, --, !
//
//        int a = 0;
//        int y = a++ + ++a;
//        System.out.println(y + " " + a);

        // Bitwise Operators : &, |, = , ^, >>(right shift -- divide by 2), << (left shift -- multiply by 2)

        // Ternary Operator

//        System.out.println("Enter Age : ");
//        int age = sc.nextInt();
//
//        String result = (age >= 18)? "valid for vote" : "Not valid for vote";
//        System.out.println(result);


        // Practice of Ternary operator

        int CostPrice = sc.nextInt();
        int SellPrice = sc.nextInt();

        String check = (CostPrice > SellPrice)? ("Loss of " + (CostPrice - SellPrice)) : ("Profit of "+ (SellPrice -CostPrice));

        System.out.println(check);

    }
}
