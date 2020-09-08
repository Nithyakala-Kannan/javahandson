package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Long over,balls,runs;
		String batsman,bowler,nonStriker;
	    Scanner sc=new Scanner(System.in);
	  
	     System.out.println("Enter the over");
	     over=sc.nextLong();
	     System.out.println("Enter the balls");
	     balls=sc.nextLong();
	     System.out.println("Enter the runs");
	     runs=sc.nextLong();
	     sc.nextLine();
	     System.out.println("Enter batsman name");
	     batsman=sc.nextLine();
	  
	     System.out.println("Enter bowler name");
	     bowler=sc.nextLine();
	     System.out.println("Enter Non Striker");
	     nonStriker=sc.nextLine();
	     
	     Delivery d=new Delivery(over,balls,runs, batsman,bowler,nonStriker);
	     
	     
	     System.out.println("Deliveryr Details:");
	    	System.out.println("Overs:"+d.getOver());
	    	System.out.println("Balls:"+d.getBall());
	    	 System.out.println("Runs:"+d.getRuns());
	    	 System.out.println("Batsman :"+d.getBatsman());
	    	System.out.println("Bowler:"+d.getBowler());
	    	System.out.println("Non-Striker:"+d.getNonStriker());
	     
	}

}
