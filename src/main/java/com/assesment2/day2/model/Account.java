package com.assesment2.day2.model;

public class Account {

	private String id;
	private String accNum;
	private double amount;
	private String idUser;

	public Account(String id, String accNum, double amount, String idUser) {
		// TODO Auto-generated constructor stub
		this.setId(id);
		this.setAccNum(accNum);
		this.setAmount(amount);
		this.setIdUser(idUser);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

}
