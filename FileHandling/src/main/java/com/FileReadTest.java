package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("x.txt"); // to read the file
			BufferedReader br = new BufferedReader(fr);
			int data = br.read(); // perform read on file, it read ascii value of the characters
			while(data != -1)// run loopwhile it is not end of file
			{
				System.out.print((char)data); //change ascii value of characters to character. 
											 //note: don't use println, it will print it out vertically
				data = br.read();
			}
	
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
