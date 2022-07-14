package day09;
interface Inter1{
	void a();
	
}/////////////////////
interface Inter2{
	String b();
}/////////////////////

abstract class AbsClass{////추상클레스
	abstract void c();
}/////////////////////


//인터페이스가 인터페이스를 상속받을때는 extends,다중상속 가능하다.
interface HisInter extends Inter1, Inter2{
	String STR = "Hello";
	
}/////////////////////////////
//[1] MyClass 2 가 AbsClass 와 HisInter 를 상속받도록 하세요.

public class MyClass2 extends AbsClass implements HisInter {
	
	
	public String b() {
		
		return "b good";
	}
	
	public void a() {
		System.out.println("a good");
	}
	public String STR() {
		
		return STR;
	}
	
	
	@Override
	void c() {System.out.println("c good");}

	public static void main(String[] args) {
		

//[2] MyClass 2 타입의 갹채 생성해서 메서드 가각 호출하고 STR값도 출력해보기.	
		MyClass2 mc=new MyClass2();
		mc.c();
		System.out.println(mc.b());
		mc.a();
		
		HisInter hi =new MyClass2();
		hi.a();
		System.out.println(hi.b());
		System.out.println(HisInter.STR);
		System.out.println(MyClass2.STR);
	

	
//[3] HisInter 타입의 변수 선언하고 MyClass2객체 생성해서 메서드 각각 호출하고 Str 값도 출력해보기
	
//[4] AbsClass 타입의 변수 선언하고 MyClass2객체 생성해서 메서드 각각 호출하고 Str 값도 출력해보기
		AbsClass ac=new MyClass2();
		ac.c();
		((MyClass2)ac).c();
		//ac.a(); [x] ==>형변환 해야한다.
		//ac.b(); [x]
	}


}
