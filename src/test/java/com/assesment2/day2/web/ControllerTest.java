package com.assesment2.day2.web;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.assesment2.day2.model.User;

class ControllerTest {
	
	private UserController controller;
	
	@Test
	void testRegister() {
		controller = new UserController();
		User user = new User("123456", "AlexLanero", "123456789");
		Assert.assertTrue(controller.register(user));
		Assert.assertFalse(controller.register(user));
	}
	
	@Test
	void login() {
		controller = new UserController();
		User user = new User("123456", "AlexLanero", "123456789");
		Assert.assertFalse(controller.login(user));
		User user1 = new User("987654", "Pedro", "Pica");
		Assert.assertTrue(controller.login(user1));
	}

}
