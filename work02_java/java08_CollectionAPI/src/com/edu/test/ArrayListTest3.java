package com.edu.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("F");
		list.add("B");
		list.add("B");
		list.add("F");
		list.add("C");
		
		System.out.println(list);
		
		//1. B를 삭제 : index값으로 삭제
		System.out.println(list.remove(1) + "데이터 삭제 성공!");
		System.out.println(list);
		
		
		//2. B를 삭제 : 객체 값 그대로 삭제
		list.remove("B");
		
		//3. 첫번째 자리에 HH를 추가
		list.add(0, "HH");
		
		//4. 세번째 데이터 값을 출력
		System.out.println(list.get(2));
	}

}
