package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShipmentTest 
{

	public static void main(String[] args) 
	{
		
		List<Shipment> list= new ArrayList<Shipment>();
		list.add(new Shipment(101, "Vaishnavi",new MyDate(05,10,1997),new Address("near hanuman temple", "Amravati","Maharashtra") ));
		
		list.add(new Shipment(102, "Shubham",new MyDate(20,8,1996),new Address("Behind Bus Depo", "Akola","Maharashtra") ));
		list.add(new Shipment(103, "Nikhil",new MyDate(22,6,1997),new Address("near Z.P School", "Akola","Maharashtra") ));
		list.add(new Shipment(104, "Ashwini",new MyDate(17,8,1997),new Address("Behind Airtel Tower", "Paratwada","Maharashtra") ));
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		 
	
	}

}
