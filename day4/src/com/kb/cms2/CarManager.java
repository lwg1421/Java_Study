package com.kb.cms2;

import java.util.ArrayList;
import java.util.List;

// 차량관리 클래스
// 차량들을 CRUD
public class CarManager {
//	ArrayList<Car> cars = new ArrayList<Car>();
	List<Car> cars = new ArrayList<>();
	// 저장
	public void save(Car c) {
		// 넣는건 add
		cars.add(c);
	}
	// 검색
//	public void search() {
//		for(int i =0; i<cars.size(); i++) {
//			// 꺼내는건 get
//			System.out.println(cars.get(i));
//		}
//	}
	public void search() {
		for(Car c : cars) {
			System.out.println(c);
		}
	}
	public Car search(String num) {
		for(Car c : cars) {
			if(c.num.equals(num)) {
				return c;
			}
		}
		return null;
	}
	// 수정
	
	// 삭제
	public void delete(String num) {
		Car c = search(num);
		if (c != null) {
			cars.remove(c);
		}
	}
}
