package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class Jdbc1 {

	public static void main(String[] args) throws SQLException {
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(dburl, "hr","hr");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * from tabs");
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
		rs.close();
		stmt.close();
		conn.close();
		
	}

}
