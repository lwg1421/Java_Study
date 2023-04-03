package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.dto.Member;
import com.jdbc.exception.DuplicateSSNException;
import com.jdbc.exception.RecordNotFoundException;

//DAO 인터페이스

public interface MemberDAO  {

	//공통적인 기능
	Connection getConnect() throws SQLException;
	void closeAll(Connection conn, PreparedStatement ps) throws SQLException;
	void closeAll(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException;
	
	//비지니스 로직 템플릿
	void insertMember(Member m) throws SQLException, DuplicateSSNException;
	void deleteMember(int id) throws SQLException, RecordNotFoundException;
	void updateMember(Member m) throws SQLException, RecordNotFoundException;
	
	Member getMember(int id) throws SQLException;
	ArrayList<Member> getMember() throws SQLException;
	ArrayList<Member> getMember(String name) throws SQLException;

}
