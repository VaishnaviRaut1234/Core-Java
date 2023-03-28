package com.wrapper;

class Demo
{
	Object showMsg(Object ob)
	{
		return "Hi"+ob;
	}
}

public class WrapperDemo extends Demo
{
	@Override
	WrapperDemo showMsg(Object ob)
	{
		System.out.println("Hello");
		return this;
	}
	
	public static void main(String args[])
	{
		WrapperDemo d1 = new WrapperDemo();
		d1 = d1.showMsg(d1);
	}
}
