package com.kb.lang;

public class Test {
	
	public static void main(String[] args) {
		int i = 0;
		i = i+3;
		
		int[] su = new int[3];
		System.out.println(su[0]);
		
		String s1 = new String("ABC");  //객체로 문자열 생성
		String s2 = new String("ABC");	//객체로 문자열 생성
		String s3 = "ABC";  //상수로 문자열 생성
		String s4 = "ABC";	//상수로 문자열 생성
		
		System.out.println(s1 ==s2); //false	위치값이 다름
		System.out.println(s1.equals(s2)); //true	실제 저장된 값이 같음
		
		System.out.println(s3 == s4);  //true	상수풀이프로 같은 값은 같은 값으로 덮어씌어지므로 위치가 같음
		System.out.println(s3.equals(s4));  //true	// 실제 저장된 값이 같음
	}

}
