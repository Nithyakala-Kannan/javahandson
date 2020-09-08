package com.hcl;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,detail,ownerName;
		int noOfStall,type;
		int noOfShows,noOfSeatsPerShow;
		Scanner sc=new Scanner(System.in);
		Event e1=new Exhibition();
        Event e2=new stageEvent();
		System.out.println("Enter the name of the event");
		name=sc.nextLine();
		System.out.println("Enter the detail of the event");
		detail=sc.nextLine();
		System.out.println("Enter the owner name of the event");
		ownerName=sc.nextLine();
		System.out.println("Enter type of the event");
		System.out.println("1.Exhibition\n2.StageEvent");
		type=sc.nextInt();
		sc.nextLine();
		switch(type)
		{
		case 1:
			System.out.println("Enter the number of stalls");
			noOfStall=sc.nextInt();
			((Exhibition) e1).setNoOfStall(noOfStall);
			System.out.println("The projected Revenue is"+ e1.projectedRevenue());
			break;
		case 2:
			System.out.println("Enter the No of Shows");
			noOfShows=sc.nextInt();
			System.out.println("Enter the No of Seats per Show");
			noOfSeatsPerShow=sc.nextInt();
			((stageEvent) e2).setNoOfShows(noOfShows);
			((stageEvent) e2).setNoOfSeatsPerShow(noOfSeatsPerShow);
			System.out.println("The projected Revenue is"+e2.projectedRevenue());
			break;
			default:
				System.out.println("Incorrect option");
			
		}
		
		
		

		

	}

}
