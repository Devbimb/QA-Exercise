package org;

public class Employee {

	static Employee emp = new  Employee (); // static object created inside the class but static
	private Employee () {} //private constructor 1st rule
	
	public static Employee getEmployee()//static method
	{
		return emp;
	}
	public void sayHello()
	{
		System.out.println("hello");
	}
	
	public void sayHi()
	{
		System.out.println("HI");
	}

	
}
