package com.assesment2.day2.web;

import com.assesment2.day2.model.User;
import com.assesment2.day2.service.AccountService;
import com.assesment2.day2.service.AccountServiceImpl;
import com.assesment2.day2.service.UserService;
import com.assesment2.day2.service.UserServiceImpl;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	public UserController() {
		this.userService = new UserServiceImpl();
	}

	@PostMapping("/user/register")
    @ResponseBody
	public boolean register(@RequestBody User user) {
		if(!this.userService.findUser(user) && !this.userService.findUserByUserName(user.getUserName()))
		return this.userService.registerUser(user);
		else return false;
	}

	@GetMapping("/user/login/{id}")
    @ResponseBody
	public boolean login(@RequestBody User user) {
		// TODO Auto-generated method stub
		if(this.userService.findUserByUserName(user.getUserName()))
		return this.userService.loginUser(user.getUserName(), user.getPassword());
		else return false;
	}
}
