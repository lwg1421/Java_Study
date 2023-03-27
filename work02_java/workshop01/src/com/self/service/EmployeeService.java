package com.self.service;

import java.util.ArrayList;

import com.self.vo.Employee;
import com.self.vo.Engineer;
import com.self.vo.Manager;

public class EmployeeService {
	//기능들은 Service 클래스에 정의한다.
	
	//싱글톤 패턴 적용.
	private static EmployeeService service = new EmployeeService();
	private EmployeeService() {
	}
	public static EmployeeService getInstance() {
		return service;
	}
	
	
	//Employee 타입 객체를 담을 수 있는  ArrayList 배열 생성
	public static ArrayList<Employee> emps = new ArrayList() ;
	
	
	
	
	
	// Create 
	//매니저 추가  //완료  
	public void addManager(Manager m) {	
		emps.add(m);
	}
	//엔지니어 추가  //완료 
	public void addEngineer(Engineer eg) {	
		emps.add(eg);
	}
	
	
	
	
	
	// Delete
	//이름으로 매니저 삭제 //완료
	public void deleteManager(String name) {	
		for(Employee m : emps) {
			if(m instanceof Manager && m.getName()==name) {
				emps.remove(m);
			}
		}
	}
	//이름으로 엔지니어 삭제 //완료
	public void deleteEngineer(String name) {	
		for(Employee m : emps) {
			if(m instanceof Engineer && m.getName()==name) {
				emps.remove(m);
			}
		}
	}
	
	
	
	
	
	
	// Update
	//매니저 정보 업데이트  //완료
	public void updateManager(double salary, String dept,int deptno,  String name) {	
		for(Employee manager : emps) {	
			if(manager==null) continue;
			if(manager.getName().equals(name)) {
				manager.setSalary(salary);
				((Manager) manager).setDept(dept);	
				((Manager) manager).setDeptno(deptno);				
			}			
		}
	}
	//엔지니어 정보 업데이트  //완료
	public void updateEngineer(Engineer eg) {	
		for(Employee engineer : emps) {
			if(engineer==null) continue;
			if(engineer.getName().equals(eg.getName())) {
				engineer.setBirthDate(eg.getBirthDate());
				((Engineer) engineer).setBonus(eg.getBonus());
				engineer.setSalary(eg.getSalary());
				((Engineer) engineer).setTech(eg.getTech());
			}
		}
	}	
	

	
	
	
	// Read
	// Manager 이름으로 검색 //완료
	public Employee findManager(Employee[] ea, String name) {
		Employee employee = null;
		for(Employee e : ea) {
			if(e instanceof Manager && e.getName() == name) {	
				employee = e;
				break;
			}
		}
		
		return employee;
	}
	//Manager deptno로 검색 //완료
	public Employee findManager(Employee[] ea, int deptno) {
		Employee employee = null;
		for(Employee e : ea) {
			if(e instanceof Manager && ((Manager) e).getDeptno() == deptno) {	
				employee = e;
				break;
			}
		}
		
		return employee;
	}
	
	//Engineer name으로 검색 //완료
	public Employee findEngineer(Employee[] ea, String name) {
		Employee employee = null;
		for(Employee e : ea) {
			if(e instanceof Engineer && e.getName() == name) {	
				employee = e;
				break;
			}
		}
		
		return employee;
	}
	
	
	
	
	
	
	//추가
	//모든 매니저 정보 출력  //완료
	public void printManagers() {		
		for(Employee m : emps) {
			if(m!=null && m instanceof Manager)
			System.out.println(((Engineer) m).getDetails());
		}
	}
	//모든 엔지니어 정보 출력  //완료
	public void printEngineers() {
		for(Employee e : emps) {
			if(e!=null)
			System.out.println(((Engineer) e).getDetails());
		}
	}
}

