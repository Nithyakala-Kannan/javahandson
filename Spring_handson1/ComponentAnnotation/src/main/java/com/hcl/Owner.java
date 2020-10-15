package com.hcl;

import org.springframework.stereotype.Component;

@Component
public class Owner {
	private String name; 
	private String password; 
	private String mobileNumber;
	public Owner()
	{
		
	}
	public Owner(String name, String password, String mobileNumber) {
		super();
		this.name = name;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
   public void display()
   {
	   System.out.println("Name : " + this.getName()+"\nMobile Number : " + this.getMobileNumber() + "");
	   
   }
   public void setDetails(String name, String password, String mobileNumber) {
		
		this.name = name;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}

}
