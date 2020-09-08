package com.hcl;

public class Rectangle extends Shape
{
 float breadth,length;
 double perimeter;
 public float getBreadth() {
	return breadth;
}
public void setBreadth(float breadth) {
	this.breadth = breadth;
}
public float getLength() {
	return length;
}
public void setLength(float length) {
	this.length = length;
}
public Double calculatePerimeter()
 {
	  perimeter=2*(length+breadth);
	  System.out.println("The perimeter of Rectangle is"+perimeter);
	return perimeter;
	  
 }
}
