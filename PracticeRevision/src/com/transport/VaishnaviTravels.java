package com.transport;

public class VaishnaviTravels 
{
	public void bookTicket(Bus b)
	{
		b.transport();
	}
	
	public void bookTicket(Train t)
	{
		t.transport();
	}
	
	public void bookTicket(Aeroplane a)
	{
		a.transport();
	}
	
	public static void main(String[] args) 
	{
		VaishnaviTravels v = new VaishnaviTravels();
		
		v.bookTicket(new Aeroplane());
		v.bookTicket(new Train());
		v.bookTicket(new Bus());
	}

}
