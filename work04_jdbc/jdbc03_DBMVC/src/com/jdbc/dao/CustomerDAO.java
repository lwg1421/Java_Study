package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.domain.Customer;
import com.jdbc.exception.DuplicateSSNException;
import com.jdbc.exception.RecordNotFoundException;

public interface CustomerDAO {
	//공통적인 기능
	Connection getConnect() throws SQLException;
	void closeAll(Connection conn, PreparedStatement ps) throws SQLException;
	void closeAll(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException;
	
	//비지니스 로직 템플릿
	void registerCustomer(Customer vo) throws SQLException, DuplicateSSNException;
	void removeCustomer(String ssn) throws SQLException, RecordNotFoundException;
	void updateCustomer(Customer vo) throws SQLException, RecordNotFoundException;
	
	Customer getCustomer(String ssn) throws SQLException;
	ArrayList<Customer> getCustomer() throws SQLException;
}
