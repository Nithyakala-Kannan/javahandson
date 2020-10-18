package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args)throws Exception
	{
		
     ApplicationContext context=new AnnotationConfigApplicationContext("EmpConfig.class");
     
     Employee employee=context.getBean(Employee.class,"employee");
     Address address=context.getBean(Address.class,"address");
     employee.display();
     address.display();
	}

}
