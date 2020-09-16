package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,city;
	     Scanner sc=new Scanner(System.in);
	    
	      System.out.println("Enter Venue name");
	      name=sc.nextLine();
	      System.out.println("Enter city name");
	      city=sc.nextLine();
	     
        Venue v=new Venue();
      
        v.displayDetails(name,city);
	}

}
