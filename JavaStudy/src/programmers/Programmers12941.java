package programmers;

import java.util.Arrays;
import java.util.Collections;

/*최솟값 만들기
 * 
 * 길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.

 *  두 수를 곱한 값을 누적하여 더합니다.
 * 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다.
 * 
 * 예를 들어 A = [1, 4, 2] , B = [5, 4, 4] 라면
 * A에서 첫번째 숫자인 1, B에서 첫번째 숫자인 5를 뽑아 곱하여 더합니다. (누적된 값 : 0 + 5(1x5) = 5)
A에서 두번째 숫자인 4, B에서 세번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 5 + 16(4x4) = 21)
A에서 세번째 숫자인 2, B에서 두번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 21 + 8(2x4) = 29)
즉, 이 경우가 최소가 되므로 29를 return 합니다.
 * 
 * */
class Solution {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);

		Integer[] b = new Integer[B.length];

		for (int i = 0; i < b.length; i++) {
			b[i] = B[i];
		}

		Arrays.sort(b, Collections.reverseOrder());

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * b[i];
		}

		return answer;
	}
}
public class Programmers12941 {
	public static void main(String[] args) {
		int[] A = { 1, 4, 2 };
		int[] B = { 5, 4, 4 };
		Solution solution = new Solution();
		System.out.println(solution.solution(A, B));

	}

}
