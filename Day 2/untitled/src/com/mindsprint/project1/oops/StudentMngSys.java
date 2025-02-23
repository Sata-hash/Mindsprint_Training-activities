package com.mindsprint.project1.oops;

import java.util.Scanner;

public class StudentMngSys {
    String name;
    int[] grades;

    public StudentMngSys(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
    public double calculateAverage(int grades[]){
        int sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        return sum/grades.length;
    }
    public void displayInfo(){
        System.out.println("Details : ");
        System.out.println("Name : " + name );
        System.out.println("Grades : " + calculateAverage(this.grades));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentMngSys s1 = new StudentMngSys("Paras", new int[]{95, 95, 93, 92, 90});
        s1.displayInfo();

//        Static.print();
//        System.out.println(Static.num);
    }
}
