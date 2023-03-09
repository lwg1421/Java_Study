package com.kb.cms;

public class Bus extends Car implements Door{
	int seat;
	
	public void autoDoor(boolean flag) {
		if(flag) {
			System.out.println("open door");
		} else System.out.println("close door");
	}
	
	public void drive() {
		System.out.println("시속 90km로 달립니다~!");
	}

	@Override
	public String toString() {
		return "Bus [seat=" + seat + ", num=" + num + ", price=" + price + "]";
	}

	
	// Door 인텊페이스를 implement 했으므로 상속받은 메서드들을 여기서 구현해줘야 함!
	@Override
	public void open() {
		System.out.println("문 열림!");
	}

	@Override
	public void close() {
		System.out.println("문 닫음!");
	}
	
}
