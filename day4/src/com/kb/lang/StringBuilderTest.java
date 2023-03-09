package com.kb.lang;

public class StringBuilderTest {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		s2 = s1+s2;	//덧셈을 허용하지만 String은 내부적으로 상수다.
					//따라서 덧셈을 하게되면 두개의 객체가 생성되고, 두개의 객체가 제거되는 작업이 필요하다.
		
		System.out.println(s2);
		System.out.println(s1);
		
		StringBuilder sb = new StringBuilder("ABC");
		System.out.println(sb);
		sb.append("DEF");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb);
		String result = sb.toString();
		System.out.println(result);
		
	}

}
