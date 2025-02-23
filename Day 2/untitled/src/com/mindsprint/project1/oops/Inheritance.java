package com.mindsprint.project1.oops;

class Parent{
    public Parent() {
        System.out.println("Parent Class Constructor");
    }

    public String name = "Test";
    public void hello(){
        System.out.println("hello from Parent");
    }
}

class Child extends Parent{
    public Child() {
        super();
        System.out.println("Child Class Constructor");
    }

    public void print(){
        System.out.println("Welcome " + name);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
        c.hello();
        System.out.println(c.name);
    }
}
