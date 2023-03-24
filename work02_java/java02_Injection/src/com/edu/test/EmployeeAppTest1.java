package com.edu.test;

import com.edu.util.Mydate;
import com.edu.vo.Engeineer;
import com.edu.vo.Manager;
import com.edu.vo.Secratary;

public class EmployeeAppTest1 {

	/*
	 * 1.객체 생성 == 클래스의 멤버를 메모리에 올린다.
	 * 2.접근
	 * 		1) 필드에 접근 (값 할당)
	 * 		2) 메소드에 접근 (호출)
	 */	
	public static void main(String[] args) {
		
		
//		1. eg라는 이름으로 Engeinner를 생성
//		2. s라는 이름으로 Secratary를 생성
//		3. Manager, Engineer, Secratary정보를 콘솔로 출력
//		4. Manager, Engineer, Secratary연봉을 출력
//		5. Manager, Engineer, Secratary이름을 각각 출력

		Manager m = new Manager("James", new Mydate(1990,3,24),200002.0,"IT");
		Engeineer eg = new Engeineer("EEE", new Mydate(2000,1,2), 34000.0, "JAVA", 200);
		Secratary s = new Secratary("SSS", new Mydate(1985,11,17), 40000.0, "James");
		
		System.out.println("========== 정보를 출력합니다.=================");
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		System.out.println(s.getDetails());
		
		System.out.println("========== 연봉 정보를 출력합니다.=================");
		System.out.println("Manager 연봉"+ m.getSalary()*12+" 달러");
		System.out.println("Engineer 연봉"+ eg.getSalary()*12 +eg.getBonus()+" 달러");
		System.out.println("Secratary 연봉"+ s.getSalary()*12+" 달러");
		
		System.out.println("========== 이름 정보를 출력합니다.=================");
		System.out.println("Manager 이름"+ m.getName());
		System.out.println("Engineer 이름"+ eg.getName());
		System.out.println("Secratary 이름"+ s.getName());
	}

}
