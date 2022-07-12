package day06;

import java.util.*;

public class Staff {
	
	
	String ph;
	String name;
	String day;
	
	public void showInfo() {
		System.out.println("성 함: "+name);
		System.out.println("입사일: "+day);
		System.out.println("연락처: "+ph);
	}
	public void stInfo() {

			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("[성함을 입력하세요.]");
			name=sc.next();//입력후 name에 값을 전달함.
			
			System.out.println("[입사일을 입력하세요.]");
			day=sc.next();
			
			System.out.println("[연락처를 입력하세요.]");
			ph=sc.next();
	}

}
