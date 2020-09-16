package com.hcl;

public class Venue {

	public Venue(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	String name,city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		
	}
	
	void display(){
		
		 System.out.println("Venue Details");
    	 System.out.println("Venue Name:"+this.name);
    	 System.out.println("City Name:"+this.city);
    	 
	}
	
}
