package com.ait.exercise;

public class Account {
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void addAmount(double amount) {
		double tmp=balance;
		try {
		Thread.sleep(10);
		} catch (InterruptedException e) {
		e.printStackTrace();
		} 
		
		
		}
	
	public void subtractAmount(double amount) {
		double tmp=balance;
		try 
		{
			Thread.sleep(10);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		}

	
}
