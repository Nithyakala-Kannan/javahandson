package com.hcl;
import java.util.*;
public class CourseList 
{
	private ArrayList<Course> courseList = new ArrayList();
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
	public ArrayList<String> noOfCourse(Double budget) 
	{
		ArrayList<String> list= new ArrayList<String>();
		for(Course course: this.courseList)
		{
			if(budget>=course.getFee())
			list.add(course.getName()+"-"+(int)(budget/course.getFee()));
		}
		return list;
	}

}
