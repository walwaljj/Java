package day11;
import java.util.*;
import day10.Student;
public class ObjectTest {

	public static void main(String[] args) {
		//java.lang.Object 클래스 : 모든 클래스의 부모, 모든클래스는 extends 되고있다.
		
		Object o1=new Object();
		Object o2=new Object();
		
		System.out.println("o1 : "+o1);
		//toString()메서드는 해당 객체에 대한 정보를 문자열로 반환한다.
		//재정의 하지 않았다면 : 클래스이름@해시코드 반환.
		System.out.println("o1.toString : "+o1.toString());
		System.out.println("-----------------------------");
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		//String class에서는 toString()을 오버라이드 하고있다. => 자식고유의 재정의한 메소드기때문에..!
		System.out.println(s1);
		System.out.println("s1.toString : "+s1.toString());
		System.out.println("-----------------------------");
		
		Date d1=new Date();
		System.out.println(d1);
		System.out.println("-----------------------------");
		
		Student st1=new Student(100,"김학생");
		Student st2=new Student(101,"복학생");
		Student st3=st2;
		Student st4=new Student(101,"복학생");
		System.out.println(st1);
		
		// == : 기본 자료형일때 값을 비교, 참조형일 때는 주소값을 비교한다.
		System.out.println("st1==st2: "+(st1==st2));
		System.out.println("st3==st2: "+(st3==st2));
		
		//Object 클래스의 equals()메서드 : 주소값을 비교하여 같으면 true반환
		System.out.println("st1.equals(st2): "+st1.equals(st2));
		System.out.println("st3.equals(st2): "+st3.equals(st2));
		
		//st4,st2 equals() 비교해보기
		System.out.println("st4.equals(st2): "+st4.equals(st2));
		
		//Student 클래스에서 equals()메서드를 오버라이드 하기
		//id값과 name값이 같으면 true를 반환하도록 재정의하기.==> day10일차에 재정의완료.!
		System.out.println("---------String class-----------");
		//리터럴방식 : 값을 직접 할당함.
		String a1="Hello";//리터럴 풀 메모리
		String a2="Hello";//리터럴 풀 메모리
		String a3=new String("Hello");//heap메모리 new 인스턴스
		String a4=new String("Hello");//heap메모리 new 인스턴스
		
		//== 연산자는 주소값을 비교한다
		System.out.println("a1==a2 : "+(a1==a2));//풀 메모리 == 풀메모리
		System.out.println("a1==a3 : "+(a1==a3));//리터럴 풀 과 heap메모리 때문에 다름
		System.out.println("a3==a4 : "+(a3==a4));//서로다른new 객체기 때문에 같을 수 없다.
		//equals 는 String유형으로 문자열의 내용을 비교한다.
		System.out.println("a1.equals(a2): "+a1.equals(a2));//문자열을 비교했기 때문에 전부 true
		System.out.println("a1.equals(a3): "+a1.equals(a3));
		System.out.println("a3.equals(a4): "+a3.equals(a4));
		
		
		
		
		
	}

}
