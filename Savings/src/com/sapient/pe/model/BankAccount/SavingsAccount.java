package com.sapient.pe.model.BankAccount;

import com.sapient.pe.model.Address.Address;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(String name, Address address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	
	private static final double MIN_BALANCE_AMOUNT=10000;
	private static final double WITHDRAW_AMOUNT=25000;
	private static final double DEPOSIT_AMOUNT=50000;
	
	public double withdraw(double amount) {
		if(amount>= WITHDRAW_AMOUNT) {
			System.out.println("with draw limit exceeded");
		}
		else if(amount<this.balance) {
			this.balance-=amount;
			return balance;
		}
		else if(this.balance<MIN_BALANCE_AMOUNT){
			System.out.println("Charges are applied");
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
