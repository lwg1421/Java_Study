package com.edu.test;

import com.edu.util.Mydate;
import com.edu.vo.Engeineer;
import com.edu.vo.Manager;
import com.edu.vo.Secratary;

public class EmployeeAppTest2 {

	/*
	 *Manager타입의 배열을 생성
	 *이 안에 여러명의 Manager 객체를 넣고
	 *한 번에 핸들링 할 수 있는 코드를 작성
	 */	
	public static void main(String[] args) {
		
		Manager[] managers = {
				new Manager("James", new Mydate(1990,3,24),200002.0,"IT"),
				new Manager("Gosling", new Mydate(1990,2,24),150002.0,"Marketing"),
				new Manager("Peter", new Mydate(1990,1,24),450002.0,"IT")
		};

//		Manager m = new Manager("James", new Mydate(1990,3,24),200002.0,"IT");
//		Engeineer eg = new Engeineer("EEE", new Mydate(2000,1,2), 34000.0, "JAVA", 200);
//		Secratary s = new Secratary("SSS", new Mydate(1985,11,17), 40000.0, "James");
		
		System.out.println("========== 정보를 출력합니다.=================");
		for(Manager m : managers) System.out.println(m.getDetails());
		
		System.out.println("========== 연봉 정보를 출력합니다.=================");
		for (Manager m : managers) System.out.println("연봉 : "+m.getSalary()*12);
		
		System.out.println("========== 이름 정보를 출력합니다.=================");
		for(Manager m : managers) System.out.println("이름 : " + m.getName());
	}

}
