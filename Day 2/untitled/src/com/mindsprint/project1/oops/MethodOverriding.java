package com.mindsprint.project1.oops;

class ParentPhone{
    public void call(){
        System.out.println("Parent phone is calling");
    }
}

class ChildParent extends ParentPhone{
    public void call(){
        super.call(); // call parent method as well
        System.out.println("Child phone is calling");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        ChildParent alex = new ChildParent();
        alex.call();
    }
}


