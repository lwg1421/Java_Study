package com.kb.sms;

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		s.num = 1001;
		s.name = "kim";
		s.study();
		s.work(5);
		
		Student s2 = new Student();
		s2.num = 1002;
		s2.name = "lee";
		s2.study();
		s2.work(3);
		
		Student.study();

		Student s3 = new Student(17,"이원근");
		System.out.println(s3.name);
		s3.work(4);
	}

}
