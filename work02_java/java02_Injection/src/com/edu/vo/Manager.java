package com.edu.vo;

import com.edu.util.Mydate;

/*
Manager에 대한 정보를 저장하는 클래스
1. private으로 필드 선언
2. public으로 값이 주입되는 통로를 만든다 (생성자 또는 setter()에서 만듦)
3. public으로 주입된 값을 반환하는 기능
*/

public class Manager {
	//필드 : 무조건 private로 지정한다.
	//데이터는 소중하기 때문에 다른 클래스에서 함부로 접근하지 못하도록 차단.
	private String name;
	private Mydate birthdate;
	private double salary;
	private String dept;
	
	//기본 생성자
	public Manager() {};
	
	//명시적 생성자
	//Test 클래스에서 생성자를 호출하는 시점에 값이 field에 주입됨
	public Manager(String name, Mydate birthdate, double salary, String dept) {
		this.name = name;
		this.birthdate = birthdate;
		this.salary = salary;
		this.dept = dept;
	}

	//값을 주입하는 통로
	public void setManagerField(String name, Mydate birthdate, double salary, String dept) {
		this.name = name;
		this.birthdate = birthdate;
		this.salary = salary;
		this.dept = dept;		
	}

	public String getDetails() {
		return name + "," + birthdate.getDate() + "," + salary + "," + dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mydate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Mydate birthdate) {
		this.birthdate = birthdate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
}//class
