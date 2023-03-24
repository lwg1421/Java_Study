package com.itskb.ws03.dto;

public class AccountDto {
	// 필드
	int accountSeq;
	String accountNumber;
	int balance;
	public int userSeq;
	
	public AccountDto() {
		super();
	}
	public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
		super();
		this.accountSeq = accountSeq;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}
	@Override
	public String toString() {
		return "AccountDto [accountSeq=" + accountSeq + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", userSeq=" + userSeq + "]";
	}
	
	
	

}
