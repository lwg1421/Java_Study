package com.kb.sms;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		// Random 클래스 객체 생성
		Random r = new Random();
		System.out.println("정수값 랜덤 생성");
		for (int i = 0; i<6; i++) {
			System.out.println((i+1)+"번째 : "+(r.nextInt(45)+1));
		}
		
	}

}
