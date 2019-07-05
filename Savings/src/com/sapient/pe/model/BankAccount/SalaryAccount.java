package com.sapient.pe.model.BankAccount;

import com.sapient.pe.model.Address.Address;

public class SalaryAccount extends BankAccount{

	public SalaryAccount(String name, Address address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	private static final double MIN_BALANCE_AMOUNT=0;
	private static final double DEPOSIT_AMOUNT=150000;
	
	public double withdraw(double amount) {
		if((amount>MIN_BALANCE_AMOUNT)) {
			this.balance-=amount;
		   return balance;
		}
		
		else {
			System.out.println("Insufficient balance");
		}
		return 0;
			
	}
	
	public void deposit(double amount) {
		if(amount<DEPOSIT_AMOUNT)
			this.balance+=amount;
		else
			System.out.println("Deposit amount exceeded");
		//this.balance+=amount;
	}
		
		

}
