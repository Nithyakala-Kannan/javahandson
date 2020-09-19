package com.hcl;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> hall=new ArrayList<>();
        int no_of_hall;
		String search;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of halls");
		no_of_hall=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=no_of_hall;i++)
		{
			System.out.println("Enter the Hall Name"+i);
			hall.add(sc.nextLine());
		}
		System.out.println("Enter the hall name to be searched");
		search=sc.nextLine();
		if(hall.contains(search)==true)
			System.out.println(search+" is found at position "+hall.indexOf(search));
		else
			System.out.println(search+"hall is not found");
	}

}
