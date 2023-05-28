package programmers;

import java.util.List;

/*0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.

x의 모든 0을 제거합니다.
x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.

0과 1로 이루어진 문자열 s가 매개변수로 주어집니다.
 s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 
 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.*/

class Solution3 {
	public int[] solution(String s) {
		int[] answer = {};

//		answer = str.size();

		return answer;

	}
}
public class Lessons70129 {

	public static void main(String[] args) {
		Solution3 solution = new Solution3();
		solution.solution("01110");
		String s = "01110";
		List<String> str = List.of(s.split(""));

//		System.out.println(str.toString());
//		List<String> str2 = str.stream().filter(x -> Integer.parseInt(x) == 1).collect(Collectors.toList());
//		long one = str.stream().filter(x -> Integer.parseInt(x) == 1).count();
		int one = str.stream().mapToInt(Integer::parseInt).reduce(0, (number1, number2) -> {
			return number1 + number2;
		});
		int zeroCount = (int) str.stream().filter(x -> Integer.parseInt(x) == 0).count();

//				.forEach(x -> System.out.println(x));
//		System.out.println(str2.toString());
//		System.out.println(str2.size());
		System.out.println(one);
		System.out.println(zeroCount);

		System.out.println("==========");
		
//		int len = str.stream().filter(x -> Integer.parseInt(x) == 1).reduce(0, (number1, number2) -> {
//			return number1 + number2;
//		});
		System.out.println(Math.pow(2, one - 1));

		if (one % 2 != 0) {

		}

	}

}
