package com.test;

public class Test {

	public static void main(String[] args) 
	{
		Testdemo e1 = new Testdemo("Vaishanvi", "Pune",5655f);
		Testdemo e2 = new Testdemo("Suraj", "Pune",56455f);
		Testdemo e3 = new Testdemo("Rahul", "Pune",56455f);
		
		if(e1.salary==e2.salary)
		{
			System.out.println("Employe "+e1.name+ " and "+e2.name+" have same salary");
		}
		else if(e1.salary==e3.salary)
		{
			System.out.println("Employe "+e1.name+ " and "+e3.name+" have same salary");
		}
		else if(e2.salary == e3.salary)
		{
			System.out.println("Employe "+e2.name+ " and "+e3.name+" have same salary");
		}
		else
		{
			System.out.println("All Employee salary are different");
		}
	}

}
