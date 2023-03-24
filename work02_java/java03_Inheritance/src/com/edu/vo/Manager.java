package com.edu.vo;

import com.edu.util.Mydate;

/*
Manager에 대한 정보를 저장하는 클래스
1. private으로 필드 선언
2. public으로 값이 주입되는 통로를 만든다 (생성자 또는 setter()에서 만듦)
3. public으로 주입된 값을 반환하는 기능
*/

public class Manager extends Employee {
	//필드 : 무조건 private로 지정한다.
	//데이터는 소중하기 때문에 다른 클래스에서 함부로 접근하지 못하도록 차단.
	
	private String dept;
	
	public Manager() {
		super();
	}
	
	//명시적 생성자
	//Test 클래스에서 생성자를 호출하는 시점에 값이 field에 주입됨
	public Manager(String name, Mydate birthdate, double salary, String dept) {
		//무조건 부모 생성이 무조건 일어남
		//자식 생성자를 만들기 위해서는 부모 생성자를 먼저 만들어야함
		super(name,birthdate,salary);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + "," + this.dept;
	}
	
	
	
	
}//class