package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AnnotationConfigure.class);
		User user=context.getBean(User.class,"user");
		Order order1=context.getBean(Order.class,"orderOne");
		Order order2=context.getBean(Order.class,"orderTwo");
		user.display();

	}

}
