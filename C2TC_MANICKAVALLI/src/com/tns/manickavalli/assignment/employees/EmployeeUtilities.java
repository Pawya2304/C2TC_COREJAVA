package com.tns.manickavalli.assignment.employees;

import com.tns.manickavalli.assignment.employees.Employee;
import com.tns.manickavalli.assignment.employees.Manager;
import com.tns.manickavalli.assignment.employees.Developer;

/**
 * The EmployeeUtilities class provides utility methods to operate on Employee objects.
 * Demonstrates usage of the Employee class and its subclasses.
 */
public class EmployeeUtilities {

    /**
     * Prints the details of an employee (name, ID, salary).
     * @param employee The employee whose details will be printed
     */
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
    }

    /**
     * Gives a salary raise to a developer.
     * @param developer The developer to whom the salary raise will be given
     * @param raiseAmount The amount to increase the salary by
     */
    public void giveSalaryRaiseToDeveloper(Developer developer, double raiseAmount) {
        double newSalary = developer.getSalary() + raiseAmount;
        developer.setSalary(newSalary);
        System.out.println("New salary for Developer " + developer.getName() + " is: " + newSalary);
    }

    /**
     * Assigns a manager to a new department.
     * @param manager The manager to be reassigned
     * @param newDepartment The department name to assign the manager to
     */
    public void assignManagerToNewDepartment(Manager manager, String newDepartment) {
        manager.setDepartment(newDepartment);
        System.out.println("Manager " + manager.getName() + " is now assigned to " + newDepartment + " department.");
    }
}

