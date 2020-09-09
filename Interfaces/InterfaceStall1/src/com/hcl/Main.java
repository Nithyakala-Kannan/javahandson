package com.hcl;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stallName,ownerName,details;
		int cost,tvSet,screen,projector;
		int choice;
		Stall s1=new GoldStall();
		Stall s2=new PremiumStall();
		Stall s3=new ExecutiveStall();
        Scanner sc=new Scanner(System.in);
		System.out.println("Choose stall Type");
		System.out.println("1.Gold Stall\n2.Executive Stall\n3.Premium Stall");
		choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
			details=sc.nextLine();
			String items[]=details.split(",");
			stallName=items[0];
			cost=Integer.parseInt(items[1]);
			ownerName=items[2];
			tvSet=Integer.parseInt(items[3]);
			((GoldStall) s1).setStallName(stallName);
			((GoldStall) s1).setCost(cost);
			((GoldStall) s1).setOwnerName(ownerName);
			((GoldStall) s1).setTvSet(tvSet);
			((GoldStall) s1).display();
			break;
		case 2:	
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of projectors)");
			details=sc.nextLine();
			String items1[]=details.split(",");
			stallName=items1[0];
			cost=Integer.parseInt(items1[1]);
			ownerName=items1[2];
			projector=Integer.parseInt(items1[3]);
			((PremiumStall) s2).setStallName(stallName);
			((PremiumStall) s2).setCost(cost);
			((PremiumStall) s2).setOwnerName(ownerName);
			((PremiumStall) s2).setProjector(projector);
			((PremiumStall) s2).display();
			break;
		case 3:
			System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of screens)");
			details=sc.nextLine();
			String items11[]=details.split(",");
			stallName=items11[0];
			cost=Integer.parseInt(items11[1]);
			ownerName=items11[2];
			screen=Integer.parseInt(items11[3]);
			((ExecutiveStall) s3).setStallName(stallName);
			((ExecutiveStall) s3).setCost(cost);
			((ExecutiveStall) s3).setOwnerName(ownerName);
			((ExecutiveStall) s3).setScreen(screen);
			((ExecutiveStall) s3).display();
			break;
			}
		}
		
	}


