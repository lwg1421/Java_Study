package com.kb.cms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustManager implements ICustMgr {
	List<Customer> cs = new ArrayList<>();
	// 저장
	@Override
	public void save(Customer c) {
		cs.add(c);
	}
	
	// 검색
	@Override
	public void search() {
		for(Customer c : cs) {
			System.out.println(c);
		}
	}
	
	// 이름으로 정렬. Comparable을 구현하여 사용
	public void sortedSearch() {
//		Collections.sort(cs);
		Collections.sort(cs, new MyComparator("주소"));
		for(Customer c : cs) {
			System.out.println(c);
		}
	}
	
	
	// 상세검색
	@Override
	public Customer search(int num) {
		Customer result = null;
		for (Customer c : cs) {
			if (c.num == num) {
				result = c;
				break;
			}
		}
		return result;
	}
	
	// 고객 주소수정
	@Override
	public void update(int num, String address) {
		for(Customer c : cs) {
			if (c.num == num) {
				c.address = address;
			}
		}
	}
	
	
	
	//삭제
	@Override
	public void delete(int num) {
		for (Customer c : cs) {
			if(c.num == num) {
				cs.remove(c);
				break;
			}
		}
	}

}
