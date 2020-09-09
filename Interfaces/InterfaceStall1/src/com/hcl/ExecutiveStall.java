package com.hcl;

public class ExecutiveStall implements Stall{

	String stallName,ownerName;
	int cost,screen;
	public ExecutiveStall()
	{
		
	}
	public ExecutiveStall(String stallName, String ownerName, int cost, int screen) {
		super();
		this.stallName = stallName;
		this.ownerName = ownerName;
		this.cost = cost;
		this.screen = screen;
	}
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	public void display()
	{
		System.out.println("Stall Name:"+stallName);
        System.out.println("Cost:"+cost+".Rs");
        System.out.println("Owner Name:"+ownerName);
        System.out.println("Number of screens:"+screen);
	}
	
}
