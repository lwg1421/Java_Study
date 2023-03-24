package com.kb.lang;

public class MathTest {

	public static void main(String[] args) {
		int su1 = -37;
		System.out.println(Math.abs(su1));
		
		double su2 = 34.5678;
		su2 = su2*100;
		System.out.println(Math.round(su2)/100.0);
		
		String a = "929";
		System.out.println(Integer.parseInt(a)+1);
		System.out.println(a+1);
	}

}
