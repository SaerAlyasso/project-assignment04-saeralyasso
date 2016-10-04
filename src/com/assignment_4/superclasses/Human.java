package com.assignment_4.superclasses;

/**
 * Human
 * 
 * @author saer
 * @version 1.0
 */

public class Human {
	
	// private attributes
	private String name;
	private int age;

	/**
	 * constructor
	 * @param name
	 * @param age
	 */
	public Human(String name,int age){
		
		this.name=name;
		this.age=age;
	}

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	// Getter
	public int getAge() {
		return age;
	}

	// Setter
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
