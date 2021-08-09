package com.jdbc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JdbcSelect {

	public static void main(String[] args) throws SQLException {
		
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			System.out.print("SQL문을 입력해주세요! >>> ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			conn = DriverManager.getConnection(dburl,"c##kmsbabo","1234");
			String query = br.readLine();
			
			pst = conn.prepareStatement(query); 
			rs = pst.executeQuery(); // Statement를 상속받고 고유한 기능 사용.
			
			while(rs.next()) {
				
				for (int i = 1; i<30; i++) {
					try {
					System.out.print(rs.getString(i) + "\t");
					} catch(SQLException e) {
						break;
					}
				}
				System.out.println();
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			rs.close();
			pst.close();
			conn.close();
		}
		
		
		
	}

}
