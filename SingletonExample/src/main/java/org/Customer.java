package org;

public class Customer {

	static Customer cstm = new  Customer (); // static object created inside the class but static
	private Customer () {} //private constructor 1st rule
	
	public static Customer getCustomer()//static method
	{
		return cstm;
	}
	public void sayHello()
	{
		System.out.println("Hello Dear Customer");
	}
	
	public void sayHow()
	{
		System.out.println("How may I help you");
	}

}
