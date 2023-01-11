package com.in28minutes.oops.level2;

public class Customer {

	// state
	private String name;
	private Address homeAddress;
	private Address workAddress;

	// creating : workAd 는 꼭 필요한 값이 아니기 때문에 생성자에 넣지않았다.
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	// operation : name 은 바꿀수 없도록 getter, setter 만들지 않음.
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return "name=[" + name + "], homeAddress=[" + homeAddress + "], workAddress=[" + workAddress + "]";
	}

}
