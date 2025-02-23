package com.mindsprint.project1.oops;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }

    // POJO : Plain Old Java Project
    // which contains only data members, setter, getter, constructor and toString()

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John Doe", 3456663);

        System.out.println(e1);

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("Alex");
        e2.setSalary(3565352);

        System.out.println("Id : " + e2.getId() + " Name : " + e2.getName() + " Salary : " + e2.getSalary());
    }
}
