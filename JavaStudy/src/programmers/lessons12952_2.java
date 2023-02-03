package programmers;

public class lessons12952_2 {

	public static void main(String[] args) {
		/*
		 * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는
		 * 이어지는 알파벳은 소문자로 쓰면 됩니다. "3people unFollowed me" "3people Unfollowed Me"
		 * "for the last week" "For The Last Week"
		 */

		String s = "   FFOr     the last week   ";
		String answer = "";
		s = s.toLowerCase();
		
		char[] ch = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {

			ch[i] = s.charAt(i);
			ch[0] = s.toUpperCase().charAt(i);
			
			if (ch[i] == ' ') {

				if (i != s.length() - 1) {
					ch[i + 1] = s.toUpperCase().charAt(i + 1);
					answer += " ";
					i++;
				} else {
					answer += " ";
				}

			}

			answer += ch[i];

		}
		System.out.println(answer);

	}

}
