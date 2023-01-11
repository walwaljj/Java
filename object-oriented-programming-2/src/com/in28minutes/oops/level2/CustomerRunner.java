package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("a", "changwon", "11111");
		Customer customer = new Customer("walwal", homeAddress);
		System.out.println(customer);

		Address workAddress = new Address("a for work", "changwon", "22222");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
