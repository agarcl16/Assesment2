package com.assesment2.day2.service;

import com.assesment2.day2.model.Account;

public interface AccountService {
	public void save(Account account);
	public Account findByUserName(String userName);
	public boolean registerAccount(Account account);
}
