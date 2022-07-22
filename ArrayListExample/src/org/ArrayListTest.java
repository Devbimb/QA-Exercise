package org;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		String name="upasana";
		Employee emp=new Employee();
		Book book=new Book();
		book.bId=1001;
		book.title="The Partner";
		book.price=15.00f;
		book.publisher="XYZ";
		book.category="Novel";
		//System.out.println(book.toString());
		Book book1=new Book();
		book1.bId=1002;
		book1.title="The firm";
		book1.price=16.00f;
		book1.publisher="ABC";
		book1.category="Novel";
	
		
		Book book2=new Book();
		Book book3=new Book();
		
		Customer cust=new Customer();
		ArrayList myArray=new ArrayList(10);//any object
		myArray.add(name);
		myArray.add("Ben");
		myArray.add(emp);
		myArray.add(cust);
		myArray.add(book);
		myArray.add(324336); //Integer x=new Integer(234567);
		myArray.add(true);
		
		ArrayList<String> myString=new ArrayList();//any object
		myString.add("Upasana");
		myString.add("Alex");
		myString.add("Ludo");		
		myString.add(0, "Richard");
		//System.out.println(myString);
		myString.remove(2);
		//System.out.println(myString);		
		//System.out.println(myString);
		//System.out.println(myString.get(2));
		//System.out.println(myString.size());
		
		
		ArrayList<Book> myBooks=new ArrayList();
		myBooks.add(book1);
		myBooks.add(book3);
		myBooks.add(book2);
		myBooks.add(book);
		System.out.println(myBooks);
		for(Book b:myBooks)
		{
			System.out.println(b);
		}
		
		
		
		
		ArrayList<Integer> myNums=new ArrayList();
		

	}

}
