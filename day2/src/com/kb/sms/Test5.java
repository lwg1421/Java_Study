package com.kb.sms;

import java.util.Random;

public class Test5 {

	public static void main(String[] args) {
		// 객체 사용법 1 - 인스턴스 메서드일 경우
		Random r = new Random();
		int num = r.nextInt();
		System.out.println(num);
		
		// 객체 사용법 2 - static 메서드일 경우 : class명.메서드명()
		int a = Math.abs(-34);	// abs : 절댓값
		System.out.println(a);
		System.out.println(Math.random()); // random : 0~1사이의 임의값 (0은 포함하고, 1은 포함하지 않음)
		
		String b = "123";
		try {
			int bb = Integer.parseInt(b);	// Integer 클래스의 parseInt메서드 : 문자형을 정수형으로 바꿔줌
			double bbb = Double.parseDouble(b);	// Double 클래스의 parseDouble 메서드 : 문자형을 실수형으로 바꿔줌
			System.out.println(bb);
			System.out.println(bbb);
		} catch (Exception e) {
			System.out.println("형변환이 불가합니다.");
		}
		
	}

}
