package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,country,skill;
	     String detail;
	     
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the player details");
	     detail=sc.nextLine();
	     
	     String[] items=detail.split(",");
	     name=items[0];
	     country=items[1];
	     skill=items[2];
	     Player p=new Player();
	     p.display(name,country,skill);
	     
	}

}
