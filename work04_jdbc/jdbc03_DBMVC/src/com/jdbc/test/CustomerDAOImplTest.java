package com.jdbc.test;

import java.util.ArrayList;

import com.jdbc.dao.CustomerDAOImpl;
import com.jdbc.domain.Customer;

import config.ServerInfo;

public class CustomerDAOImplTest {

	public static void main(String[] args) {
		CustomerDAOImpl dao = CustomerDAOImpl.getInstance();
//		try {
////			dao.registerCustomer(new Customer("111","제임스","보스톤"));
////			dao.registerCustomer(new Customer("333","제임스","보스톤"));
////			dao.updateCustomer(new Customer("222","이원근","서초동"));
////			dao.removeCustomer("333");
////			System.out.println(dao.getCustomer("222").getName());
//			
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		try {
			ArrayList<Customer> list = dao.getCustomer();
			for(Customer c : list)System.out.println(c);
		}catch(Exception e) {
			
		}
	}
	
	static {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println("Driver Loading...ok");
		}catch(Exception e) {
			System.out.println("Driver Loading...fail");
		}
	}
	

}
