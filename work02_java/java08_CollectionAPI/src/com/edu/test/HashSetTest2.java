package com.edu.test;

import java.net.MulticastSocket;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("F");
		set.add("A");
		set.add("B");
		set.add("A");
		set.add("C");
		
		System.out.println(set.size());//중복값을 제외하고 4개 값을 담고 있음
		System.out.println(set.toString()); //F를 먼저 넣었는데도 맨 뒤에 저장됨.
		boolean flag = set.remove("B");
		System.out.println("삭제가 잘 진행되었나요?" + flag);
		System.out.println(set);
		
		set.clear();
		System.out.println(set.toString());
	}

}
