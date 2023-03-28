package com.demo;

public class Address 
{
	private String addr;
	private String city;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addr, String city, String state) {
		super();
		this.addr = addr;
		this.city = city;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address = " + addr + ", city = " + city + ", state = " + state;
	}
	
}
