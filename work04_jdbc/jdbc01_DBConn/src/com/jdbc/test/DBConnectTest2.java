package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectTest2 {

	public static void main(String[] args) {
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); //FQCN
			System.out.println("1. DB loading...Success!!");
			
			//2. 디비연결...Connection 반환
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "kb_db", "1234");
			System.out.println("2. DB Connection...Success!!");
			
			//3. preparedStatement 객체 생성. 이때 인자값으로 쿼리문이 들어감
			String query = "DELETE FROM custom WHERE ID = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, 333);
			
			//4. 쿼리문 실행
			System.out.println(ps.executeUpdate() + " DELETE Success...!!!");
			
		} catch (ClassNotFoundException e) {
            System.out.println("1. Driver Loading...Fail");
        } catch (SQLException e) {
            System.out.println("2. DB Connect...Fail");
        }
    }
}
