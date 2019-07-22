package com.accolite.au.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class JDBCAssignment {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Map<Integer, Book> insertmap = new HashMap<>();
		Map<Integer, Book> updatemap = new HashMap<>();
		Map<Integer, Book> deletemap = new HashMap<>();
		
		//Creating 3 maps viz insert, update and delete 
		insertmap.put(1, new Book(1, "Norwegian Wood", 450, "Murakami"));
		insertmap.put(2, new Book(2, "Da Vinci Code", 350, "Dan Brown"));
		insertmap.put(3, new Book(3, "Revolution 2020", 650, "Chetan Bhagat"));
		insertmap.put(4, new Book(4, "How to kill a mocking bird", 550, "Harper Lee"));

		updatemap.put(1, new Book(1, "Norwegian Wood", 450, "Murakami"));
		updatemap.put(2, new Book(2, "Da Vinci Code", 350, "Dan Brown"));
		updatemap.put(3, new Book(3, "Revolution 2020", 650, "Chetan Bhagat"));
		updatemap.put(4, new Book(4, "How to kill a mocking bird", 550, "Harper Lee"));

		deletemap.put(1, new Book(1, "Norwegian Wood", 450, "Murakami"));
		deletemap.put(2, new Book(2, "Da Vinci Code", 350, "Dan Brown"));
		deletemap.put(3, new Book(3, "Revolution 2020", 650, "Chetan Bhagat"));
		deletemap.put(4, new Book(4, "How to kill a mocking bird", 550, "Harper Lee"));

		Connection con = null;
		Statement statement = null;

		Class.forName("com.mysql.jdbc.Driver");
		try {
			//Establish connection with database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bookdatabase?useSSL=false", "root", "root");

			statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CLOSE_CURSORS_AT_COMMIT);

			// Batch insert operation of data in insertmap
			for (Map.Entry<Integer, Book> entry : insertmap.entrySet()) {
				int key = entry.getKey();
				Book bookobj = entry.getValue();
				String author = bookobj.getAuthorName();
				String bookname = bookobj.getName();
				int price = bookobj.getPrice();
				statement.addBatch(
						"insert into Book values( " + key + ",'" + author + "','" + bookname + "'," + price + ")");

			}

			// Batch update operation of Data in updatemap
			int key1 = 3;
			int key2 = 4;
			Book bookobj1 = updatemap.get(key1);
			Book bookobj2 = updatemap.get(key2);
			int price1 = bookobj1.getPrice() + 200;
			int price2 = bookobj2.getPrice() + 200;

			// Batch delete operation of data in deletemap
			statement.addBatch("update Book set price = " + price1 + " where book_id = " + key1);
			statement.addBatch("update Book set price = " + price2 + " where book_id = " + key2);

			statement.addBatch("delete from Book where book_id = " + key1);
			statement.addBatch("delete from Book where book_id = " + key2);

			int[] records = statement.executeBatch();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null)
				con.close();
			if (statement != null)
				statement.close();
		}

	}
}
