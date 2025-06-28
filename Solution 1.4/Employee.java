package com.guvi.task;

// Create a subclass Employee that inherits from Person
// Add attributes like employeeId, salary.
public class Employee extends Person {
    String EmployeeID;
    double salary;

    // Use super keyword to initialize Person attributes in Employee constructor
    public Employee(String name, String ID, double salary, int age) {
        super.name = name;
        EmployeeID = ID;
        this.salary = salary;
        super.age = age;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Jack", "A01567", 25.000, 27);
        System.out.println("name: " + e.name);
        System.out.println("Id: " + e.EmployeeID);
        System.out.println("age: " + e.age);
        System.out.println("salary: " + e.salary);
    }
}
