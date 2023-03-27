package com.constructor;

public class Employee 
{
	private int empId;
	private String eName;
	private float basicSalary;
	private float hra;
	private float da;
	private float grossSalary;
	
	Employee()
	{
		empId=101;
		eName= "Vaishnavi";
		basicSalary=15000;
	}
	
	Employee(int empId, String eName, float basicSalary)
	{
		this.empId=empId;
		this.eName=eName;
		this.basicSalary=basicSalary;
		
		if(basicSalary>0)
		{
			hra = 0.35f*basicSalary;
			da = 0.2f*basicSalary;
			grossSalary = hra + da + basicSalary;
		}
	}
	
	void showDetails()
	{
		System.out.println("Id = "+empId+", Name = "+eName+", Basic Salary = "+basicSalary);
		System.out.println("Gross salary = "+grossSalary);
	}
	public static void main(String[] args) 
	{
		//Employee e = new Employee();
		Employee e1 = new Employee(101,"Vaishu",5000);
		e1.showDetails();
	}

}
