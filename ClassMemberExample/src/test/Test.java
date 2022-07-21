package test;

import Domain.Book;
import Domain.Customer;
import Domain.Staff;

public class Test {
	public static void main (String[] args) {
		Customer c1 = new Customer(); //creating a customer object1
		c1.cId = 1001;
		c1.name = "David";
		c1.address = "UK";
		c1.email = "d@gmail.com";
		c1.show();
		Customer c2 = new Customer(); //
		c2.cId = 1002;
		c2.name = "Ron";
		c2.address = "US";
		c2.email = "r@gmail.com";
		c2.show();
		Book b1 = new Book(); //
		b1.bId = 1001;
		b1.title = "David";
		b1.price = 12.00f;
		b1.author = "d@gmail.com";
		b1.show();
		Staff s1 = new Staff(); //
		s1.sId = 1001;
		s1.Desgn = "Admin";
		s1.salary = 12.00f;
		s1.phone = 0;
		s1.show();
	}
}

