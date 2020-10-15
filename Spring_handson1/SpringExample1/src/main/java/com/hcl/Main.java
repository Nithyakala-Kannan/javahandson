package com.hcl;
import java.util.*;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee employee=context.getBean(Employee.class,"employee");
	employee.display();
	Address address=context.getBean(Address.class,"address");
	address.display();
	}

}
