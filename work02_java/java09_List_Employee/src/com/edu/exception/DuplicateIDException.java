package com.edu.exception;

//사용자정의 예외처리 만들기

//이미 empID가 존재하는 경우 발생하는 사용자 정의 예외 클래스
public class DuplicateIDException extends Exception {
	public DuplicateIDException() {
		//예외 발생 시 출력할 안내문
		this("This is DuplicateIDException...");
	}
	
	public DuplicateIDException(String message) {
		super(message);
	}
}
