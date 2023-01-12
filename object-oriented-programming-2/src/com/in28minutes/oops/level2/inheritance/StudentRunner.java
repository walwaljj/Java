package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("wal");
//		student.setEmail("wal@gmail.com");
//
//		Person person = new Person();
//
//		person.setName("wal");
//		person.setEmail("wal@gmail.com");
//		person.setPhoneNumber("123-456-789");
//
//		String value = person.toString();
//		System.out.println(value);
//		System.out.println(person);

		Employee employee = new Employee("walwal", "programmer Analyst");
//		employee.setName("wal");
		employee.setEmail("wal@gmail.com");
		employee.setPhoneNumber("123-456-789");
		employee.setEmployeeGrade('a');
//		employee.setTitle("programmer Analyst");

		System.out.println(employee);
	}

}
