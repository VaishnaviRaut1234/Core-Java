package com.demo;

public class MyDate 
{
	private int dd, mm,yy;

	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "Date =" + dd + ", Month =" + mm + ", Year =" + yy;
	}
	
	
}
