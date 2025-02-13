package com.placementManagementSystem.Placement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Placement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	private String companyName;
	private String position;
	private String location;
	private String salaryPackage;
	private String driveDate;
	
	//Generating the getter and setter for variables
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSalaryPackage() {
		return salaryPackage;
	}
	public void setSalaryPackage(String salaryPackage) {
		this.salaryPackage = salaryPackage;
	}
	public String getDriveDate() {
		return driveDate;
	}
	public void setDriveDate(String driveDate) {
		this.driveDate = driveDate;
	}
	
	
	//generate the constructors (parameterized)
	
	public Placement(Long id, String companyName, String position, String location, String salaryPackage,
			String driveDate) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.position = position;
		this.location = location;
		this.salaryPackage = salaryPackage;
		this.driveDate = driveDate;
	}
	
	
	
	//generate constructor (default)
	
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//generate to string
	
	@Override
	public String toString() {
		return "Placement [id=" + id + ", companyName=" + companyName + ", position=" + position + ", location="
				+ location + ", salaryPackage=" + salaryPackage + ", driveDate=" + driveDate + "]";
	}
	
	
	
	
	
	
}
