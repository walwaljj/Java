package com.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		printWithFP(list);
		System.out.println("------------");
		printBasic(list);
		System.out.println("------------");
		printWithFPWithFiltering(list);

		List<Integer> list2 = List.of(1, 2, 3, 4, 5);
		System.out.println("------------");
		printInteger(list2);
		System.out.println("------------");
		printNumber1(list2);
		System.out.println("------------");
		printNumber2(list2);

	}


	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()
		.filter(element -> element.endsWith("at"))
			.forEach(element -> System.out.println(element));
	}

	private static void printInteger(List<Integer> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

	private static void printNumber1(List<Integer> list) {
		list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
	}

	private static void printNumber2(List<Integer> list) {
		list.stream().filter(i -> i % 2 == 1).forEach(i -> System.out.println(i));
	}
}
