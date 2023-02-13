package programmers;

public class Programmers12977 {

	public static void main(String[] args) {
		/*
		 * 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질
		 * 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를
		 * 완성해주세요.
		 */
		/*
		 * nums result [1,2,3,4] 1 [1,2,7,6,4] 4
		 */
		int[] nums;
		int answer = -1;
		int num = 50;
		// 소수구하기 : 1과 자신의 수 제외하고 떨어지지않는 수, 나머지가 생기는 수
		int prime = 2;
		while (prime > num) {
			if (num % prime == 0) {
				System.out.println(prime);
			} else {
				prime++;
			}

		}
	}

}
