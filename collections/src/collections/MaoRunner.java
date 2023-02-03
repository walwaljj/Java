package collections;

import java.util.HashMap;
import java.util.Map;

public class MaoRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion."
				+ " This has never happened before.";
		Map<Character, Integer> occurrences = new HashMap<>();

		char[] chars = str.toCharArray();

		for (char character : chars) {
			Integer integer = occurrences.get(character);
			if (integer == null) {
				occurrences.put(character, 1);
			} else {
				occurrences.put(character, integer + 1);
			}

		}
		System.out.println(occurrences);

		Map<String, Integer> stringOccurrences = new HashMap<>();

		String[] strs = str.split(" ");

		for (String string : strs) {
			Integer integer = stringOccurrences.get(string);
			if (integer == null) {
				stringOccurrences.put(string, 1);
			} else {
				stringOccurrences.put(string, integer + 1);
			}

		}
		System.out.println(stringOccurrences);

	}

}
