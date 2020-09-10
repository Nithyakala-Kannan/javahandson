package com.hcl;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String name;	
		double deposit,costPerDay;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		itemType i=new itemType();
		try
		{
		System.out.println("Enter the item type details:");
		System.out.println("Enter the name:");
		name=br.readLine();
		System.out.println("Enter the deposit:");
		deposit=Double.parseDouble(br.readLine());
		System.out.println("Enter the cost per day:");
		costPerDay=Double.parseDouble(br.readLine());
		System.out.println("The item details are:");
		i.setName(name);
		i.setDeposit(deposit);
		i.setCostPerDay(costPerDay);
		System.out.println("Name:"+i.getName()+"\nDeposit:"+i.getDeposit()+"\nCost Per Day:"+i.getCostPerDay());
		
		}
		catch(NumberFormatException ne)
		{
			System.out.println(ne.toString());
		}
	}

}
