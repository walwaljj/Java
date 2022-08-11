package collection.treeset;


import java.util.*;

class MyCompare implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		return(s1.compareTo(s2))+-1;
	}
}


public class ComparatorTest {//comparator를 이미 구현했으나 , 내림차순도 사용해야할경우 이렇게한다!

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new MyCompare());
		// new MyCompare을 생성자 안에 넣어 내림차순으로재정의된 compare대로 출력.
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		System.out.println(set);
	}

}
