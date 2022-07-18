package day11;

public class InnerClassTest {

	public static void main(String[] args) {
		System.out.println("---문제 1.---");
		//1) Outer클래스의 a,b변수값을 출력하세요
		
		Outer o = new Outer();
		System.out.println(o.a);
		System.out.println(Outer.b);
		
		
		System.out.println("---문제 2.---");
		//2) Inner클래스의 c변수값 출력하고 sub()메소드 호출하기
		
		
		//먼저 아우터 클래스생성해준다. 그 다음 이너클래스를 호출한다.
		Outer oi = new Outer();
		Outer.Inner oii=oi.new Inner();
		//위 두 생성자를 합쳐 구현가능하다.
		//Outer.Inner oi2=new Outer().new Inner();
		System.out.println(oii.c);
		oii.sub();
		
		
		System.out.println("---문제 3.---");
		//3) SInner클래스의 d 출력
		//	foo(), bar()호출하기

		Outer.SInner os=new Outer.SInner();
		
		//non static
		System.out.println(os.d);
		os.foo();
		
		//static
		System.out.println(Outer.SInner.e);
		Outer.SInner.bar();
		
		
		
		

		
		


	}

}
