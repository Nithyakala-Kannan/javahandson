package com.hcl;

public class Circle extends Shape
{
  float radius;
  double perimeter;
  
public float getRadius() {
	return radius;
}

public void setRadius(float radius) {
	this.radius = radius;
}

public Double calculatePerimeter()
  {
	  perimeter=2*3.14*radius;
	  System.out.println("The perimeter of circle  is"+perimeter);
	return perimeter;
	
  }
}
