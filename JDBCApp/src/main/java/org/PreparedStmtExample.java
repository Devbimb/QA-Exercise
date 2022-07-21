package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStmtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// PreparedStatement statement = conn.prepareStatement (INSERT INTO Customer
			// VALUES (?,?)")){
	
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
				//String query = "select * from student";// java statement
				PreparedStatement pstmt = con.prepareStatement ("select * from student where id =? or name = ? or address = ?");
				pstmt.setInt(1,107);
				pstmt.setString(2,"Upasana");
				pstmt.setString(3,"London");				
				//Statement stmt = con.createStatement(); // SQL statement
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String address = rs.getString(3);
					long phone = rs.getLong(4);
					System.out.println(id + "--" + name + "--" + address + "--" + phone);
				}
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

