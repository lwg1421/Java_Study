package com.kb.algo;

public class RecursiveTest {

	public static void main(String[] args) {
		recursive(0);
	}
	
	public static void recursive(int su) {
		if (su > 10) return;
		System.out.println(su);
		recursive(++su);
		
	}

}
