package com.kb.sms;

import java.util.Random;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 키보드 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("구매하실 금액을 입력하세요 : ");
		int cost = (sc.nextInt()/1000);
		
		// Random 클래스 객체 생성
		Random r = new Random();
		
		for (int k = 1; k <= cost;k++) {
			System.out.print(k+"번째 로또 추천 번호 : ");
			for (int i = 0; i<6; i++) {
				System.out.print((r.nextInt(45)+1)+ " ");
			}
			System.out.println();
		}
		
		
	}

}
