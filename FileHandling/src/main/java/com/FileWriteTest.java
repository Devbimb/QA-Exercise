package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("x.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String content = "This is Java class for QA Employees, Upasana is the instructor of the class";
			bw.write(content);
			bw.flush();
			System.out.println("File written successfully");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
