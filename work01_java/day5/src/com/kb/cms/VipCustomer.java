package com.kb.cms;

public class VipCustomer extends Customer {
	String hobby;
	String carNumber;
	
	
	// 다른 생성자를 만들었으니, 기본 생성자도 별도로 만들어줄 것
	public VipCustomer() {
		super();
	}


	// 생성자 생성 1
	public VipCustomer(int num, String name, String address, String hobby, String carNumber) {
		super(num, name, address);
		this.hobby = hobby;
		this.carNumber = carNumber;
	}
	
	// 생성자 생성 2
	public VipCustomer(int num, String name, String address, String carNumber) {
		this(num, name, address," ",carNumber);   //생성자 2를 의미함.
	}


	
	//toString 생성
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VipCustomer [");
		builder.append(super.toString());
		builder.append(", hobby=");
		builder.append(hobby);
		builder.append(", carNumber=");
		builder.append(carNumber);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
