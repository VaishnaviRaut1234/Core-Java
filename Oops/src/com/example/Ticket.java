package com.example;

public class Ticket 
{
	public void bookTicket(Bus b)
	{
		b.useBus(500);
	}
	public void bookTicket(Train t)
	{
		t.useTrain(5000);
	}
	public void bookTicket(Aeroplane a)
	{
		a.useAeroplane(50000);
	}
	public static void main(String[] args) 
	{
		Ticket ti = new Ticket();
		
		Bus br = new Bus();
		Train tr = new Train();
		Aeroplane ar = new Aeroplane();
		ti.bookTicket(br);
		ti.bookTicket(tr);
		ti.bookTicket(ar);
	}

}
