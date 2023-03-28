package com.edu.test;

class SuperAA{
	public static final int BASIC_SALARY = 3000000;		//상수
	public final String test() {	//Overriding금지
		return "Overriding 금지";
	}
	
}

final class SuperA{		//상속금지
	
}

//final로 지정한 클래스는 상속 불가!
//class Child extends SuperA{
//	
//}

class ChildA extends SuperAA{
	//상수값은 변경 불가!
//	BASIC_SALARY = 1000;	
	
	//부모 클래스를 상속받았어도 final 메서드 Overriding은 불가!
//	public final String test() {
//		String name = "Jamse";
//		return name;
//	}
}

public class FinalExamTest2 {

	public static void main(String[] args) {
		
	}

}
