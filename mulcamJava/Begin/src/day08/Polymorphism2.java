package day08;

public class Polymorphism2 {

	public static void main(String[] args) {
		System.out.println("1.-----------------");//부모타입으로 선언 , 부모타입으로 생성
		Super sp=new Super();
		System.out.println("sp.a="+sp.a);//10
		System.out.println("sp.b="+sp.b);//20
		sp.func();//func()****
		
		System.out.println("2.-----------------");//자식타입으로 선언, 자식타입으로 생성 
		Sub sb=new Sub();
		System.out.println("sb.a="+sb.a);//"func()@@@"10
		System.out.println("sb.b="+sb.b);//30
		System.out.println("sb.c="+sb.c);//40
		sb.func();//오버라이딩한 매소드가 우선호출된다.
		System.out.println(sb.func(100));
		
		System.out.println("3.-----------------");//슈퍼클래스로 선언 , 자식타입으로 객체생성
		Super ss=new Sub();
		System.out.println("ss.a="+ss.a);
		System.out.println("ss.b="+ss.b);
		//System.out.println("ss.c="+ss.c); //부모타입으로 선언하고 자식의 고유한 ..로 접근불가.
		ss.func();
		//System.out.println(ss.func(200));
	}

}
