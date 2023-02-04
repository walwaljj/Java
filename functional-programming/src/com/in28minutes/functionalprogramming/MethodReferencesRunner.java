package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {


		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));
		System.out.println("-----------");
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(System.out::println);
					//	클레스 부분  //	메서드
		System.out.println("-----------");
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferencesRunner::print);// forEach(s -> MethodReferencesRunner.print(s))
		
		System.out.println("-----------");
		Integer max = List.of(23,45,67,34).stream()
							.filter(n -> n % 2 == 0)
							.max((n1,n2) -> Integer.compare(n1, n2))
							.orElse(0);// Default 값을 0으로.
		System.out.println(max);
		
		System.out.println("-----------");
		Integer max2 = List.of(23,45,67,34).stream()
				.filter(MethodReferencesRunner::isEven)
				.max(MethodReferencesRunner::numCompare)// == Integer::compare
							.orElse(0);// Default 값을 0으로.
		System.out.println(max2);
	}

	public static boolean isEven(Integer integer) {
		return integer % 2 == 0;
	}

	public static Integer numCompare(Integer integer1, Integer integer2) {
		return Integer.compare(integer1, integer2);
	}

}
