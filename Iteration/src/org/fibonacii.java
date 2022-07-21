package org;

public class fibonacii {
	
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
    	int n3;
		System.out.println(n1+n2);
		for(int i = 2; i < 50; i++) 
		{
			n3 = n1 + n2;
			System.out.println(","+ n3);
			n1 = n2;
			n2 = n3;
//			}
//			if(i==2) {
//				continue;
//			}
//			if(i==7) {
//				break;
			}
		}
}
//0,1,1,2,3,5,8,13,21