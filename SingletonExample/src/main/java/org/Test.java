package org;

public class Test {

	public static void main(String[] args) {
		Employee.getEmployee().sayHello();
		Employee.getEmployee().sayHi();
		
		System.out.println(Employee.getEmployee());
		System.out.println(Employee.getEmployee());

		Customer.getCustomer().sayHello();
		Customer.getCustomer().sayHow();
		
		System.out.println(Customer.getCustomer());
		System.out.println(Customer.getCustomer());

	}

}