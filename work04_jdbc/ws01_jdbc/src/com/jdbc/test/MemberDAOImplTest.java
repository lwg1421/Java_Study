package com.jdbc.test;

import java.util.ArrayList;

import com.jdbc.dao.MemberDAOImpl;
import com.jdbc.dto.Member;

import config.ServerInfo;

public class MemberDAOImplTest {

	public static void main(String[] args) {
		MemberDAOImpl dao = MemberDAOImpl.getInstance();
		try {
//			dao.insertMember(new Member(1,"이원근","lwg1421@naver.com","010-6776-1421"));
//			dao.insertMember(new Member(4,"이원근","kkkkkk@naver.com","010-0000-9999"));
//			dao.insertMember(new Member(3,"문석진","msg@naver.com","010-9999-8888"));
//			dao.deleteMember(2);
//			dao.updateMember(new Member(2,"노승욱","nnn@naver.com","010-7777-1111"));
//			System.out.println(dao.getMember(1));
//			ArrayList<Member> list = dao.getMember();
//			for(Member m : list) {
//				System.out.println(m);
//			}
			
			ArrayList<Member> list = dao.getMember("이원근");
			for(Member m : list) {
				System.out.println(m);
			}
			
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
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
