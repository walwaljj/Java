package day06;

import java.util.Scanner;

public class Teacher {
	
	String ph;
	String name;
	String maj;
	
	public void showInfo() {
		System.out.println("성 함: "+name);
		System.out.println("전 공: "+maj+" 담당");
		System.out.println("연락처: "+ph);
	}
	public void tiInfo() {

			Scanner sc=new Scanner(System.in);
			
			System.out.println("[성함을 입력하세요.]");
			name=sc.next();//입력후 name에 값을 전달함.
			
			System.out.println("[전공을 입력하세요.]");
			maj=sc.next();
			
			System.out.println("[연락처를 입력하세요.]");
			ph=sc.next();
	}

}
