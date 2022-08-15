package test13;

import java.util.*;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s+" "));
		System.out.println();
		sList.stream().filter(c ->c.length() > 5).forEach(s ->System.out.println(s+" "));
		
	}

}
