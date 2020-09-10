package com.hcl;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
	     long runs;
	     String detail;
	     
	     Scanner sc=new Scanner(System.in);
  
	     System.out.println("Enter Extra Type Details");
	     detail=sc.nextLine();
	     
	     String[] items=detail.split("#");
	     name=items[0];
	     runs=Long.parseLong(items[1]);
	     
	     ExtraType e=new ExtraType(name,runs);
	    System.out.println("ExtraType Details");
	    System.out.println("ExtraType:"+e.getName());
	    System.out.println("Runs:"+e.getRuns());
	     
	     
	}
}
