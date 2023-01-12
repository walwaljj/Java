package com.in28minutes.oops.level2.interfaces;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal animals[] = { new Cat(), new Dog() };

		for (Animal object : animals) {
			object.bark();
		}
	}

}
