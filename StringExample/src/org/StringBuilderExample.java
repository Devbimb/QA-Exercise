package org;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(100);
		sb.append("Upasana");
		sb.append(" hello");
		sb.append(" how are you");
		sb.insert(7," Dew");
		System.out.println(sb);
		System.out.println(sb.reverse());
		sb.insert(7," Dew");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		

	}

}
