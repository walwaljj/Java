package test12_1;

import java.util.*;

public class StudentTest {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		
		set.add(new Student("100","홍길동"));
		set.add(new Student("200","강감찬"));
		set.add(new Student("300","이순신"));
		
		System.out.println(set);
	}

}
