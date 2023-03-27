package com.hierarchical;

public class RacingBiike extends Bike 
{
	private float speed;

	public RacingBiike() 
	{
		super();
		
	}

	public RacingBiike(int model, String name, float price, float speed) {
		super(model, name, price);
		this.speed=speed;
		
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	
	public String toString() {
		return "RacingBiike [speed=" + speed + "]";
	}
	
	
}
