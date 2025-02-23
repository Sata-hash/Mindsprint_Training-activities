package com.mindsprint.project1.conditional;

import java.util.Scanner;

    public class ArrayPractice {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array : ");
            int n = sc.nextInt();

            int [] arr = new int [n];
            System.out.println("Enter " + n + " numbers : ");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            // Sorting the Array

            for(int i = 0; i < arr.length - 1 ; i++){
                for (int j = 0; j < arr.length - i -1; j++) {
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            for(int num : arr){
                System.out.println(num + " ");
            }
            System.out.println();

            // Reverse the array

            for(int i =0; i < arr.length/2; i++){
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }

            for(int num : arr){
                System.out.println(num + " ");
            }
            System.out.println();
    }
}
