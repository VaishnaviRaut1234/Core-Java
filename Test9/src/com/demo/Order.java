package com.demo;

import java.util.Objects;

public class Order 
{
	private int id;
	private int totalItem;
	private float price;
	public Order() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, int totalItem, float price) {
		super();
		this.id = id;
		this.totalItem = totalItem;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(id,totalItem,price);
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(totalItem, other.totalItem) && id == other.id && price == other.price;
	}
	@Override
	public String toString() {
		return "\tOrder Details : id=" + id + ", totalItem=" + totalItem + ", price=" + price;
	}
	
	
}
