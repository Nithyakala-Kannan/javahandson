package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		CourseList courseList=context.getBean("courseList",CourseList.class);
         System.out.println("Total Revenue : " + courseList.revenue());
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
