package com.hcl;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter an integer input");
		no=sc.nextInt();
		sc.nextLine();
		System.out.println("Entered value is\n"+no);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.toString());
		}
		
		

	}

}
