package com.itskb.ws03.service;

import java.util.ArrayList;
import java.util.List;

import com.itskb.ws03.dto.AccountDto;
import com.itskb.ws03.dto.UserDto;

public class BankService {
	List<AccountDto> accountList;
	List<UserDto> userList;
	
	
	// 기본생성자
	// 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다.
	public BankService() {
		accountList = new ArrayList<>();
		userList = new ArrayList<>();
		
		userList.add(new UserDto(1001,"이원근","lwg1421@naver.com","01067761421",false));
		userList.add(new UserDto(1002,"Lee","lwg1420@naver.com","01067761422",false));
		userList.add(new UserDto(1003,"Kang","lwg1422@naver.com","01067769999",true));
	
		accountList.add(new AccountDto(1,"11-111",5000000,1001));
		accountList.add(new AccountDto(2,"11-112",3000000,1002));
		accountList.add(new AccountDto(3,"11-113",9000000,1001));
	}
	
	
	public List<AccountDto> getAccountList(int userSeq) {
		List<AccountDto> result = new ArrayList<>();
		for(AccountDto dto : accountList) {
			if(dto.userSeq == userSeq) {
				result.add(dto);
			}
		}
		return result;
	}
	
	public UserDto getUserDetail(int userSeq) {
		for(UserDto dto : userList) {
			if(dto.userSeq == userSeq) {
				return dto;
			}
		}
		return null;
	}
	
	
	
	
}
