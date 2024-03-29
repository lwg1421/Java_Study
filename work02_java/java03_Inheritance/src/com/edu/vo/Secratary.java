package com.edu.vo;

import com.edu.util.Mydate;

/*
Manager에 대한 정보를 저장하는 클래스
1. private으로 필드 선언
2. public으로 값이 주입되는 통로를 만든다 (생성자 또는 setter()에서 만듦)
3. public으로 주입된 값을 반환하는 기능
*/

public class Secratary extends Employee{

	private String bossOfName;

	
	/*
	 * 자식 생성자 첫 라인에서 
	 * 부모 생성자 호출이 무조건 일어난다.
	 * super();
	 * 또는 super(o,o,o);
	 */
	
	public Secratary() {
		super();
	}
	
	//명시적 생성자
	//Test 클래스에서 생성자를 호출하는 시점에 값이 field에 주입됨
	public Secratary(String name, Mydate birthdate, double salary, String bossOfName) {
		super(name, birthdate, salary);
		this.bossOfName = bossOfName;
	}

	public String getBossOfName() {
		return bossOfName;
	}

	public void changeBossOfName(String bossOfName) {
		this.bossOfName = bossOfName;
	}
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails() + "," + this.bossOfName;
	}

	
	
}
