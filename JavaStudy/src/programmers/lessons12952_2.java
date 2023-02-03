package programmers;

import java.util.Arrays;

public class lessons12952_2 {

	public static void main(String[] args) {
		/*
		 * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는
		 * 이어지는 알파벳은 소문자로 쓰면 됩니다. "3people unFollowed me" "3people Unfollowed Me"
		 * "for the last week" "For The Last Week"
		 */

//		String s = "3people33 unFold1 1dlowed me";
		String s = " for the last weDDek ";
//		String s = "      the last weDDek";
		String[] str = s.split(" ");
		String answer = "";
		System.out.println(str.length);
		System.out.println(Arrays.toString(str));

		for (int i = 0; i < str.length; i++) {

			char firstChar;
			firstChar = str[i].length() != 0 ? str[i].charAt(0) : ' ';

			str[i] = (firstChar >= 'A' && firstChar <= 'Z' || firstChar >= 'a' && firstChar <= 'z')
					? str[i].toUpperCase().charAt(0) + str[i].toLowerCase().substring(1)
					: (str[i] = firstChar == ' ' ? " " : firstChar + str[i].toLowerCase().substring(1));


			answer += str[i];

			if (i != str.length - 1) {
				answer += " ";
			}


		}

		if (s.charAt(s.length() - 1) == ' ') {
			answer += " ";
		}

		System.out.println(answer);

	}

}
