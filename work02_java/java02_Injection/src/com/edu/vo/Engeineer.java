package com.edu.vo;

import com.edu.util.Mydate;

/*1. private 필드 선언
 *2. 값이 주입되는 통로
 *		1) public 명시적 생성자
 *		2) public void setter()
 *3. public 주입된 값을 반환하는 기능을 정의
 *
 * 
 * 엔지니어 클래스 
 * 필드 : name, birthday, salary, tech, bonus
 * 통로 : 생성자
 * 반환 : getDetail()
 */
public class Engeineer {
	private String name;
	private Mydate birthday;
	private double salary;
	private String tech;
	private double bonus;
	
	//기본 생성자
	public Engeineer() {};
	
	//명시적 생성자
	public  Engeineer(String name, Mydate birthday, double salary, String tech, double bonus) {
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.tech = tech;
		this.bonus = bonus;
	}
	
	public String getDetails() {
		return name + "," + birthday.getDate() + "," + salary + "," + tech + "," +bonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mydate getBirthday() {
		return birthday;
	}

	public void setBirthday(Mydate birthday) {
		this.birthday = birthday;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	

}
