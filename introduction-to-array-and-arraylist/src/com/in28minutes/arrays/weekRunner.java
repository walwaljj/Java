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
				
				//if진짜지랄하네..^^// 휴지가져다놔도 지랄.. 어쩌다 그런거가지고 쿠사리를 주네
		// 그러는 너는 왜 항상 두세칸만 남겨두고 안채워놓냐..?^^ 니나 잘해
//		String[] dayArr = new String[daysOfWeek.length];
//		int j = 0;
		for (int i = daysOfWeek.length - 1; i >= 0; i--/* ,j++ */) {
//			dayArr[j] = daysOfWeek[i];
			System.out.println(daysOfWeek[i]);
		}

//		System.out.println(Arrays.toString(dayArr));
	}

}
