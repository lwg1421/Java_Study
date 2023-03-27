package com.edu.test;
/*
 * Polymorphism
 * Poly + Morphism
 * ::
 * 여러가지 모양과 모습을 가지는 능력
 * 부모타입으로 여러가지 자식 클래스 객체를 생성하는 것.
 * 1) virtual Method Invocation
 * 2) Object
 */


import com.edu.util.MyDate;
import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;
import com.edu.vo.Secratary;

public class EmployeePolyAppTest1 {
	public static void main(String[] args) {	
		//부모 타입으로 자식 객체를 만듦
		Employee m = new Manager(111,"James", new MyDate(1990,3,24),200002.0,"IT");
		Employee eg = new Engineer(222,"Gosling", new MyDate(1990,2,24),150.0,"python", 100);
		Employee s = new Secratary(333,"Juliet", new MyDate(1990,1,24),350002.0,"Gosling");
	
		//Virtual Method Invocation 원리가 작동
		// 1. 컴파일 시점의 메서드 -- Employee의 toString() 호출
		// 2. 실행 시점의 메서드 -- 실질적으로 생성된 자식 클래스의 toString() 호출
		//상속관계로 이어진 클래스 사이에 Overriding 된 메서드에서 발생하는 원리
		//여기서 Virtual Method는 가상의 메서드로 자식의 메서드를 일컫는다.
		
		//toString을 오버라이딩 했기 때문에 객체만 호출해도 오버라이딩 한 내용이 출력됨.
		System.out.println(m.toString());
		System.out.println(eg);
		System.out.println(s);
		
		System.out.println("==========================");
		//Manager 의 부서를 Marketing 부서로 변경하기
		//changeDept() m 즉, Employee타입에서는 못 찾는다.
		//현재 Employee 타입이므로 Manager 타입으로 캐스팅 해줘야함
		((Manager) m).changeDept("Marketing");
		System.out.println(m);
	}
}





//Employee[ ] emps=  {
//new Manager("James", new MyDate(1990,3,24),200002.0,"IT"),
//new Engineer("Gosling", new MyDate(1990,2,24),150.0,"python", 100),
//new Manager("Peter", new MyDate(1990,1,24),450002.0,"IT"),
//new Secratary("Juliet", new MyDate(1990,1,24),350002.0,"Gosling"),
//new Manager("James1", new MyDate(1990,3,24),200002.0,"IT")				
//};
//
//System.out.println("========== 정보를 출력합니다.=================");			
//for(Employee e : emps) 
//System.out.println(e.getDetails());
//
//
//System.out.println("\n========== 연봉 정보를 출력합니다.=================");
//
//for(Employee e : emps) {			
//if(e instanceof Engineer) {//Employee타입으로 생성된 객체가 Engineer 라면
//Engineer eg=(Engineer)e;
//System.out.println(e.getName()+" 님의 연봉은 "+(e.getSalary() * 12+eg.getBonus())+" 달러입니다.");
//}else {
//System.out.println(e.getName()+" 님의 연봉은 "+e.getSalary() * 12+" 달러입니다.");
//}			
//
//}
//
//System.out.println("\n========== 각 직원의 이름 정보를 출력합니다.=================");
//for(Employee e : emps) System.out.println("Employee Name :"+e.getName());	
//





























