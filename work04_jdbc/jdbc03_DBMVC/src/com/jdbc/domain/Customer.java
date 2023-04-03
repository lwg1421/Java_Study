package com.jdbc.domain;

//	Customer 테이블의 정보를 저장하는 클래스
//	이 클래스는 Encapsulation 패턴으로 작성한다.
//	Customer 생성자 오버로딩 (null값이 아니라 기본값으로 지정되도록 하기 위함)

public class Customer {
	private String ssn;
	private String name;
	private String address;
	public static final String BASIC_ADDR = "선릉";	//만약 주소를 빠뜨렸을 경우의 기본값 설정.
	
	public Customer(String ssn, String name, String address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	
	//생성자 오버로딩 (주소를 빠뜨렸을 경우.)
	public Customer(String ssn) {
		this(ssn, "", BASIC_ADDR);
	}
	
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

	
}
