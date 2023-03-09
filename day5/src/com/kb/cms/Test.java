package com.kb.cms;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ICustMgr mgr = new CustManager();
		mgr.save(new Customer(1001,"이원근","양재동"));
		mgr.save(new Customer(1002,"이주형","구의동"));
		mgr.save(new Customer(1003,"문석진","서울시"));
		mgr.save(new VipCustomer(2001,"하재민","동작구","서초차6704"));
		mgr.save(new VipCustomer(2002,"정수경","서초구","여행","서울나6704"));

		System.out.println("======전체검색======");
		mgr.search();
		
		System.out.println("======선택검색======");
		System.out.println(mgr.search(1001));
		
		System.out.println("======주소수정======");
		mgr.update(2002, "하와이");
		System.out.println(mgr.search(2002));
		
		System.out.println("======고객삭제======");
		mgr.delete(1003);
		System.out.println(mgr.search(1003));
		
		System.out.println("======이름순정렬======");
		mgr.sortedSearch();
	}

}
