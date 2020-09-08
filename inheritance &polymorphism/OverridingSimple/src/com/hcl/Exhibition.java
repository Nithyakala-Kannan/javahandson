package com.hcl;

public class Exhibition extends Event
{
 int noOfStall;
 Exhibition()
 {
	 
 }
 public Exhibition(int noOfStall) {
	super();
	this.noOfStall = noOfStall;
}

public int getNoOfStall() {
	return noOfStall;
}

public void setNoOfStall(int noOfStall) {
	this.noOfStall = noOfStall;
}

public Double projectedRevenue()
	{
		return (double) (noOfStall*10000);
	}
 
}
