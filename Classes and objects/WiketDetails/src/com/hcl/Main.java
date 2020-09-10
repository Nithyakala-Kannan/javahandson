package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Long over,ball;
		 String wicketType,playerName,bowlerName;
		 String details;
		 String[] wickets;
		 int wicket;
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the no of Wickets");
		  wicket=sc.nextInt();
		  sc.nextLine();
		  
		  
		  
		  for(int i=1;i<=wicket;i++)
		  {
			 
				  System.out.println("Enter the details of wicket "+i);
				  details=sc.nextLine();
				  String[] items=details.split(",");
				  over=Long.parseLong(items[0]);
				  ball=Long.parseLong(items[1]);
				  wicketType=items[2];
				  playerName=items[3];
				  bowlerName=items[4];
				 
				  Wicket w= new Wicket(over,ball,wicketType,playerName,bowlerName);
				  
		 
				  	   System.out.println("Wicket details"+i) ;
			 
		     w.setOver(over);  
		     w.setBall(ball);
		     w.setBowlerName(bowlerName);
		     w.setPlayerName(playerName);
		     w.setWicketType(wicketType);
		       
			System.out.println("Over:"+w.getOver());
			  System.out.println("Ball:"+w.getBall());
			  System.out.println("Wicket Type:"+w.getWicketType());
			  System.out.println("Player Name:"+w.getPlayerName());
			  System.out.println("Bowler Name"+w.getBowlerName());
			  
			 
		  }
		 
		  
	}
}



