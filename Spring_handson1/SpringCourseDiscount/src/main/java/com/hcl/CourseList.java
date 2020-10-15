package com.hcl;

import java.util.ArrayList;
import java.util.Collections;

public class CourseList {

	private ArrayList<Course> courseList = new ArrayList();
    Course course=null;
	public CourseList()
	{
		
	}
	public CourseList(ArrayList<Course> courseList) {
		super();
		this.courseList = courseList;
	}
	public ArrayList<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	} 
	public void insert(Course course)
	{
			courseList.add(course);
		
	}
	public void discount() {
		ArrayList<Double> fees=new ArrayList<Double>();
		double min = 0,max = 0;
		String name1 = null,name2 = null;
		for(Course list:courseList)
		{
			fees.add(list.getFee());
		}
		if(course.getFee()>=Collections.max(fees))
		{
			max=course.getFee();
			name1=course.getName();
		}
		else if(course.getFee()<=Collections.min(fees))
		{
			min=course.getFee();
			name2=course.getName();
			
		}
		System.out.println("Discount "+(0.1*max)+"for "+ name1);
		System.out.println("Discount"+(0.05*min)+"for"+name2);
		}                                                   
		
		
	}

