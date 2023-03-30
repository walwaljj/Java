package com.in28minutes.arrays;

public class weekRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String dayWithMostCharacters = "";
		for(String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;

			}
		}
		System.out.println(dayWithMostCharacters);
				
//		String[] dayArr = new String[daysOfWeek.length];
//		int j = 0;
		for (int i = daysOfWeek.length - 1; i >= 0; i--/* ,j++ */) {
//			dayArr[j] = daysOfWeek[i];
			System.out.println(daysOfWeek[i]);
		}

//		System.out.println(Arrays.toString(dayArr));
	}

}
