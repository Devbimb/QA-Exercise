package domain;

import java.io.IOException;

public class main2 {
	
	public static void main(String[] args) {
		
		BufferReadWrite obj1 = new BufferReadWrite();
		try {
			obj1.bufferedCopy();
			System.out.println("Operation done");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}	
}
