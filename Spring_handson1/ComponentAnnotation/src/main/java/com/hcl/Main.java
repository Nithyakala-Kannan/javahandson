package com.hcl;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext("AnnotationConfigure.class");
		Owner owner=context.getBean("owner",Owner.class);
		System.out.println("Enter the name,password and mobile number of the user ");
		owner.display();
		((AnnotationConfigApplicationContext)context).close();
	}

}
