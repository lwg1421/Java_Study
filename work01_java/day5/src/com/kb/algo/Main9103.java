package com.kb.algo;

import java.util.Scanner;

public class Main9103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		int result = fun(su);
		System.out.println(result);
		
	}
	
	public static int fun(int su) {
		if (su <=1) {
			return 1;
		} else {
			return su *fun(--su);
		}
	}
}
