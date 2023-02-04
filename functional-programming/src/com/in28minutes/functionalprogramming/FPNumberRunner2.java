package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunner2 {

	public static void main(String[] args) {
		IntStream.range(1, 11).map(x -> x * x).forEach(x -> System.out.println(x));

		List<String> list = List.of("Apple", "Ant", "Bat");

		list.stream().map(x -> x.toLowerCase()).forEach(x -> System.out.println(x));
		list.stream().forEach(x -> System.out.println(x.length()));

		List<Integer> list2 = List.of(23, 12, 34, 53);

		list2.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
		System.out.println(list2.stream().filter(n -> n % 2 == 1).collect(Collectors.toList()));

		System.out.println(list2.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));

		System.out.println(IntStream.range(1, 11).map(x -> x * x).boxed().collect(Collectors.toList()));
	}

}
