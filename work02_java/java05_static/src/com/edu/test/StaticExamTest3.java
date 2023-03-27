package com.edu.test;

/*
 * 싱글톤패턴
 * 1. 클래스 안에서 하나의 인스턴스는 일단 생성
 * 	  private static으로!
 * 2. 다른 클래스에서는 생성 못하도록 막아둔다.
 *    private 생성자(){
 * 3. 하나 만들어놓은 객체를 여기 저기서 갖다 쓰도록 만든다.
 *    public 객체명 getInstance(){
 */
class Service{
	//1.
	private static Service service = new Service();
	
	//2.
	private Service() {
		System.out.println("싱글톤 패턴...");
	}
	
	//3.
	public static Service getInstance() {	//객체 생성 없이 메서드를 바로 사용할 수 있도록 static을 붙여줘야함.
		return service;
	}
	
}
public class StaticExamTest3 {
	public static void main(String[] args) {
		Service s1 = Service.getInstance();
		Service s2 = Service.getInstance();
		Service s3 = Service.getInstance();
		System.out.println("주소값이 같은지 확인");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
