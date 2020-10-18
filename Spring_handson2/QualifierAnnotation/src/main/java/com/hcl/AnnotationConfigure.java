package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfigure {
	@Bean(name="orderOne")
	public Order getOrder1()
	{
		Order orderOne=new Order();
		orderOne.setItemName("item1");
		orderOne.setPrice(230.07);
		return orderOne;
	}
	@Bean(name="orderTwo")
	public Order getOrder2()
	{
		Order orderTwo=new Order();
		orderTwo.setItemName("item2");
		orderTwo.setPrice(230.07);
		return orderTwo;
	}
	@Bean(name="user")
	public User getUser()
	{
		User user=new User();
		user.setName("Jegan");
		user.setAge(25);
		user.setCity("Chennai");
		return user;
	}

}
