/*

테이블 생성과 시퀀스 생성하기
  
CREATE TABLE member
	(
	id number primary key,
	name varchar2(20),
	email varchar2(30),
	phone varchar2(30)
	);

DESC member;

CREATE SEQUENCE seq_id 
	INCREMENT BY 1
	START WITH 1;

 */
package jdbc.dto;

public class Member {
	private int id;
	private String name;
	private String email;
	private String phone;	
	
	public Member() {}
	public Member(int id, String name, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}	
	
	//화면으로부터 직접 입력받는 데이터는 name, email, phoe값 뿐이다.
//	id는 DB에서 이런 값들이 추가될 때 그때 자동증가된다.
	public Member(String name, String email, String phone) {
		super();
		
		this.name = name;
		this.email = email;
		this.phone = phone;
	}	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", email=" + email
				+ ", phone=" + phone  + "]";
	}
}
