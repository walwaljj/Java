package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student1.getId(), student2.getId());
	}

}

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return Integer.compare(student1.getId(), student2.getId());
	}

}
public class StudentsCollectionRunner {

	public static void main(String[] args) {


		List<Student> students = List.of(new Student(1, "d"), new Student(100, "f"), new Student(10, "g"));

		System.out.println(students);

		List<Student> studentsAl = new ArrayList<>(students);

		Collections.sort(studentsAl);// extends Comparable 인터페이스를 구현하지 않으면 사용할 수 없다,

		System.out.println(studentsAl);

		Collections.sort(studentsAl, new DescendingStudentComparator());//studentsAl.sort(new DescendingStudentComparator()); 와 같음.

		System.out.println("DescendingStudentComparator" + studentsAl);

		

	}

}
