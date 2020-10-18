package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(RequiredConfigure.class);
		User user=context.getBean(User.class,"user");
		Box box=context.getBean(Box.class,"box");
		
		box.display();
		((AnnotationConfigApplicationContext)context).close();

	}

}
