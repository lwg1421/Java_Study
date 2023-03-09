package com.kb.sms;

import java.util.Random;
import java.util.Scanner;

public class Test4 {

	// Random 클래스 객체 생성
	static Random r = new Random();
	
	public static void main(String[] args) {
		// 키보드 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하실 금액을 입력하세요 : ");
		int cost = (sc.nextInt()/1000);
		
		
		for (int k = 1; k <= cost;k++) {
			getNumber();
		}
		
	} // end main
	
	public static void getNumber() {  // 임의의 숫자 6개를 출력하는 기능을 갖는 메서드
		System.out.print("로또 추천 번호 : ");
		for (int i = 0; i<6; i++) {
			System.out.print((r.nextInt(45)+1)+ " ");
		}
		System.out.println();
		
	}

} // end class
