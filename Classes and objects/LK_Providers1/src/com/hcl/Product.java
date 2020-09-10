package com.hcl;

public class Product {

	int product_code,stock;
	String product_name;
	double price;
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Product(int product_code, int stock, String product_name, double price) {
		super();
		this.product_code = product_code;
		this.stock = stock;
		this.product_name = product_name;
		this.price = price;
	}
	
		
	}
	
	

