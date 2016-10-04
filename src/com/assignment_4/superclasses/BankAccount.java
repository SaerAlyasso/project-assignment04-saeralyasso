package com.assignment_4.superclasses;

import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

/**
 * BankAccount
 * 
 * @author saer
 * @version 1.0
 */

public class BankAccount implements BankOperations {

		
		// protected attributes for the class BankAccount
		protected String accountNumber;
		protected String accountType;
		protected double balance;
		
		/**
		 * constructor
		 */
		public BankAccount(){
			
			this.accountNumber=UUID.randomUUID().toString().substring(0, 6);
			this.balance=0.0;
			this.accountType="Bank Account";
		}
		
		// Getter
		public String getAccountNumber() {
			return accountNumber;
		}

		// Setter
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		// Getter
		public String getAccountType() {
			return accountType;
		}

		// Setter
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		// Getter
		public double getBalane() {
			return balance;
		}

		// Setter
		public void setBalance(double balance) {
			this.balance = balance;
		}

		/**
		 * Method withdrawMoney set the value of the balance attribute by subtracting
		 * parameter amount from the existing balance.
		 * @param amount
		 */
		@Override
		public void withdrawMoney(double amount) {
			
			if(amount>=0){
				
				this.setBalance(this.getBalane()-amount);
			}
			
			else{
				
				System.out.println("You cannot withdraw a negative value");
			}
			
		}

		/**
		 * Method depositMoney set the value of the balance attribute by adding
		 * parameter amount to the existing balance.
		 * @param amount
		 */
		@Override
		public void depositMoney(double amount) {
			
			if(amount>=0){
				this.setBalance(this.getBalane()+amount);
				
			}
			
			else{
				
				System.out.println("You cannot deposit a negative value");
			}
			
		}

		/**
		 * toString method printing out a string representing the object.
		 * in this case a BankAccount object
		 */
		@Override
		public String toString() {
			return "BankAccount [accountNumber= " + accountNumber + ", accountType= " + accountType + ", balance= " + balance+"]"
					+"\n";
		}
	
}
