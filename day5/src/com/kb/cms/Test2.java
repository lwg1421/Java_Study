package com.kb.cms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<String> ss = new ArrayList<>();
		ss.add("kim");
		ss.add("Lee");
		ss.add("Kang");
		ss.add("Bae");
		
		Collections.sort(ss);	//데이터가 Collection일 경우 데이터를 정렬
		for(String s : ss) {
			System.out.println(s);
		}
		
		System.out.println("===========배열===========");
		String[] s2 = {"Kim","Lee","Kang","Bae"};
		Arrays.sort(s2);    // 데이터가 배열일 경우 정렬
		for(String s : s2) {
			System.out.println(s);
		}
		System.out.println(Arrays.toString(s2));
	}

}
