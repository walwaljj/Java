package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner2 {

	public static void main(String[] args) {
		IntStream.range(1, 11).map(x -> x * x).forEach(x -> System.out.println(x));

		List<String> list = List.of("Apple", "Ant", "Bat");

		list.stream().map(x -> x.toLowerCase()).forEach(x -> System.out.println(x));
		list.stream().forEach(x -> System.out.println(x.length()));


	}

}
