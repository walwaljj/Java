package com.in28minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
//		numbers.stream().forEach(x -> System.out.println(x));

		int sum = normalSum(numbers);

		System.out.println(sum);
		System.out.println("------------------");

		int sum2 = fpSUm(numbers);
		System.out.println(sum2);
	}

	// functional programming (함수형 프로그래밍) : 무엇을 할 것인지 ? 변수의 변이를 피함.
	private static int fpSUm(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> {
									// ㄴ base 숫자 ㄴ 매개변수		
			System.out.println(number1 + " " + number2);
			//	num1 = 0 , num2 = 4 -> 4
			// num1 = 4 , num2 = 6 -> 10
			// num1 = 10 , num2 = 13 -> 23  ... 순서인듯?
			return number1 + number2; });
					//ㄴ 숫자의 쌍을 더함. / 단일 코드면 { return ~~ ; } 생략 가능.
	}

	// procedure programming (절차적 프로그래밍) : 무엇을 어떻게 할 것인지 ? 변수의 변이가 이렁남.
	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;// 변이(mutation) . sum 의 값이 계속해서 변함.
		}
		return sum;
	}
}
