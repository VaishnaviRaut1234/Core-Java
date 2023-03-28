package com.demo;

public class Shipment 
{
	private int shipId;
	private String custName;
	private MyDate shipdate;
	private Address addr;
	public Shipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shipment(int shipId, String custName, MyDate shipdate, Address addr) {
		super();
		this.shipId = shipId;
		this.custName = custName;
		this.shipdate = shipdate;
		this.addr = addr;
	}
	public int getShipId() {
		return shipId;
	}
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public MyDate getShipdate() {
		return shipdate;
	}
	public void setShipdate(MyDate shipdate) {
		this.shipdate = shipdate;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Shipment Details : Shipment Id = " + shipId + ", Customer Name = " + custName + ", "+ shipdate + " , " + addr;
	}
}
