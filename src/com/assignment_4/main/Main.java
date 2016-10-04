package com.assignment_4.main;

import com.assignment_4.subclasses.*;
import com.assignment_4.superclasses.*;

/**
 * Main, in the Class Main we create an object of the class BankCustomer which inherits
 * from the superclass Human. After that we create different types of accounts for
 * the created object and uses some methods to operate on the object. 
 * 
 * @author saer
 * @version 1.0
 */

public class Main {

	/** 
	 * This is the main method
	 *@param args unused
	 * */
	public static void main(String[] args) {
		
		String account = "";
		
		// Instantiating a BankCustomer object
		BankCustomer bc = new BankCustomer("Rafael",30);
		
		// Instantiating and adding three bank accounts to BankCustomer object bc
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		
		// printing out BankCustomer object bc by using toString() for the object
		System.out.println(bc.toString());
		
		
		account = bc.getCustomerAccounts().get(0).getAccountNumber();
		System.out.println("Deposition 30.0 to the first account");
		
		// using the method depositToAccount passing parameters account
		//and 30 and printing out using toString()
		bc.depositToAccount(account, 30);
		System.out.println(bc.toString());
		
		System.out.println("Withdrawing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(1).getAccountNumber();
		
		// using the method withdrawFromAccount passing parameters account
		// and 200 and printing out using toString()
		bc.withdrawFromAccount(account, 200.0);
		System.out.println(bc.toString());
		
		System.out.println("Depositing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber();
		
		// using the method depositToAccount passing parameters 
		// account and 200 and printing out using toString()
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());
	}

}
