package com.hcl;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<String> name=new ArrayList<>();
		ArrayList<Double> deposit=new ArrayList<>();
		ArrayList<Double> costPerDay=new ArrayList<>();
		char ch;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i>=1;i++)
		{
			System.out.println("Enter the details of ItemType "+i);
			System.out.println("Name");
			name.add(sc.nextLine());
			System.out.println("Deposit");
			deposit.add(sc.nextDouble());
			sc.nextLine();
			System.out.println("Cost Per Day");
			costPerDay.add(sc.nextDouble());
			sc.nextLine();
			System.out.println("Do you want to continue(y/n)?");
			ch=sc.next().charAt(0);
			sc.nextLine();
			if(ch=='y')
				continue;
			else
				break;	
		}
		
		System.out.println("Name\tDeposit\tCost Per Day");
		for(String s:name)
			System.out.println(s);
		for (double d1:deposit)
			System.out.print("\t"+d1);
		for(double d2:costPerDay)
			System.out.print("\t"+d2);

	}

}
