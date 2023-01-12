package com.in28minutes.oops.level2.interfaces;

public class Aeroplane implements Flyable {
	@Override
	public void fly() {
		System.out.println("with fuel");
	}
}
