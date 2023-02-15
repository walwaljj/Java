package programmers;

/*
 * s에 () 와 같이 올바른 괄호가 아니라면 false를 반환하기
 * */
class Solution2 {
	boolean solution(String s) {
		boolean answer = true;

		while (answer) {
			s = s.replace("()", "");
			if (s.indexOf("()") == -1 && (s.length() != 0 || s.length() % 2 == 1)) {
				answer = false;
			} else if (s.length() == 0) {
				break;
			}
		}

		return answer;
	}
}
public class Programmers {

	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		System.out.println(solution.solution("()("));

	}

}
