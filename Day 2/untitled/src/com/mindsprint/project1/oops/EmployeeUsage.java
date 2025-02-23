package com.mindsprint.project1.oops;

public class EmployeeUsage {
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