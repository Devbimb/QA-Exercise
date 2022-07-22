package org;

public class Sample {

	public static void main(String[] args) {
		int x=10;
		x +=x;//x=x+x
		System.out.println(x);
		int y=20;
		y -=y; y=y-y;
		System.out.println(y);
		
		int a=100;
		System.out.println(a);//100
		System.out.println(a++);//101
		System.out.println(++a);//102
		int b=a++;//102++   103
		int c=++a; 
		System.out.println(b);
		System.out.println(c);
		int d=a;
		System.out.println(d);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(22%3);

	}

}
