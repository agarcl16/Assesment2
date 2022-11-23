package com.assesment2.day2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assesment2.day2.model.User;
import com.assesment2.day2.service.TransactionService;
import com.assesment2.day2.service.TransactionServiceImpl;

@Controller
public class TransactionController {

	private TransactionService transactionService;
	
	public TransactionController() {
		this.transactionService = new TransactionServiceImpl();
	}
	
	@PostMapping("/account/addMoney")
    @ResponseBody
	public boolean addMoney(@RequestBody User user) {
		String cuenta=null;
		float money=0;
		this.transactionService.addMoney(cuenta, money);
		return false;
	}

	@GetMapping("/account/removeMoney")
    @ResponseBody
	public boolean removeMoney(@RequestBody User user) {
		
		return false;
	}
}
