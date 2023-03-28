package com.edu.exception;

//사용자정의 예외처리 만들기

//수정, 삭제할 대상이 없을 때 발생하는 사용자 정의 예외 클래스
public class RecordNotFoundException extends Exception {
	public RecordNotFoundException() {
		//예외 발생 시 출력할 안내문
		this("This is RecordNotFoundException...");
	}
	
	public RecordNotFoundException(String message) {
		super(message);
	}
}
