package com.jdbc.test;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.ServerInfo;

public class DBConnectTest4 {
	
	public DBConnectTest4() throws ClassNotFoundException, SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//1. 드라이버 로딩
			Class.forName(ServerInfo.DRIVER_NAME); //FQCN
			System.out.println("1. DB loading...Success!!");
			
			//2. 디비연결...Connection 반환
			conn = DriverManager.getConnection(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASS);
			System.out.println("2. DB Connection...Success!!");
			
			//3. preparedStatement 객체 생성. 이때 인자값으로 쿼리문이 들어감
			String query = "SELECT id, name, address FROM custom";
			ps = conn.prepareStatement(query);
			
			//4. 쿼리문 실행
			rs = ps.executeQuery();
			while(rs.next()) {	//resultset에 값이 하나라도 있으면 계속 반복
				System.out.println(rs.getInt(1) + "\t" +
									rs.getString("name") + "\t" + 
									rs.getString(3));
			}//while
		} finally {	//연 순서의 반대로 닫아준다.
			rs.close();
			ps.close();
			conn.close();
		}
		
		
		
	}//생성자

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBConnectTest4 dt= new  DBConnectTest4();
		
	}
}
