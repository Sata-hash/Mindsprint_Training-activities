package com.mindsprint.project1.oops;

public class Student {
    int id;
    String name;
    String email;
    String address;

    public Student() { // Default Constructor
    }

    public Student(String name, String email, String address) {
//        this((int)(Math.round(Math.random()*10000)),name,email,address);

        this.id = (int)(Math.round(Math.random()*10000));
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Student(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("Alex", "alex@gmail.com", "US");

        Student s3 = new Student(10001, "Rahul", "rahul@gmail.com", "Canada");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
