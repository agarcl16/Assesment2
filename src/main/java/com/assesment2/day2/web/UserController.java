package com.assesment2.day2.web;

import com.assesment2.day2.model.User;
import com.assesment2.day2.service.AccountService;
import com.assesment2.day2.service.AccountServiceImpl;
import com.assesment2.day2.service.UserService;
import com.assesment2.day2.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private AccountService accountService;
	
	public UserController() {
		this.userService = new UserServiceImpl();
		this.accountService = new AccountServiceImpl();
	}

	@GetMapping("/register/{id}")
	public boolean register(User user) {
		if(!this.userService.findUser(user) && !this.userService.findUserByUserName(user.getUserName()))
		return this.userService.registerUser(user);
		else return false;
	}

	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		if(this.userService.findUserByUserName(username))
		return this.userService.loginUser(username, password);
		else return false;
	}
}
