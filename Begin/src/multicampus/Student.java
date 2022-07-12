package multicampus;
import java.util.*;

/** 학사관리 프로그램에서 사용하는 학생 클래스*/
public class Student {
	int no;
	String name;
	String ph;
	String major;
	
	
	/** 학생 정보를 출력하는 메소드*/
	public void showInfo() {
		System.out.println("학 번: "+no);
		System.out.println("이 름: "+name);
		System.out.println("전 공: "+major);
		System.out.println("연락처: "+ph);
	}
	
	/** 학생 정보를 입력받는 메소드*/
	public void inputInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("[학번을 입력하세요]");
		no=sc.nextInt();
		
		System.out.println("[이름을 입력하세요]");
		name=sc.next();//입력후 name에 값을 전달함.
		
		System.out.println("[전공을 입력하세요]");
		major=sc.next();
		
		System.out.println("[연락처를 입력하세요]");
		ph=sc.next();
	}

	
		
	}

		

	

