package multicampus;

import java.util.Scanner;

public class Teacher {
	int no;//교번
	String name;//이름
	String subject;//담당과목
	String ph;//연락처
	
	//showInfo()
	
	//inputInfo()
	public void showInfo() {
		System.out.println("교 번: "+no);
		System.out.println("이 름: "+name);
		System.out.println("과 목: "+subject);
		System.out.println("연락처: "+ph);
	}
	
	/** 학생 정보를 입력받는 메소드*/
	public void inputInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("[교번을 입력하세요]");
		no=sc.nextInt();
		
		System.out.println("[이름을 입력하세요]");
		name=sc.next();//입력후 name에 값을 전달함.
		
		System.out.println("[과목을 입력하세요]");
		subject=sc.next();
		
		System.out.println("[연락처를 입력하세요]");
		ph=sc.next();
	}
}
