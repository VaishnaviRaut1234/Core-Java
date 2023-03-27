package com.containment;

public class Employee 
{
	int empid;
	String empName;
	float salary;
	Address addr;
	public Employee()
	{
		
	}
	public Employee(int empid, String empName, float salary, Address ad1)
	{
		
		this.empid=empid;
		this.empName=empName;
		this.salary=salary;
		addr=ad1;		//containment of address
	}
	
	public void showEmpRecord()
	{
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empid);
		System.out.println("Employee Salary : "+salary);
		addr.showAddress(); 	//show address from another class
		
	}
	
	public void setAddress(Address ad)	//set address for particular employee
	{
		addr=ad;
	}
}
