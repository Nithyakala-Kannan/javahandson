package com.hcl;
import java.util.*;
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int product_code,stock;
		String product_name;
		double price;
		int no;String details;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of products:");
		no=sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=no;i++)
		{
			System.out.println("Enter product "+i+" details");
			details=sc.nextLine();
			
			String items[]=details.split(",");
			
			product_code=Integer.parseInt(items[0]);
			product_name=items[1];
			
			price=Double.parseDouble(items[2]);
			stock=Integer.parseInt(items[3]);
		
			Product p=new Product(product_code,stock,product_name,price);
			p.setPrice(price);
			p.setProduct_code(product_code);
			p.setProduct_name(product_name);
			p.setStock(stock);
			
			System.out.println("Product Detals:");
			System.out.println("Product Code:"+p.getProduct_code());
			System.out.println("Name:"+p.getProduct_name());
			System.out.println("Price:"+p.getPrice());
			System.out.println("Stock:"+p.getStock());
		}
		public void checkPrice(){
			for (int i = 0; i < items[2]; i++) {
				
			    for (int k = 0; k<items[2]; k++) {
			        if (items[i] != items[k + 1]) {
			            System.out.println(a[i] + " not the same with  " + a[k + 1] + "\n");
			        }
			    }
			}
		
		
	}

}
