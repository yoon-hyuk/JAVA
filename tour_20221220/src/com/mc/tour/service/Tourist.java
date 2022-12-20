package com.mc.tour.service;

public class Tourist {
	private int balance;
	private int mileage;
	
	public Tourist() {
		
	}

	
	public Tourist(int balance, int mileage) {
		super();
		this.balance = balance;
		this.mileage = mileage;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
	
}
