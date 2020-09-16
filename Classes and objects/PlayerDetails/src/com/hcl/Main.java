package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,country,skill;
	    
	     
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter name");
	     name=sc.nextLine();
	     System.out.println("Enter country");
	     country=sc.nextLine();
	     System.out.println("Enter skill");
	     skill=sc.nextLine();
		Player p=new Player();
        
        p.displayDetails(name,country,skill);
	}

}
