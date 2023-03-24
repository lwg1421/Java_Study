package com.edu.vo;

import com.edu.util.Mydate;

//부모 클래스 == Super Class == Parent Class
public class Employee {
	private String name;
	private Mydate birthdate;
	private double salary;
	
	//상수값
	public static final double basic_salary = 100;
	
	public Employee() {
		
	}
	
	public Employee(String name, Mydate birthdate, double salary) {
		this.name = name;
		this.birthdate = birthdate;
		this.salary = salary;
	}

	/*
	 * this 
	 * 1) local 변수와 field의 이름이 동일할 때 구분하기 위해서
	 * 2) this() : 하나의 클래스에서 도 다른 생성자를 호출할 때 사용함
	 */
	//salary에 별도의 값을 생성자에 입력하지 않으면 basic_salary에 설정된 기본값인 100이 들어감
	public Employee(String name, Mydate birthdate) {
		this(name, birthdate, basic_salary);
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
	public void changeSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDetails() {
		return name + " " + birthdate.getDate() + " " + salary;
	}
	
	
}