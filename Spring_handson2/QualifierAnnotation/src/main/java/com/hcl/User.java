package com.hcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;
	private int age;
	private String city; 
	private Order order; 
    public User()
    {
    	
    }
	public User(String name, int age, String city, Order order) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.order = order;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Order getOrder() {
		return order;
	}
	@Autowired
	@Qualifier("orderOne")
	public void setOrder(Order order) {
		this.order = order;
	}
    public void display()
    {
    	System.out.println("Name:"+name+"\nAge"+age+"\nCity"+city);
    	System.out.println("Order details:");
    	System.out.println("Item Name:"+order.getItemName()+"\nPrice:"+order.getPrice());
    }
}
