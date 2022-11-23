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
		Assert.assertFalse(controller.login("username", "password"));
		Assert.assertTrue(controller.login("Pedro", "Pica"));
	}

}
