package com.hierarchical;

public class Bike 
{
	private int model;
	private String name;
	private float price;
	public Bike(int model, String name, float price) {
		super();
		this.model = model;
		this.name = name;
		this.price = price;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	public String toString() {
		return "Bike [model=" + model + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
