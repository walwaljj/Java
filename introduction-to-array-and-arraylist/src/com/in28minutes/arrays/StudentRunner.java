package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
//		int[] marks = new int[5];
//		int[] marks = { 99, 88, 100 };

		Student student1 = new Student("Ranga1", 99, 88, 100);
		Student student2 = new Student("Ranga2", 99, 88, 100, 77);
		Student student3 = new Student("Ranga3", 99, 100);

		int number = student1.getNumberOfMarks();
		int sum = student1.getTotalSumOfMarks();
		int maximumMark = student1.getMaximumMark();
		int minimumMark = student1.getMinimumMark();
		BigDecimal average = student1.getAverageMarks();

		System.out.println("number : " + number);
		System.out.println("sum : " + sum);
		System.out.println("maximumMark : " + maximumMark);
		System.out.println("minimumMark : " + minimumMark);
		System.out.println("average : " + average);

		System.out.println(student1);

		student1.addNewMark(35);
		System.out.println(student1);

		student1.removeMarkAtIndex(1);
		System.out.println(student1);

	}

}
