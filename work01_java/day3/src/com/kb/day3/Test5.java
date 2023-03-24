package com.kb.day3;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		int[] su = new int[2];
		su[1] = 30;
		System.out.println(su[1]);
		
		MyDate[] md = new MyDate[5];
		md[0] = new MyDate(3,24);
		md[1] = new MyDate(4,21);
		md[2] = new MyDate(5,5);
		md[3] = new MyDate(5,15);
		md[4] = new MyDate(5,29);
		System.out.println(Arrays.toString(md));
		
		for (MyDate data : md) {
			System.out.print(data);
		}
		
		// 5월만 출력하고 싶다면?
		for (MyDate data : md) {
			if (data.month == 5) {
				System.out.println(data);
			}
			
		}
	}


}
