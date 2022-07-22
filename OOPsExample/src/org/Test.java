package org;

public class Test {

	public static void main(String[] args) {
		//Person p=new Person();	
		Employee e=new Employee();
		Manager m1=new Manager();
		
		Person p1=new Employee();
		Person p2=new Student();
		p1.doSomething();
		p2.doSomething();
		
		Employee e1=new Manager();			
		Manager m=new Manager("Upasana",32,1001,"Training");
		//m.talk();
		//m.calculateSalary();
		Artist a=new Employee();
		Player pp=new Employee();
	}
}
