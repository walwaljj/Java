package day08;
//상속성 : Inheritance
/* 부모 클래스 
 * 
 * 자식 클래스 extends 부모클래스
 * 
 * 		=> 부모가,, 상속해주면 ,, 자식이,,물려받고 맘대로쓸수있자나,..
 * 
 * 상속은 "is a " 관계가 성립해야 한다.
 * 
 * 자바는 1개의 클래스만 상속받을 수 있다.(단일 상속)
 * 	
 * 
 */


public class Inheritance {

	public static void main(String[] args) {
		
		
		
		//h1의 정보 출력하기
		Human h1=new Human("홍길동",177);
		String h=h1.getInfo();
		System.out.println(h);
		
		
		Human h2=new Human();
		String hh=h2.getInfo();
		System.out.println(hh);
		
		//Superman s1=new Superman("슈퍼맨",180);
		//String s=s1.getInfo();
		//System.out.println(s.getInfo);
		

		Aquaman a1=new Aquaman("아쿠아맨",178,111);
		String a=a1.getInfo();
		System.out.println(a);
		
		Aquaman a2=new Aquaman();
		a2.name="김아쿠아";
		a2.height=175;
		a2.speed=101;
		System.out.println(a2.getInfo());
		
		
		
		//슈퍼맨 객체 1개 더 생성해서 이름, 키, 초능력 주고
		Superman s1=new Superman();
		s1.name="김슈퍼";
		s1.height=180;
		s1.power=500;
		System.out.println(s1.getInfo());
		
		
		
		//제목을 가진 슈퍼맨 정보 출력하기
		
		
		Superman s2=new Superman("울트라 슈퍼맨", 166,2000);
		s2.getInfo("===슈퍼맨 파워 다운===",-500);
		
		
		//초능력을 100충전해서 출력하기
		Superman s3=new Superman();//
		s3.getInfo("===슈퍼맨 파워 업===",100);
		
		

	}

}
