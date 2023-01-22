package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

	private int[] marks;
	private String name;

	public Student(String name, int... marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getTotalSumOfMarks() {

		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;

	}

	public int getMaximumMark() {

		Arrays.sort(marks);
		return marks[marks.length - 1]; // ;

	}

	public int getMinimumMark() {

		Arrays.sort(marks);
		return marks[0];

	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
//		return new BigDecimal((float) sum / number);
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

}
