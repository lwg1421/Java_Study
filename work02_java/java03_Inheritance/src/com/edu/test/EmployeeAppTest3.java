package com.edu.test;

import com.edu.util.Mydate;
import com.edu.vo.Employee;
import com.edu.vo.Engeineer;
import com.edu.vo.Manager;
import com.edu.vo.Secratary;

public class EmployeeAppTest3 {

	/*
	 *Employee 타입의 배열을 생성
	 *이 안에 여러명의 Manager, Engeineer, Secratary 객체를 넣고
	 *부모 타입으로 단일하게 이기종간의 객체들을 핸들링 할 수 있는 코드를 작성
	 *::
	 *Heterogeneous Collection이 만들어짐(상속 덕분)
	 */	
	public static void main(String[] args) {
		
		Employee[] emps = {
				new Manager("James", new Mydate(1990,3,24),200002.0,"IT"),
				new Engeineer("Gosling", new Mydate(1990,2,24),150002.0,"python",100.0),
				new Manager("Peter", new Mydate(1990,3,24),450002.0,"IT"),
				new Secratary("Juliet", new Mydate(1990,1,24),350002.0,"Gosling"),
				new Manager("Jamse1", new Mydate(1990,3,24),200002.0,"IT"),

		};

//		Manager m = new Manager("James", new Mydate(1990,3,24),200002.0,"IT");
//		Engeineer eg = new Engeineer("EEE", new Mydate(2000,1,2), 34000.0, "JAVA", 200);
//		Secratary s = new Secratary("SSS", new Mydate(1985,11,17), 40000.0, "James");
		
		System.out.println("========== 정보를 출력합니다.=================");
		for(Employee e : emps) System.out.println(e.getDetails());
		
		System.out.println("========== 연봉 정보를 출력합니다.=================");
		for (Employee e : emps) {
			if( e instanceof Engeineer)	{ //employee타입으로 생성된 객체가 엔지니어라면..
				Engeineer eg = (Engeineer)e;
				System.out.println(e.getName() + "님의 연봉은" + (e.getSalary()*12 + eg.getBonus() ));
			} else {
				System.out.println(e.getName() + "님의 연봉은" + e.getSalary()*12 + "달러입니다." );
			}
			
		}
		
		System.out.println("========== 이름 정보를 출력합니다.=================");
		for(Employee e : emps) System.out.println("이름 : " + e.getName());
	}

}
