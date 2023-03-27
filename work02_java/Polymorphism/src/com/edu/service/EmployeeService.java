package com.edu.service;

import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;

/*
 * 기능들만 정의된 Service 클래스
 * 1. 상속기술 사용 안했을 경우
 * Manager Engineer Secratary
 * 
 * Step 1.가장 저차원적인 기능 정의
 * 추가에 관련된 기능을 정의
   public void addManager(Manager m){}
   public void insertEngin(Engineer eg){}
   public void plusSecrataryMember(secratary s){}
   
   Step 2.
   public void addManager(Manager m){}
   public void addEngineer(Engineer eg){}
   public void addSecratary(secratary s){}
   
   2.상속기술 사용 한 경우
   			Employee(다양한 이기종간의 자식 클래스들을 단일하게 관리)
   	Manager	Engineer	Secratary
   	
   Step 3.
   public void addEmployee(Manager m){}
   public void addEmployee(Engineer eg){}
   public void addEmployee(secratary s){}
   -> 한계 : 오버로딩 기법을 이용하여 메소드 이름은 하나로 통일했지만 여전히 함수 세개가 필요하다. 
   
   Step 4. Employee e로 모든 자식들을 받는다...Polyhorphic Argument
   public void addEmployee(Employee e){
   		if (e instanceof Manager){
   		
   		}
   		if (e instanceof Engineer){
   		
   		}
   		if (e instanceof secratary){
   		
   		}
   
   }
 */
public class EmployeeService {
	//1. 모든 직원의 정보를 출력하는 기능을 정의
	public void printAllEmployee(Employee[ ] ea) {
		for(Employee e : ea) System.out.println(e);
	}
	
	//2. 모든 직원중 특정한 직원을 검색하는 기능을 정의
	public Employee findEmployee(Employee[] ea, int empId) {
		Employee employee = null;
		//구현
		for(Employee e : ea) {
			if(e.getEmpId() == empId) {	
				employee = e;
				break;
			}
		}
		
		return employee;
	}
	
	//3. 모든 직원중 동일한 부서에서 근무하는 직원을 리턴
	public Employee[] findEmployee(Employee[] ea, String dept){
		Employee[] temp = new Employee[ea.length];
		//구현
		int idx = 0;
		for(Employee e : ea) {
			if(e instanceof Manager) {
				if(((Manager) e).getDept().equals(dept)) {
					temp[idx++] = e;
				}
			}
		}
		
		return temp;
	}
	
	//4. 특정한 직원의 연봉을 리턴하는 기능을 정의
	public int getAnnualSalary(Employee e) {
		int annualSalary = 0;
		
		annualSalary = (int)(e.getSalary()*12);
		if(e instanceof Engineer)
			annualSalary = (int)(e.getSalary()*12 + ((Engineer)e).getBonus());
		
		return annualSalary;
	}
	
	//5. 모든 직원의 연간 총 인건비를 리턴하는 기능을 정의
	public int getTotalCost(Employee[] ea) {
		int totalCost = 0;
		for(Employee e : ea)
			totalCost += getAnnualSalary(e);
		return totalCost;
	}

}
