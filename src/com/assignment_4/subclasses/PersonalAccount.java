package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/**
 * PersonalAccount
 * 
 * @author saer
 * @version 1.0
 */

public class PersonalAccount extends BankAccount{

/**
 * Constructor without parameters, extends the superclass BankAccount
 */
public PersonalAccount(){
		
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
		
	}
	
}
