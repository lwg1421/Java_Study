package com.kb.sms;

public class Student {
	
	int num;
	String name;
	
	static void study() {
		System.out.println("공부중");
	}
	
	
	// 재귀호출
	void work(int time) {
		if (time ==0) return;
		System.out.println(time+"시간동안 알바중..");
		work(--time);
	}
	
	public Student() {
		
	}
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}

}
