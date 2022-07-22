package org;

public class Employee extends Person implements Artist,Player{
	int empId;
	public Employee(String name, int age,int empId) {
		//super();//calls super class contructor
		super(name,age);
		this.empId=empId;
		System.out.println("Employee contructor called");
	}
	public void doSomething() {
		System.out.println("Employees work to make their living");
	}	
	public Employee() {	
	}
	public void calculateSalary(){}
	public void play() {System.out.println("Employees can participate in games");}	
	public void doArt() {System.out.println("Employees can pursue some art as their hobbies");}
	public void doCoach() {}
	public void teachArt() {}
}
