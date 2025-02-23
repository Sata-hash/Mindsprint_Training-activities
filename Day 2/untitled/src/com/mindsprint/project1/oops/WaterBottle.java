package com.mindsprint.project1.oops;

public class WaterBottle {
    int capacity;
    String color;
    String brand;

    public void setData(int c, String color, String brand) {
        this.capacity = c;
        this.color = color;
        this.brand = brand;
    }
    public void display(){
        System.out.println("---------------------------------");
        System.out.println("Brand : " + brand);
        System.out.println("Colour : " + color);
        System.out.println("Capacity : " + capacity + " ltr");
    }
    public static void main(String[] args) {
        WaterBottle bottle1 = new WaterBottle();
        bottle1.setData(45, "Red", "TupperWare");
        bottle1.display();
    }
}
