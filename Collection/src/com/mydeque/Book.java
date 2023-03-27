package com.mydeque;

public class Book 
{

	String name;
	int id;
	float price;
	
	public Book() {
		super();
		
	}


	public Book(String name, int id, float price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


}
