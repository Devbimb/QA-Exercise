package org.qa;

import java.util.Scanner;

public class Calculator {
	// unit1
	public static int findBig(int x, int y) 
	{
		if (x > y)
			return x;
		else
			return y;

	}

	public static int findBiggest(int i, int j, int k) 
	{
		if(i > j && j > k)
			return i;
		else if(j > i && i > k)
			return j;
		else
			return k;
		
	}
	
//	public static int findBiggest(int x, int y, int z) 
//	{
//		if (x > y && y > z)
//			return x;
//		else if (y > x && y > z)
//			return y;
//		else
//			return z;
//		
//	}
	// check the length of Credit Card Number CC number = 16
//	public static int checkCCNum(String ccNum)
////	{
////		Scanner scn=new Scanner(System.in);
////		System.out.println("enter your credit card number");
////		String ccNum1=scn.next();
////		if (ccNum1 == 16) 
////			System.out.println("Credit card number is correct");
////		else
////			System.out.println("Credit card number is invalid");
////	}
	public static int checkCCNum(String ccNum)
	{
		int ccLength = ccNum.length();
		return ccLength;
			
	}
		
// find biggest num from an array
	public static int findMax(int nums[]) {
		int max = nums[0];
		for (int i=1;i<nums.length;i++)
		{
			if(max<nums[i])
			{
				max = nums[i];
			}
		}
		return max;	
		}
		
	
}