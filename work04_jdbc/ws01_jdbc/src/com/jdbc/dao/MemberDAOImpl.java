package com.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.dto.Member;
import com.jdbc.exception.DuplicateSSNException;
import com.jdbc.exception.RecordNotFoundException;

import config.ServerInfo;

//DAO 기능 구현

public class MemberDAOImpl implements MemberDAO{
	
	private static MemberDAOImpl dao = new MemberDAOImpl();
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {
		return dao;
	}

	@Override
	public Connection getConnect() throws SQLException {
		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASS);
		System.out.println("DB Connection...OK");
		return conn;
	}

	@Override
	public void closeAll(Connection conn, PreparedStatement ps) throws SQLException {
		if(ps != null) {	//객체가 만들어져있을 경우에만 닫도록
			ps.close();
		}
		if(conn != null) {
			conn.close();
		}
		
	}

	@Override
	public void closeAll(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException {
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

	private boolean idExist(int id, Connection conn) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		conn = getConnect();
		String query = "SELECT * FROM member WHERE id = ?";
		ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		return rs.next();
	}
	
	@Override
	public void insertMember(Member m) throws SQLException, DuplicateSSNException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
			if (!idExist(m.getId(),conn)) {
				String query = "Insert INTO member(id, name, email, phone) VALUES(?,?,?,?)";
				ps = conn.prepareStatement(query);
				ps.setInt(1, m.getId());
				ps.setString(2, m.getName());
				ps.setString(3, m.getEmail());
				ps.setString(4, m.getPhone());
				System.out.println(ps.executeUpdate()+"row INSERT OK ~~~!");
			} else { //ssn이 있다면
				throw new DuplicateSSNException("이미 존재하는 고객입니다.");
			}
		}finally {
			closeAll(conn,ps);
		}
		
	}

	@Override
	public void deleteMember(int id) throws SQLException, RecordNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
			if (idExist(id,conn)) { //삭제할 대상이 있다면 업데이트
			
			String query = "DELETE FROM member WHERE id = ?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			System.out.println(ps.executeUpdate()+"row DELETE OK ~~~!");
			} else { //업데이트 할 대상이 없다면
				throw new RecordNotFoundException("삭제할 대상이 없습니다.");
			}
		} finally {
			closeAll(conn,ps);
		}
	}

	@Override
	public void updateMember(Member m) throws SQLException, RecordNotFoundException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
			if (idExist(m.getId(),conn)) { //업데이트할 대상이 있다면 업데이트
				
			
			String query = "UPDATE member SET name = ?, email = ?, phone = ? WHERE id = ?";
			ps = conn.prepareStatement(query);
			ps.setString(1, m.getName());
			ps.setString(2, m.getEmail());
			ps.setString(3, m.getPhone());
			ps.setInt(4, m.getId());
			
			System.out.println(ps.executeUpdate()+"row update OK ~~~!");
			} else { //업데이트 할 대상이 없다면
				throw new RecordNotFoundException("존재하지 않는 고객입니다.");
			}
		} finally {
			closeAll(conn,ps);
		}
		
	}

	@Override
	public Member getMember(int id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Member member = null;
		try {
			conn = getConnect();
			String query = "SELECT * FROM member WHERE id = ?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				member = new Member(id,
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phone"));
			}
			
		} finally {
			closeAll(conn,ps,rs);
		}
		return member;
	}

	@Override	//전체 목록 보기
	public ArrayList<Member> getMember() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Member> members = new ArrayList<>();
		try {
			conn = getConnect();
			String query = "SELECT * FROM member";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				members.add(new Member(rs.getInt("id"),
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phone")));
			}
		}finally {
			closeAll(conn,ps,rs);
		}
		return members;
	}



	@Override	//동명이인 목록 가져오기
	public ArrayList<Member> getMember(String name) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Member> members = new ArrayList<>();
		try {
			conn = getConnect();
			String query = "SELECT * FROM member where name = ?";
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			rs = ps.executeQuery();
			while(rs.next()) {
				members.add(new Member(rs.getInt("id"),
						rs.getString("name"),
						rs.getString("email"),
						rs.getString("phone")));
			}
		}finally {
			closeAll(conn,ps,rs);
		}
		return members;
	}


}
