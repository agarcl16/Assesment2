package com.assesment2.day2.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.assesment2.day2.model.Account;
import com.assesment2.day2.model.User;

class ServiceTest {

	@Test
	void testUserRegister() {
		User user = new User("123456", "AlexLanero", "123456789");
		UserService serv = new UserServiceImpl();
		Assert.assertTrue(serv.registerUser(user));
	}
	
	@Test
	void testFindUser() {
		User user = new User("123456", "AlexLanero", "123456789");
		UserService serv = new UserServiceImpl();
		Assert.assertFalse(serv.findUser(user));
	}
	
	@Test 
	void testAccountRegister() {
		Account account = new Account("1212", "ES6621000418401234567891", 0.0, "123456");
		AccountService serv = new AccountServiceImpl();
		Assert.assertTrue(serv.registerAccount(account));
	}

}
