package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String humpty,dumpty;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter humpty sentence:");
		humpty=sc.nextLine();
		System.out.println("Enter dumpty sentence:");
		dumpty=sc.nextLine();
		if(humpty.contains(dumpty)==true)
			System.out.println("Found");
		else
			System.out.println("Not Found");

	}

}
