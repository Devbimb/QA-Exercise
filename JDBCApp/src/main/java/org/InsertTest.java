package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/qa-sample";
		String userName = "root";
		// String password = "password";
		String password = "Bimbo3_96!";
		Connection con = null;
		try {
			// Connection con = DriverManager.getConnection(url,userName,password);
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection successful");
			// read operation
			// update
			// delete
			// insert
			String query = "insert into student values(112, 'Richard', 'Rome', 85799565)";// java statement
			Statement stmt = con.createStatement(); // SQL statement
			stmt.executeUpdate(query);
			System.out.println("one record inserted");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("something went wrong");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Hello Finally");

			try {
				con.close();
				System.out.println("Database connection closed, Bye bye");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// System.out.println("Inside the final catch block");
				e.printStackTrace();
			}
		}

	}
}
