package com.sapient.pe.client;
import com.sapient.pe.model.BankAccount.*;

import java.util.*;
import com.sapient.pe.model.Address.*;
public class User {
	

	public static void main(String[] args) {
		
		BankAccount accountType=null;
		Address address=new Address("3rd cross","mumbai",614501);
		BankAccount surya=new SavingsAccount("bairavi",address);
		BankAccount acc=new CurrentAccount("bairavi",address);
		BankAccount acc1=new SalaryAccount("bairavi",address);
		
		List<BankAccount> values=new ArrayList<BankAccount>();
		values.add(surya);
		values.add(acc);
		values.add(acc1);
		//savingsAccount
		System.out.println("Savings Account:");
		System.out.println(values.get(0).withdraw(2000));
		
		
		System.out.println("Total amount :"+values.get(0).getBalance());
		//currentAccount
		System.out.println("Current Account:");
		System.out.println(values.get(1).withdraw(1000));
		System.out.println("Total amount :"+values.get(1).getBalance());
		System.out.println("Address:"+values.get(1).getAddress());
		//BankAccount account=populateData();
		
		//Scanner input=new Scanner(System.in);
		
		
		
		
		
		//savingsAccount
		
		
		/*System.out.println("Savings Account:");
		System.out.println("balance amount:"+surya.withdraw(100));
		surya.deposit(2000);
		System.out.println("Total amount :"+surya.getBalance());
		System.out.println(surya.getAddress());
		
		//currentAccount
		
		
		
		System.out.println("Current Account:");
		System.out.println("balance amount after withdrawl:"+acc.withdraw(1000));
		acc.deposit(2000);
		System.out.println("Total amount :"+acc.getBalance());
		System.out.println(acc.getAddress());
		
		//salaryAccount
		
		
		//SalaryAccount sal=(SalaryAccount)acc1;
		System.out.println("Salary Account:");
		System.out.println("balance amount after withdrawl:"+acc1.withdraw(1000));
		acc1.deposit(2000);
		System.out.println("Total amount :"+acc1.getBalance());
		System.out.println(acc1.getAddress());*/
		
		
		
		//input.close();
		
		
	}
		  
	
}
	
