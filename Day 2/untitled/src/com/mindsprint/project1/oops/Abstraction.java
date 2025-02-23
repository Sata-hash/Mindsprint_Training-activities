package com.mindsprint.project1.oops;

import java.awt.image.SampleModel;

abstract class Test{
    public abstract void display();
}
public class Abstraction extends Test{
    @Override
    public  void display() {
        System.out.println("Implemented Parent Method");
    }
    
    public static void main(String[] args) {
        Test test = new Abstraction();
        test.display();
    }
}
