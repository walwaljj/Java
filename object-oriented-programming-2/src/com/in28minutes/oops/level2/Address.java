package com.in28minutes.oops.level2;

public class Address {
	private String line1;
	private String city;
	private String zip;

	// creation : alt + Shift + s -> Generate Const.... Field
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "[line1=" + line1 + ", city=" + city + ", zip=" + zip + "]";
	}

}
