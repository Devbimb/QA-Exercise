package org;

import java.util.Scanner;

public class ConditionalFlowchart {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your value");
		String value=scanner.next();
			//int A = 2000;
		
		if(value > 2000) {
            System.out.println("value is less than or equal to 20");
        } else if(number < 40) {
            System.out.println("Number is between 20 and 40");
        } else {
            System.out.println("Number is greater than or equal 40");

		switch(A) {
			case 1:
				System.out.println("Monday you can fall apart");
                break;
			else if(x>20)
			{
				System.out.println("x is greater than 20");
			}
			else if(x != 20)
				System.out.println("x is not 20");
			else
				System.out.println("x is 20");
		}

	}
		
		
	case 2:
        System.out.println("Tuesday,");
        break;
    case 3:
        System.out.println("Wednesday break my heart");
        break;
    case 4:
        System.out.println("Oh, Thursday doesn't even start");
        break;
    case 5:
        System.out.println("It's Friday I'm in love");
        break;
    case 6:
        System.out.println("Saturdaaaay wait");
        break;
    case 7:
        System.out.println("Sunday always comes too late");
        break;
    default:
        System.out.println("You need to listen to The Cure");
        break;
}
}
}