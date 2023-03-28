package com.demo;

import java.util.Objects;

public class Cutomer 
{
	private int id;
	private String name;
	private Order order;
	public Cutomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cutomer(int id, String name, Order order) {
		super();
		this.id = id;
		this.name = name;
		this.order = order;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(order, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cutomer other = (Cutomer) obj;
		return Objects.equals(order, other.order) && id == other.id && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "\nCutomer Details : id=" + id + ", name=" + name + order;
	}
	
	
	
}
