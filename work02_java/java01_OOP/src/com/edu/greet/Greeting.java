package com.edu.greet;

/*특정 대상에게
다양한 인사말을 출력하는 정보를 가지는 클래스*/

public class Greeting {
	//필드 : 클래스 바로 밑에 선언이 되어야 함
	public String target;
	public String message;
	
	//기능 정의
	public String sayHello() {
		return target + ", " + message + "~~~!";
	}
}
