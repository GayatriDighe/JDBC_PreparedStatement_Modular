package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Bookdao {

	public void insertData(int id, String book_name, String book_type, int book_price) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "G@yatri123!");
		
		PreparedStatement ps = c.prepareStatement("insert into book values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2,book_name);
		ps.setNString(3,book_type);
		ps.setInt(4,book_price);
		ps.executeUpdate();

		System.out.println("Record Inserted");
	}
	
	public void deleteData(int bid) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "G@yatri123!");	
		PreparedStatement ps = c.prepareStatement("delete from book where bid=?");
		ps.setInt(1, bid);
		ps.executeUpdate();

		System.out.println("Record Deleted");
		
	}
	
	public void updateData(int bid, String book_name) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "G@yatri123!");	
		PreparedStatement ps = c.prepareStatement("update book set book_name=? where bid=?");
		ps.setString(1,book_name);
		ps.setInt(2, bid);
		ps.executeUpdate();

		System.out.println("Record updated");
	}
	
	public void fetchData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "G@yatri123!");	
		PreparedStatement ps = c.prepareStatement("select * from book");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		
	}

}

