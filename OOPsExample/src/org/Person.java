package org;
public abstract class Person {
	String name;
	int age;
	public Person() {
		//super();
		System.out.println("Person contructor called");
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	
	public final void talk(){}
	public abstract void doSomething();
	
	

}
