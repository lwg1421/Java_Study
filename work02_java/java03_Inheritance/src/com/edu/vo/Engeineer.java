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
public class Engeineer extends Employee{
	private String tech;
	private double bonus;
	
	/*
	 * 자식 생성자 첫 라인에서 
	 * 부모 생성자 호출이 무조건 일어난다.
	 * super();
	 * 또는 super(o,o,o);
	 */
	
	
	public Engeineer() {
		super();
	}
	
	//명시적 생성자
	public  Engeineer(String name, Mydate birthdate, double salary, String tech, double bonus) {
		super(name,birthdate,salary);
		this.tech = tech;
		this.bonus = bonus;
	}

	public String getTech() {
		return tech;
	}

	public void changeTech(String tech) {
		this.tech = tech;
	}

	public double getBonus() {
		return bonus;
	}

	public void changeBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails() + "," + this.tech + "," + this.bonus;
	}
	
	
	
	

}