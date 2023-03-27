package com.self.vo;

import com.self.util.MyDate;

public class Employee {
	//매니저와 엔지니어의 공통 성질을 뽑아냄.
	private String name;
	private MyDate birthDate;
	private double salary;
	
	//기본 생성자 생성
	public Employee() {};
	
	//생성자 생성
	public Employee(String name, MyDate birthDate, double salary) {
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return name+","+birthDate+","+salary;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	
	

}
