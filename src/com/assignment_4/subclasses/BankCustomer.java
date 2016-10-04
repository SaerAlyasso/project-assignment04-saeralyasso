package com.assignment_4.subclasses;

import java.util.*;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

/**
 * BankCustomer
 * 
 * @author saer
 * @version 1.0
 */

public class BankCustomer extends Human{

	/**
	 * constructor, extends superclass Human
	 * @param name
	 * @param age
	 */
		public BankCustomer(String name, int age) {
		super(name, age);
		
	}

		// Instantiating an arraylist customerAccounts that contains BankAccounts
		private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();
		
		
		// Getter
		public ArrayList<BankAccount> getCustomerAccounts() {
			return customerAccounts;
		}
		
		// Setter
		public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
			this.customerAccounts = customerAccounts;
		}
	
		/**
		 * Method addAccount for adding BankAccount objects to customerAccounts ArrayList
		 * @param BankAccount
		 * 
		 */
		public void addAccount(BankAccount bankAccount){
			
			customerAccounts.add(bankAccount);
		
			
		}
		
		/**
		 * Method depositToAccount that uses the method depositMoney
		 * to set amount to the balance for the object BankAccount.
		 * @param accountNumber
		 * @param amount
		 */
		public void depositToAccount(String accountNumber, double amount){
			
			for(int x=0; x<customerAccounts.size(); x++){
				
				if(customerAccounts.get(x).getAccountNumber().equals(accountNumber)){
					
					customerAccounts.get(x).depositMoney(amount);
				}
				
			}
			
		}
		
		/**
		 * Method withDrawFromAccount that uses the method withdrawMoney
		 * to change the amount for balance for the object BankAccount.
		 * @param accountNumber
		 * @param amount
		 */
		public void withdrawFromAccount(String accountNumber, double amount){
			
			for(int x=0; x<customerAccounts.size(); x++){
				
				if(customerAccounts.get(x).getAccountNumber().equals(accountNumber)){
					customerAccounts.get(x).withdrawMoney(amount);
					
				}
				
			}

		
		}

		/**
		 * toString method printing out a string representing the object.
		 * in this case BankAccounts for the object BankCustomer
		 */
		public String toString() {
			System.out.println("Customer: "+ this.getName()+ " age: "+this.getAge());
			String build="";
			
			for(int x=0; x<customerAccounts.size(); x++){
				
				build+=customerAccounts.get(x).toString();
			}
			
			return build;
			
		}

		
		
}
