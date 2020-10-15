package com.hcl;
import java.util.*;
public class Employee {

	private String employeeName ;
	private ArrayList<String> employeeMobileNumber; 
	private Long employeeSalary ;
	private String employeeEmail; 
	 private Address address; 
   public Employee()
   {
	   
   }
public Employee(String employeeName, ArrayList<String> employeeMobileNumber, Long employeeSalary, String employeeEmail,
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
public ArrayList<String> getEmployeeMobileNumber() {
	return employeeMobileNumber;
}
public void setEmployeeMobileNumber(ArrayList<String> employeeMobileNumber) {
	this.employeeMobileNumber = employeeMobileNumber;
}
public Long getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(Long employeeSalary) {
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
	   System.out.println("The contact numbers are");
	   for(String list:employeeMobileNumber)
	   {
		   System.out.println(list);
	   }
	   System.out.println("Salary: "+employeeSalary);
	   System.out.println("Email: "+employeeEmail);
   }
}
