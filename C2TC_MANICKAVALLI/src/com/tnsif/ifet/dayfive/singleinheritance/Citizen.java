package com.tnsif.ifet.dayfive.singleinheritance;

public class Citizen {
	private String name; 
	private String aadharNo; 
	private String address; 
	private long phno; 
	public Citizen() { 
		System.out.println("Citizen object created"); 
		}
	public Citizen(String name, String aadharNo, String address, long phno) {
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phno=" + phno + "]";
	}
}
/*public class Student extends Citizen { 
private int rollNo; 
private String collegeName; 
public Student() { 
super(); 
}
public Student(String name, String aadharNo, String address, long phno, int rollNo, String collegeName) { 
super(name, aadharNo, address, phno); //accessing parent class constructor 
this.rollNo = rollNo; 
this.collegeName = collegeName; 
} 
public int getRollNo() { 
return rollNo; 
} 
public void setRollNo(int rollNo) { 
this.rollNo = rollNo; 
} 
public String getCollegeName() { 
return collegeName; 
} 
public void setCollegeName(String collegeName) { 
this.collegeName = collegeName; 
} 
@Override 
public String toString() { 
return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName() 
+ ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhno() 
+ "]"; 
} 

  
public static void main(String[] args) { 
Student student = new Student("Gayatri", "8080808080", "Bangalore", 9888878787L, 10, "City College"); 
System.out.println(student); 
} 
}*/