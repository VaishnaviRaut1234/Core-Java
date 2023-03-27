package com.hierarchical;

public class MountainBike extends Bike
{
	private int gear;
	private int seatHeight;
	
	public MountainBike() 
	{
		super();
		
	}

	public MountainBike(int model, String name, float price, int gear, int seatHeight) 
	{
		
		super(model, name, price);
		this.gear = gear;
		this.seatHeight = seatHeight;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	
	public String toString() {
		return super.toString()+"MountainBike [gear=" + gear + ", seatHeight=" + seatHeight + "]";
	}
	
	
	
	
	
}
