package programmers;

public class lessons12925 {

	public static void main(String[] args) {
		/*
		 * 예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다. str은 부호(+,-)와 숫자로만
		 * 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
		 **/
		String s = "-5555";
		int answer = 0;
		int calc = 1;

		if (s.charAt(0) == '-' || s.charAt(0) == '+') {
			calc = s.charAt(0) == '-' ? -1 : 1;
			s = s.substring(1);
		}

		for (int i = 0; i < s.length(); i++) {
			answer += (s.charAt(i) - '0') * Math.pow(10, s.length() - i - 1);
		}
		System.out.println(calc);
		System.out.println(answer * calc);

//		System.out.println(Integer.parseInt(s));
	}

}
