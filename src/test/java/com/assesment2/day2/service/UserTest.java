package com.assesment2.day2.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.assesment2.day2.model.User;
import com.assesment2.day2.repository.UserRepository;

import junit.framework.Assert;

class UserTest {

	@Test
	void testRegistro() {
		User user = new User("123456", "AlexLanero", "123456789");
		UserRepository repos = new UserRepository();
		Assert.assertTrue(repos.register(user));
	}
	void testCuenta() {
		
	}

}
