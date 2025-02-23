package com.mindsprint.project1.conditional;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int percent = sc.nextInt();

        if(percent >= 70 && percent < 100){
            System.out.println("Congratulations..!! You got Distinction");
        }
        else if(percent >= 60 && percent < 70){
            System.out.println("Congratulations..!! You got First Division");
        }
        else if(percent >= 50 && percent < 60){
            System.out.println("Congratulations..!! You got Second Division");
        }
        else if(percent >= 40 && percent < 50){
            System.out.println("Congratulations..!! You got Third Division");
        }
        else if(percent >= 35 && percent < 40){
            System.out.println("Congratulations..!! You got Pass ");
        }
        else if(percent >= 0 && percent < 35){
            System.out.println("Sorry You are fail");
        }
        else{
            System.out.println("Kindly enter Correct Percentage");
        }
    }
}
