package com.tns.manickavalli.assignment.employees;

/**
 * The Manager class extends Employee and adds a department attribute.
 * Demonstrates how subclasses can inherit and extend functionality from the superclass.
 */
public class Manager extends Employee {
    private String department;

    // Constructor to initialize Manager attributes, including superclass attributes
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);  // Call to superclass constructor
        this.department = department;
    }

    // Getter and Setter methods for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
