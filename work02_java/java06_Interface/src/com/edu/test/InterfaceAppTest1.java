package com.edu.test;


//원래 인터페이스는 public으로 지원해야함
//인터페이스 구성요소 :: 추상메소드 + static final 상수로만 구성되어 있음
interface Flyer{
	int MAX_SPEED = 200;	//public static final
	
	public abstract void fly();
	void land();	//앞에 public abstract로 지정된다.
	void take_off();
	
}

//인터페이스 Flyer를 상속한 클래스는 반드시 추상메소드들을 전부다 구현해야한다. 일종의 Override
class Bird implements Flyer{

	@Override
	public void fly() {
		System.out.println("새가 난다...");
		
	}

	@Override
	public void land() {
		System.out.println("새가 착륙한다..");
		
	}

	@Override
	public void take_off() {
		System.out.println("새가 이륙한다..");
	}
	
}



public class InterfaceAppTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
