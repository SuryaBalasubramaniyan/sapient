package com.sapient.pe.model.BankAccount;
import com.sapient.pe.model.Address.*;
abstract public class BankAccount {
	private long accountNumber;
	private String name;
	protected double balance=50000;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private static final double WITHDRAW_AMOUNT=25000;
	private static final double DEPOSIT_AMOUNT=50000;
		
	private static final double MIN_BALANCE_AMOUNT=5000;
	private static  long accountIdCounter=100;
	private Address address;
	
	
	public BankAccount(String name,Address address){
		
		this.name=name;
		this.accountNumber=++accountIdCounter;
		this.address=address;
		//this.accountType=accountType;
	}

	
	
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}

	

	abstract public double withdraw(double amount);
	
	abstract public void deposit(double amount) ;
}






/*public class CurrentAccount extends BankAccount{
	
	private static final double MIN_BALANCE_AMOUNT=25000;
	
}

public class SalaryAccount extends BankAccount{
	
	private static final double MIN_BALANCE_AMOUNT=0;
	
}
*/
