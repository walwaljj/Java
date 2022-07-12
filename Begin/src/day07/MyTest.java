package day07;

public class MyTest {

	public static void main(String[] args) {
		//mydemo cls 의 변수 x , y 값을 출력하기
		
		System.out.println("MyDemo.y:" +MyDemo.y);
		MyDemo md=new MyDemo();
		System.out.println("md.x: "+md.x);

		//foo(),bar() 메소드 호출하기/
		MyDemo.foo();
		
		md.bar();
		
		//String m=md.star();
		String m1=md.snail();
		System.out.println(m1);
		
		String m2=md.star(3);
		System.out.println(m2);
		System.out.println(md.star(5));
		
	}

}
