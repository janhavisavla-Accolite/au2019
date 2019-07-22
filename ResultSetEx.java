package com.accolite.au.java;

import java.sql.*;

public class ResultSetEx {
	public static void main(String args[]) {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			// Establish connection with database Bookdatabase
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bookdatabase?useSSL=false",
					"root", "root");
			Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);

			ResultSet rs = stmt.executeQuery("SELECT * FROM Book");

			// Move to the last row where you want to insert
			rs.moveToInsertRow();
			rs.updateInt("book_id", 6);
			rs.updateString("author", "Sidney Sheldon");
			rs.updateString("bookname", "If tomorrow comes");
			rs.updateInt("price", 100);
			rs.insertRow();

			// Move result pointer back to beginning
			rs.moveToCurrentRow();

			rs.moveToInsertRow();
			rs.updateInt("book_id", 7);
			rs.updateString("author", "Jeffery Archer");
			rs.updateString("bookname", "Kane and Abel");
			rs.updateInt("price", 500);
			rs.insertRow();
			rs.moveToCurrentRow();

			int i = 0;
			rs.next();
			// Update price of first 2 books
			while (i < 2) {
				int price = rs.getInt("price");
				int newprice = price + 500;
				rs.updateInt("price", newprice);
				rs.updateRow();
				rs.next();
				i++;
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}