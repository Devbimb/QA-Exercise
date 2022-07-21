package org;

import java.util.Scanner;

public class methods{
	public static void action1() {
		System.out.println("Hello");
	}
	
	public static void action2() {
		System.out.println("Hello World");
	}
	
	public static void action3() {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter first name");
		String fName=scn.next();
		System.out.println("enter last name");
		String lName=scn.next();
		String fullName=fName+" "+lName;
		System.out.println("Hello "+fName+" "+lName);
		System.out.println("Hello "+fullName);
		
	}
	public static int action4() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter amount");
		int amount = scn.nextInt();
		System.out.println("Enter rate");
		int rate = scn.nextInt();
		System.out.println("Enter time");
		int time = scn.nextInt();
		int simInt = amount * rate * time / 100;
		int finalAmt = amount + simInt;
		//System.out.println(simInt);
		//System.out.println(finalAmt);
		return finalAmt;
	}
	//Execution Point
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="John";
		action1();
		action2();
		action3();
		//action4();
		int z=action4();
		System.out.println(action4());
		System.out.println(z);

	}

}
