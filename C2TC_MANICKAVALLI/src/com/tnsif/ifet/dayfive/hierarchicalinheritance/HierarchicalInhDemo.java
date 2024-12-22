package com.tnsif.ifet.dayfive.hierarchicalinheritance;

public class HierarchicalInhDemo {
	public static void main(String[] args) { 
		Person p1 = new Person(); 
		System.out.println("----------------- Person Details ---------------------"); 
		System.out.println(p1); 
		Person p; 
		p = new Person("Dhruv", "Mumbai"); 
		if (p instanceof Person) 
		System.out.println("Person Details "+p); 
		p = new Employee(); 
		if (p instanceof Employee) 
		System.out.println("Employee Details "+p); 
		p = new Student(); 
		if (p instanceof Student) 
		System.out.println("Student Details "+p); 
		} 
		}
