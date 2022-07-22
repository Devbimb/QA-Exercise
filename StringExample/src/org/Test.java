package org;

public class Test {

	public static void main(String[] args) {
		String str="Hello World";
		str=str+" how are you";
		str=str+" nice to meet you";
		
		System.out.println(str);
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf("nice"));
		System.out.println(str.concat(" I am from India"));
		System.out.println(str.replace("nice", "glad"));
		System.out.println(str.contains("nice"));
		System.out.println(str.substring(10,15));
		String name1="Upasana";
		String name2="Upasana";
		System.out.println(name1.equals("Upasana"));
		
		if(name1==name2)
		{
			System.out.println("String are equal");
		}
		else
			System.out.println("String are not equal");
		

	}

}
