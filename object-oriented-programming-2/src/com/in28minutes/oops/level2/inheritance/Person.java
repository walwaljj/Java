package com.in28minutes.oops.level2.inheritance;

public class Person {
	private String name;
	private String email;
	private String phoneNumber;

	public Person(String name) {
		super();
		this.name = name;
	}
//	public Person() {
//		System.out.println("Person");
//
//
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return name + "#" + email + "#" + phoneNumber;
	}


}
