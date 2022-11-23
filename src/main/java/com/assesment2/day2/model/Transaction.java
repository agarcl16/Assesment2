package com.assesment2.day2.model;


public class Transaction {

	public String cuenta;
	public float money;
	
	public Transaction(String cuenta, float money) {
		this.cuenta = cuenta;
		this.money = money;
	}

	public String getCuenta() {
		// TODO Auto-generated method stub
		return this.cuenta;
	}

	public float getMoney() {
		// TODO Auto-generated method stub
		return this.money;
	}

}
