package com.hcl;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String employeeName ;
	private String employeeMobileNumber; 
	private int employeeSalary ;
	private String employeeEmail; 
	 private Address address; 
	 public Employee()
	 {
		 
	 }
	public Employee(String employeeName, String employeeMobileNumber, int employeeSalary, String employeeEmail,
			Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeMobileNumber = employeeMobileNumber;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.address = address;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	
	public void setEmployeeMobileNumber(String employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display()
	   {
		   System.out.println("Name: "+employeeName);
		   System.out.println("Mobile Number"+employeeMobileNumber);
		   System.out.println("Salary: "+employeeSalary);
		   System.out.println("Email: "+employeeEmail);
	   }
}
