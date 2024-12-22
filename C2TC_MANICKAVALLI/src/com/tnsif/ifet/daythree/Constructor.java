package com.tnsif.ifet.daythree;
import java.util.Scanner;
public class Constructor {
	private String customerName; 
	private int customerId; 
	private String customerCity; 
	public Constructor() {
		System.out.println("Default Constructor");
	}
	public Constructor(String customerName, int customerId, String customerCity) {
		this();
		System.out.println("Parameterized Constructor");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	public static void main(String args[]) 
	{ 
	Scanner sc=new Scanner(System.in); 
	String name, city; 
	int id; 
	System.out.print("Enter Customer Id : "); 
	id=sc.nextInt(); 
	sc.nextLine(); 
	System.out.print("Enter Customer Name : "); 
	name=sc.nextLine(); 
	System.out.print("Enter Customer City : "); 
	city=sc.nextLine(); 
	System.out.println(" "); 
	Constructor c1=new Constructor(); //default constructor invoked 
	c1.setCustomerName(name); 
	c1.setCustomerId(id); 
	c1.setCustomerCity(city); 
	System.out.println(c1); 
	System.out.print("Enter Customer Id : "); 
	id=sc.nextInt(); 
	sc.nextLine(); 
	System.out.print("Enter Customer Name : "); 
	name=sc.nextLine(); 
	System.out.print("Enter Customer City : "); 
	city=sc.nextLine(); 
	Constructor c2=new Constructor(name, id, city); 
	//parameterized constructor invoked); 
	System.out.println(c2); 
	sc.close(); 
	} 
	}
