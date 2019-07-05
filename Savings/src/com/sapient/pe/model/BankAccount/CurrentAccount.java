package com.sapient.pe.model.BankAccount;

import com.sapient.pe.model.Address.Address;

public class CurrentAccount extends BankAccount {
	public CurrentAccount(String name, Address address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	private static final double MIN_BALANCE_AMOUNT=25000;
	private static final double WITHDRAW_AMOUNT=10000;
	
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
		
			this.balance+=amount;
		
	}


}
