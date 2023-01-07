package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(100);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(45);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(200);
		cleanCode.setNoOfCopies(300);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
	}

}
