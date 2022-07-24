package test7_1min;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList <Student> list=new ArrayList<>();
		
		list.add(new Student(1,"정수현"));
		list.add(new Student(2,"정"));
		list.add(new Student(3,"현"));
		for(int i = 0; i<list.size();i++) {
			Student s = list.get(i);
			s.showStudentInfo();
		}
	}

}
