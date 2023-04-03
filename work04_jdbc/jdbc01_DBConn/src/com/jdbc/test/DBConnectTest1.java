package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectTest1 {

	public static void main(String[] args) {
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); //FQCN
			System.out.println("1. Driver loading......Success...");
			
			//2. DB 연결
			//인자값 순서 (디비서버 주소, 계정, 비번)
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "kb_db", "1234");
            System.out.println("2. DB Connect...Success");

            // 3. CRUD 작업... DB 서버와 연결이 이뤄져야만 가능...
            //PreparedStatement 객체생성
            String query = "INSERT INTO custom(id,name,address) VALUES(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            System.out.println("3. PreparedStatement...Creating..");
            
            //?에 대한 값 바인딩
            ps.setInt(1,333);	//첫번째 인자는 몇번째 인자인지를 의미, 두번째 인자는 넣을 값
            ps.setString(2, "이정재");	//넣을 데이터의 형태에 따라 setInt, setString 등등..
            ps.setString(3, "신사동");
            
            //진자 쿼리문이 실행 executeUpdate()
            System.out.println(ps.executeUpdate() + " row INSERT OK~~!");
            
        } catch (ClassNotFoundException e) {
            System.out.println("1. Driver Loading...Fail");
        } catch (SQLException e) {
            System.out.println("2. DB Connect...Fail");
        }
    }
}
