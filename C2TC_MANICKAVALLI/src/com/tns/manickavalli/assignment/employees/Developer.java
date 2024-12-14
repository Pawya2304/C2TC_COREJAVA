package com.tns.manickavalli.assignment.employees;

/**
 * The Developer class extends Employee and adds a programming language attribute.
 * Demonstrates how subclasses can extend the superclass with additional properties.
 */
public class Developer extends Employee {
    private String programmingLanguage;

    // Constructor to initialize Developer attributes, including superclass attributes
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);  // Call to superclass constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Getter and Setter methods for programmingLanguage
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
