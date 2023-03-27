package com.edu.vo;

import com.edu.util.Mydate;

//부모 클래스 == Super Class == Parent Class
public class Employee {
	private int empId;
	private String name;
	private Mydate birthdate;
	private double salary;
	
	//상수값
	public static final double basic_salary = 100;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String name, Mydate birthdate, double salary) {
		super();
		this.empId = empId;
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
//	public Employee(String name, Mydate birthdate) {
//		this(name, birthdate, basic_salary);
//	}
	
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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
	
//	public String getDetails() {
//		return name + " " + birthdate.getDate() + " " + salary;
//	}
	
	//클래스의 필드를 리턴하는 기능을 새롭게 정의할 필요 없이 
	//toString() 기능을 재정의(Overriding)해서 사용하도록 하자.
	public String toString() {
		return empId + " " + name + " " + birthdate+ " "  + salary;
	}
	
	
}
