package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private ArrayList<Integer> marks = new ArrayList<Integer>();
	private String name;

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {

		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;

	}

	public int getMaximumMark() {

//		Arrays.sort(marks);
//		return marks[marks.size() - 1]; // ;

//		int maximum = Integer.MIN_VALUE;
//		for (int mark : marks) {
//			if (mark > maximum) {
//				maximum = mark;
//			}
//		}
//		return maximum;

		return Collections.max(marks);
	}

	public int getMinimumMark() {

//		Arrays.sort(marks);
//		return marks[0];

//		int minimum = Integer.MAX_VALUE;
//		for (int mark : marks) {
//			if (mark < minimum) {
//				minimum = mark;
//			}
//		}
//		return minimum;

		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
//		return new BigDecimal((float) sum / number);
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);

	}

}
