package com.assesment2.day2.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.assesment2.day2.model.Account;
import com.assesment2.day2.repository.AccountRepository;

public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;

	public AccountServiceImpl() {
		this.accountRepository = new AccountRepository();
	}
	
	@Override
	public void save(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Account findByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registerAccount(Account account) {
		// TODO Auto-generated method stub
		return this.accountRepository.register(account);
	}

}
