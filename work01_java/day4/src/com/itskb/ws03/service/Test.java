package com.itskb.ws03.service;

import java.util.List;

import com.itskb.ws03.dto.AccountDto;

public class Test {

	public static void main(String[] args) {
		BankService ser = new BankService();
		List<AccountDto> result = ser.getAccountList(1001);
		for (AccountDto data: result) {
			System.out.println(data);
			System.out.println(ser.getUserDetail(1003));
		}
		
	}

}
