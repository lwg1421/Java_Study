package com.edu.util;

public class Mydate {
	private int year;
	private int month;
	private int day;
	
	
	//명시적 생성자
	public Mydate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}



	public String getDate() {
		return year + "," + month +"," + day;
	}
}
