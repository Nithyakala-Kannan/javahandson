package com.hcl;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		float radius,breadth,length,side;
		Scanner sc=new Scanner(System.in);
		Shape s1= new Circle();
		Shape s2= new Rectangle();
		Shape s3=new Square();
		System.out.println("List of Shapes:");
		System.out.println("1.Circle\n2.Rectangle\n3.Square");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the radius");
			radius=sc.nextFloat();
		    ((Circle) s1).setRadius(radius);
			s1.calculatePerimeter();
			break;
		case 2:
			System.out.println("Enter length and breadth");
			length=sc.nextFloat();
			breadth=sc.nextFloat();
			((Rectangle) s2).setLength(length);
			((Rectangle) s2).setBreadth(breadth);
			s2.calculatePerimeter();
			break;
		case 3:
			System.out.println("Enter the side of square");
			side=sc.nextFloat();
			((Square) s3).setSide(side);
			s3.calculatePerimeter();
			break;	
			
		}
		

	}

}
