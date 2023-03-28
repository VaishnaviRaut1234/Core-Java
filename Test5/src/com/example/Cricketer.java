package com.example;

public class Cricketer 
{
	private int playerid;
	private String name;
	private Boolean isBaller;
	private float strikerate;
	private int runs;
	
	
	public int getPlayerid()
	{
		return playerid;
	}
	
	public void setPlayerid(int playerid)
	{
		this.playerid=playerid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public Boolean getIsBaller()
	{
		return isBaller;
	}
	public void setIsBaller(boolean isBaller)
	{
		this.isBaller=isBaller;
	}
	public float getStrikerate()
	{
		return strikerate;
	}
	public void setStrikerate(float strikerate)
	{
		this.strikerate=strikerate;
	}
	public int getRuns()
	{
		return runs;
	}
	public void setRuns(int runs)
	{
		this.runs=runs;
	}

	public void acceptDetails(int playerid, String name,Boolean isBaller,float strikerate, int runs)
	{
		this.playerid=playerid;
		this.name=name;
		this.isBaller=isBaller;
		this.strikerate=strikerate;
		this.runs=runs;
	}
	
	public void showDetails()
	{
		System.out.println("Player id "+playerid);
		System.out.println("Player name "+name);
		System.out.println("Player is baller "+isBaller);
		System.out.println("Strikerate "+strikerate);
		System.out.println("Runs are "+runs);
		
	}
	public static void main(String[] args) 
	{
		Cricketer c1 = new Cricketer();
		c1.acceptDetails(101, "Vaishu", true, 56f, 105);
		c1.showDetails();
		
		
	}
	
	
}
