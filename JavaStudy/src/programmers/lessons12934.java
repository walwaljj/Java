package programmers;

import java.util.Scanner;

public class lessons12934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();

		int b = (int) Math.sqrt(a);

		long answer = 0;

		answer = a == (long) (Math.pow(b, 2)) ? (long) (Math.pow(b + 1, 2)) : -1;

		System.out.println(answer);

	}

}
