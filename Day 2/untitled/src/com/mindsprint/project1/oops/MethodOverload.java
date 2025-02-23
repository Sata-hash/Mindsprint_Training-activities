package com.mindsprint.project1.oops;

public class MethodOverload {
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public double add(double num1, double num2){
        return num1 + num2;
    }
    public float add(float f1, float f2){
        return f1 + f2;
    }

    public static void main(String[] args) {
        MethodOverload m = new MethodOverload();
        System.out.println(m.add(3.4f,4.5f));
        System.out.println(m.add(2,3,4));
    }
}
