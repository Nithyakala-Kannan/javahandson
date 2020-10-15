package com.hcl;

import java.util.ArrayList;

public class CourseList {

	private ArrayList<Course> courseList;
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
		if(course!=null)
		   courseList.add(course);
	}
	public double revenue() {
		double revenue = 0;
		for(Course course : courseList) {
			revenue += course.getFee() * 0.2 * 200;
		}
		return revenue;
	}
}
