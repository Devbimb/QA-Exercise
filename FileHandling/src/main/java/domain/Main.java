package domain;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		InputAndOutputStream obj = new InputAndOutputStream();
		
		try {
			obj.copy("x.txt", "y.txt");
			System.out.println("Operation done");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
