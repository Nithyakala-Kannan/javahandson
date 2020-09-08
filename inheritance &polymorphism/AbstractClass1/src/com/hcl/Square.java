package com.hcl;

public class Square extends Shape
{
 float side;
 double perimeter;
 
 public float getSide() {
	return side;
}

public void setSide(float side) {
	this.side = side;
}

public Double calculatePerimeter()
 {
	  perimeter=4*side;
	  System.out.println("The perimeter of Square is"+perimeter);
	return perimeter;
 }
}
