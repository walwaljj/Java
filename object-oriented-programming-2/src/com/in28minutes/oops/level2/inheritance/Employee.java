package com.in28minutes.oops.level2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;

	public Employee(String name, String title) {
		// extends 를 통해 생성자에서 첫번째 줄에 super() 가 호출됨.
		super(name);// 사용자가 전달한 name 을 상위 클래스의 생성자 person( name ) 로 전달함.
		this.title = title;
		System.out.println("Employee");
	}
	public BigDecimal getSalary() {
		return salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "#" + title + "#" + employerName + "#" + employeeGrade;
	}

}
