package com.mindsprint.project1.oops;

public class Calculator {
    public int add(int num1, int num2){
        return (num1 + num2);
    }

    public int substract(int num1, int num2){
        return (num1 - num2);
    }

    public int multiply(int num1, int num2){
        return (num1 * num2);
    }

    public int divide(int num1, int num2){
        return (num1 / num2);
    }

    public int square(int num1){
        return (num1 * num1);
    }

    public int cube(int num1){
        return (num1 * num1 * num1);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition : " + c.add(45,23));
        int result = c.cube(3);
        System.out.println("Cube is : " + result);
    }
}
