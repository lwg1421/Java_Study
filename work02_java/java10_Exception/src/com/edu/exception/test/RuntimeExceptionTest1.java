package com.edu.exception.test;

public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		String[] str = {
			"Hello",
			"No, I mean it",
			"Nice to meet you",
		};
		int i = 0;
		while(i<=3) {
			System.out.println(str[i]);
			i++;
		}
		
		System.out.println("while looping end...");
	}

}
