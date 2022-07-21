package qa.java.homework;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter your first name");
	String firstname=scanner.next();
	System.out.println("Hello " + firstname);
	System.out.println("Please enter your last name");
	String lastname=scanner.next();
	System.out.println("Hello " + lastname);
	System.out.println("Please enter your Age");
	int age=scanner.nextInt();
	System.out.println("You are " + age + " years old ");
	System.out.println("Hello " + firstname  +" " + lastname + "|| You are " +age+ " years");
	System.out.println("You are most welcome to my first Java code ");
	System.out.println("How may I help you? ");
	System.out.println("Please, input yes to calculate your simple interest");
	float pa = 3000;
	float ia = 5;
    int time = 2;
    float i =  (pa *ia* time)/100;
    System.out.println("short:" + i);
    System.out.println("short:" + i + pa);
   
	}

}
