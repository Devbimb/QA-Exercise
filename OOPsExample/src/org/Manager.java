package org;

public class Manager extends Employee {
	String dept;

	public Manager(String name, int age,int empId,String dept) {
		//super();//calls super class contructor
		super(name,age,empId);
		this.dept=dept;
		System.out.println("Manager contructor called");
	}
	public Manager() {}
	@Override
	public void calculateSalary()
	{
		
	}
}
