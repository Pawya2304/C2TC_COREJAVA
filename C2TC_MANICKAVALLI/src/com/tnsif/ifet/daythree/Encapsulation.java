package com.tnsif.ifet.daythree;

public class Encapsulation {
	private int serialNum; 
	private String name; 
	private int age;
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() { 
		return "OopsConceptDemo [Serial Number=" 
		+ serialNum + ", name=" + name + ", age=" + age 
		+ "]"; 
		} 
		
public static void main(String[] args) { 
//object creation  
Encapsulation obj = new Encapsulation(); 
obj.setSerialNum(101); 
obj.setName("Pooja"); 
obj.setAge(20); 
System.out.println(obj);
} 
}
		

	

