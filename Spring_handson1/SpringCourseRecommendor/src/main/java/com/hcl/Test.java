package com.hcl;
import java.io.*;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method
		CourseList list=new CourseList();
		double budget;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Course course1=context.getBean("course1",Course.class);
		Course course2=context.getBean("course2",Course.class);
		Course course3=context.getBean("course3",Course.class);
		
		list.insert(course1);
		list.insert(course2);
		list.insert(course3);
		
		System.out.println("Enter the budget");
		budget= Double.parseDouble(br.readLine());
		
		ArrayList<String> courses=list.noOfCourse(budget);
		if(courses.isEmpty())
			System.out.println("No courses avilable");
		else {
			for(String item:courses)
			{
				System.out.println(item);
			}
		}
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
