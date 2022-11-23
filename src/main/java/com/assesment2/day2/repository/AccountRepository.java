package com.assesment2.day2.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.assesment2.day2.model.Account;
import com.assesment2.day2.model.User;

@Repository
public class AccountRepository {
	List<Account> accounts;
	private static Account accounts1= new Account("987654", "ES6000491500051234567892",378.50, "987654");
	private static Account accounts2= new Account("987653", "ES9420805801101234567891",525.20, "987653");
	private static Account accounts3= new Account("987652", "ES9000246912501234567891",1757.30, "987652");

	public AccountRepository() {
		accounts.add(accounts1);
		accounts.add(accounts2);
		accounts.add(accounts3);
	}
	
	public boolean register(Account account) {
		// TODO Auto-generated method stub
		for(Account a : accounts) {
			if(a.getId().equals(account.getId())) return false;
		}
		return accounts.add(account);
	}

}
