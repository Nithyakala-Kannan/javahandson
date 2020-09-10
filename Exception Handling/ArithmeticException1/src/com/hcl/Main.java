package com.hcl;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// TODO Auto-generated method stub
		int cost,n,cost_per_day;
		BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter the cost of the item for n days:");
		cost=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of n");
		n=Integer.parseInt(br.readLine());
		cost_per_day=cost/n;
		System.out.println("Cost per day of the item is:"+cost_per_day);
		
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please enter the correct value");
			
		}
		

	}

}
