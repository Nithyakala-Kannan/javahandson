package com.hcl;

public class stageEvent extends Event
{

	int noOfShows,noOfSeatsPerShow;
	stageEvent()
	{
		
	}
	
	public stageEvent(int noOfShows, int noOfSeatsPerShow) {
		super();
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}

	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}

	public Double projectedRevenue()
	{
		return (double) (noOfShows*(noOfSeatsPerShow*50));
	}

}
