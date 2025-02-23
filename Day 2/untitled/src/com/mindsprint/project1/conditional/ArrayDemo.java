package com.mindsprint.project1.conditional;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int arr2[] = {1, 2, 3, 4, 5};

        String[] names = {"satavisa", "tina", "dutta"};

        System.out.println("Access Direct : " + names[0]);

        // Using For Loop
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // Using For Each
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Store values in array using loop");

        System.out.println("Enter " + arr1.length + " number : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }

}