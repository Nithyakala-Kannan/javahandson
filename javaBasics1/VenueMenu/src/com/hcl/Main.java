package com.hcl;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String name,city;
         Scanner sc=new Scanner(System.in);
          
         System.out.println("Enter the Venue name:");
         name=sc.nextLine();
         System.out.println("Enter the city name");
         city=sc.nextLine();
         
         Venue v=new Venue(name,city);
         
         v.display();
         
         int ch;
        System.out.println(" Menu \n 1.Update Venue Name \n 2.Update City Name \n3.All informations Correct/Exit \nType 1 or 2 or 3 ");
        ch=sc.nextInt();
        sc.nextLine();
         switch(ch)
         {
         case 1:
        	 System.out.println("Enter the Venue name:");
             name=sc.nextLine();
     
             v.setName(name);
             v.display();
             break;
         case 2:
        	 System.out.println("Enter the city name");
             city=sc.nextLine();
            
             v.setCity(city);
             v.display();
             break;
         case 3:
        	 v.display();
        	 break;
        	   
         }
	}

}
