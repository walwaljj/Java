package programmers;

import java.util.Arrays;

public class Lessons12932 {
    public int[] solution(long n) {
		int[] answer = {};
		int[] copyArr = new int[10];
		long num = 0;

		for (int i = 0; n != 0; i++) {

			num = n % 10;

			copyArr[i] = (int) num;

        	n/=10;

			answer = Arrays.copyOf(copyArr, i + 1);

        }

        return answer;
    }
	
	
	public static void main(String[] args) {
		Lessons12932 lessons = new Lessons12932();
		lessons.solution(12345);

	}
}

