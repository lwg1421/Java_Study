package com.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.ServerInfo;

//비지니스로직 : DB에 접근하는 로직 (SQL이 동작함)
public class CustomerDAO {
	public CustomerDAO() {
		System.out.println("DAO Creating...");
	}
	
	//공통적인 로직 뽑기
	private Connection getConnect() throws SQLException{
		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASS);
		System.out.println("DB Connection...OK");
		return conn;
	}
	
	//closeAll : 닫는 함수 (인자값 두개)
	private void closeAll(Connection conn, PreparedStatement ps) throws SQLException{
		if(ps != null) {	//객체가 만들어져있을 경우에만 닫도록
			ps.close();
		}
		if(conn != null) {
			conn.close();
		}
	}
	
	//closeAll 닫는 함수오버로딩 (인자값 세개)
	private void closeAll(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException{
		if(ps != null) {	//객체가 만들어져있을 경우에만 닫도록
			ps.close();
		}
		if(conn != null) {
			conn.close();
		}
		if(rs != null) {
			rs.close();
		}
	}
	
	//DML, SELECT SQL이 각각의 기능에서 작동하도록 비지니스로직을 정의
	public void addCustomer(String ssn, String name, String addr) throws SQLException{
		Connection conn = null;
        PreparedStatement ps = null;
		//insert into
		try {
			conn = getConnect();
			
			String query ="INSERT INTO customer (ssn, name, address) VALUES(?,?,?)";
            ps=  conn.prepareStatement(query);
            ps.setString(1, ssn);
            ps.setString(2, name);
            ps.setString(3, addr);
			
			int row  = ps.executeUpdate();
			System.out.println(row + "row INSERT OK..!");
			
		} finally {
			closeAll(conn, ps);
		}
	}
	public void removeCustomer(String ssn)throws SQLException {
		Connection conn = null;
        PreparedStatement ps = null;
		//delete
		try {
			conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASS);
			System.out.println("DB Connection...OK!");
			
			String query ="DELETE FROM customer WHERE ssn = ?";
            ps=  conn.prepareStatement(query);
            ps.setString(1, ssn);
			
			int row  = ps.executeUpdate();
			System.out.println(row + "row INSERT OK..!");
			
		} finally {
			closeAll(conn, ps);
		}
	
		
	}
	public void updateCustomer(String ssn, String name, String addr) throws SQLException{
		//update set
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = getConnect();
			String query = "UPDATE customer SET name = ?, address = ? WHERE ssn = ?";
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, addr);
			ps.setString(3, ssn);
			
			int row = ps.executeUpdate();
			System.out.println(row + "row update....!");
		} finally {
			
		}
	}
	public void printAllCustomer() throws SQLException{
		//Select
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = getConnect();
			String query = "SELECT * FROM customer";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ssn") + "\t"
						+ rs.getString("name")+"\t"
						+ rs.getString("address"));
			}
		} finally {
			closeAll(conn, ps, rs);
		}
	}
}
