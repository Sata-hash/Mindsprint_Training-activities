package com.mindsprint.project1.conditional;

public class Loops {
    public static void main(String[] args) {
        System.out.println("For Loop");

        for (int i = 1; i <=10; i++){
            System.out.print(i + " ");
        }

        System.out.println("\nWhile Loop");

        int i = 1;
        while(i <= 10){
            System.out.print(i + " ");
            i++;
        }

        // for and while loop are exit controlled loops

        System.out.println("\nDo While Loop");

        do{
            System.out.println(i + " ");
            i++;
        }
        while(i <= 10);

        // but do while is entry controlled loop
    }
}
