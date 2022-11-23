package com.assesment2.day2.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.assesment2.day2.model.Account;
import com.assesment2.day2.model.User;
import com.assesment2.day2.repository.AccountRepository;
import com.assesment2.day2.repository.UserRepository;

import junit.framework.Assert;

class UserTest {

	@Test
	void testRegistro() {
		User user = new User("123456", "AlexLanero", "123456789");
		UserRepository repos = new UserRepository();
		Assert.assertTrue(repos.register(user));
	}
	
	@Test
	void testCuenta() {
		Account account = new Account("1212", "ES6621000418401234567891", 0.0, "123456");
		AccountRepository repos = new AccountRepository();
		Assert.assertTrue(repos.register(account));
	}

}
