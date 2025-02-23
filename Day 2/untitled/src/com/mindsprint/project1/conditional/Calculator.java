package com.mindsprint.project1.conditional;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter 2 numbers : ");
            double numA = sc.nextDouble();
            double numB = sc.nextDouble();

            System.out.println("Enter + for Addition \n - for Subtraction \n * for Multiplication \n / for Division");

            char operation = sc.next().charAt(0);
            switch (operation) {
                case '+':
                    System.out.println("Addition: " + (numA + numB));
                    break;
                case '-':
                    System.out.println("Subtraction: " + (numA - numB));
                    break;
                case '*':
                    System.out.println("Multiplication: " + (numA * numB));
                    break;
                case '/':
                    System.out.println("Division: " + (numA / numB));
                default:
                    System.out.println("Kindly enter correct operation");
                }

                System.out.println("Enter Y/y to Continue or any key to exit");
                String op = sc.next();

                if(op.equals("Y") || op.equals("y")) {
                    continue;
                }
                else {
                    break;
                }
            }
        }

}
