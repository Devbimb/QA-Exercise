package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String url = "jdbc:mysql://localhost:3306/qa-sample";
			String userName = "root";
			// String password = "password";
			String password = "Bimbo3_96!";
						
			//try with resource
			try (Connection con = DriverManager.getConnection(url,userName,password);
					Statement stmt =con.createStatement();){
				System.out.println("Connection successful");
				String query = "select * from student";// java statement
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) 
				{
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String address = rs.getString(3);
					long phone = rs.getLong(4);
					System.out.println(id + "--" + name + "--" + address + "--" + phone);
				}
				rs.close();
				stmt.close();
				
			}   catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("something went wrong");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

	}

}
