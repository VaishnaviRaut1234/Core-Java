package com.demo;

import java.util.ArrayList;

public class Supplier 
{
	private int regNo;
	private String sName;
	ArrayList <Item> it;
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Supplier(int regNo, String sName, ArrayList<Item> it) {
		super();
		this.regNo = regNo;
		this.sName = sName;
		this.it = it;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public ArrayList<Item> getIt() {
		return it;
	}
	public void setIt(ArrayList<Item> it) {
		this.it = it;
	}
	@Override
	public String toString() {
		return "Supplier [regNo=" + regNo + ", sName=" + sName + ", it=" + it + "]";
	}
	
	
}
