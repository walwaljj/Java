package day06;
import java.util.*;
import day06.SchoolApp;

public class Student {
	
	String ph;
	String name;
	String cls;
	int grd;
	
	public void showInfo() {

		System.out.println("이 름: "+name);
		System.out.println("학 년: "+grd+" 학년");
		System.out.println(" 반 : "+cls+" 반");
		System.out.println("연락처: "+ph);
	}
	public void stiInfo() {
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("[이름을 입력하세요.]");
			name=sc.next();//입력후 name에 값을 전달함.
			
			System.out.println("[몇 학년 인가요?]");
			grd=sc.nextInt();
			
			System.out.println("[몇 반 인가요?]");
			cls=sc.next();
			
			System.out.println("[연락처를 입력하세요.]");
			ph=sc.next();
	}

}
