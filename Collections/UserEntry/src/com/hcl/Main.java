package com.hcl;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
        Set h=new HashSet();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=20;i++)
		{
			System.out.println("Enter the User name");
			h.add(sc.nextLine());
			System.out.println("Do ypu want to continue(y/n)?");
			ch=sc.next().charAt(0);
			sc.nextLine();
			if(ch=='y')
				continue;
			else
				break;
		}
		System.out.println("No of Users"+h.size());
						
	}

}
