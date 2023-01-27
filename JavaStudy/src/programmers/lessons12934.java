package programmers;

import java.util.Scanner;

public class lessons12934 {
	// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();

		int b = (int) Math.sqrt(a);

		long answer = 0;

		answer = a == (long) (Math.pow(b, 2)) ? (long) (Math.pow(b + 1, 2)) : -1;

		System.out.println(answer);

	}

}
