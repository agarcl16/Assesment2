package com.assesment2.day2.service;

import java.util.List;

import com.assesment2.day2.model.Transaction;
import com.assesment2.day2.repository.TransactionRepository;

public class TransactionServiceImpl implements TransactionService{

	private TransactionRepository transaction;
	
	public TransactionServiceImpl() {
		transaction = new TransactionRepository();
	}
	
	@Override
	public boolean addMoney(String cuenta, float money) {
		// TODO Auto-generated method stub
		List<Transaction> list = transaction.getTransaction();
		for(Transaction t: list) {
			if(t.getCuenta().equals(cuenta)) {
				if(t.getMoney()>=money) {
					return transaction.addTransaction(cuenta,money);
				}
			}
		}
		return false;
	}

}
